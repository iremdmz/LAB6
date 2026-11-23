
public class BrowserHistory {

    private Stack backStack;
    private Stack forwardStack;
    private String currentPage;

    public BrowserHistory() {
        backStack = new Stack();
        forwardStack = new Stack();
        currentPage = null;
    }

    // STEP 1: Visit a new webpage
    public void visit(String url) {
        if (currentPage != null) {
            backStack.push(currentPage);
        }

        currentPage = url;
        clearStack(forwardStack);

        System.out.println("Visited: " + currentPage);
    }

    // STEP 2: Go back
    public void goBack() {
        if (backStack.isEmpty()) {
            System.out.println("Cannot go back!");
            return;
        }

        forwardStack.push(currentPage);
        currentPage = backStack.pop();

        System.out.println("Went back to: " + currentPage);
    }

    // STEP 3: Go forward
    public void goForward() {
        if (forwardStack.isEmpty()) {
            System.out.println("Cannot go forward!");
            return;
        }

        backStack.push(currentPage);
        currentPage = forwardStack.pop();

        System.out.println("Went forward to: " + currentPage);
    }

    // STEP 4: Display current page
    public void displayCurrentPage() {
        if (currentPage == null) {
            System.out.println("No page is open.");
        } else {
            System.out.println("Current page: " + currentPage);
        }
    }

    // STEP 5: Clear a stack
    private void clearStack(Stack stack) {
        while (!stack.isEmpty()) {
            stack.pop();
        }
    }

    // STEP 6: Display browser history
    public void displayHistory() {
        System.out.println("\n========== BROWSER HISTORY ==========");

        System.out.println("Current page: " + currentPage);

        System.out.print("Back stack (top -> bottom): ");
        backStack.display();

        System.out.print("Forward stack (top -> bottom): ");
        forwardStack.display();

        System.out.println("=====================================");
    }
}
