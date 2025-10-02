package com.java.practice;

public class LoginPage {

    // --- Private Locators (Encapsulation) ---
    // In a real framework, these would be By objects, e.g., private By usernameField = By.id("user-name");
    private String usernameLocator = "user-name";
    private String passwordLocator = "password";
    private String loginButtonLocator = "login-button";


    // --- Private Action Methods ---
    // These methods are specific to this page and are kept private.
    private void enterUsername(String username) {
        System.out.println("ACTION: Typing '" + username + "' into element: " + usernameLocator);
    }

    private void enterPassword(String password) {
        System.out.println("ACTION: Typing '" + password + "' into element: " + passwordLocator);
    }

    private void clickLoginButton() {
        System.out.println("ACTION: Clicking element: " + loginButtonLocator);
        System.out.println("-------------------------------------------");
    }


    // --- Public Service Method with METHOD CHAINING ---
    /**
     * This method performs a full login and returns the next page.
     * @param username The username for login.
     * @param password The password for login.
     * @return A new HomePage object, representing the page we land on.
     */
    public HomePage loginSuccessfully(String username, String password) {
        System.out.println("--- Starting Login Process ---");
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
        
        // This is the key to method chaining.
        // After the login action is complete, we are on the HomePage.
        // So, we create and return an object of that page.
        return new HomePage();
    }
}