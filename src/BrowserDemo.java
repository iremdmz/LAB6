
public class BrowserDemo {

    public static void main(String[] args) {

        BrowserHistory browser = new BrowserHistory();

        // STEP 1: Visit webpages
        browser.visit("google.com");
        browser.visit("youtube.com");
        browser.goBack();

        browser.visit("Facebook.com");
        browser.goBack();

        // STEP 3: Go forward once
        browser.goForward();

        // STEP 4: Visit a new webpage
        browser.visit("stackoverflow.com");

        // STEP 5: Display current page
        browser.displayCurrentPage();

        // STEP 6: Display browser history
        browser.displayHistory();
    }
}
