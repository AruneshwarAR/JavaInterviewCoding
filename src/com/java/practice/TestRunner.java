package com.java.practice;

public class TestRunner {
    public static void main(String[] args) {

        // 1. We start our test on the Login Page.
        LoginPage loginPage = new LoginPage();
        
        // 2. We call the login method. This method performs all the login steps
        // AND returns a fully initialized HomePage object for us to use next.
        // This single line of code is clean, readable, and describes the user journey.
        HomePage homePage = loginPage.loginSuccessfully("standard_user", "secret_sauce");
        
        // 3. Because the previous step gave us a HomePage object,
        // we can immediately start using it to perform verifications and actions on that page.
        homePage.verifyUserIsOnHomePage();
        homePage.addItemToCart("Sauce Labs Backpack");
    }
}
