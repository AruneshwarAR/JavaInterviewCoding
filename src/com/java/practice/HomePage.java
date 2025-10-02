package com.java.practice;

public class HomePage {

    // A method to simulate a verification on the Home Page.
    public void verifyUserIsOnHomePage() {
        System.out.println("VERIFICATION: Successfully landed on the Home Page.");
    }

    // Another action the user could take from the Home Page.
    public void addItemToCart(String itemName) {
        System.out.println("ACTION: Adding '" + itemName + "' to the cart.");
    }
}