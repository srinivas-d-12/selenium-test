package com.test.example;

import org.openqa.selenium.WebDriver;

public class LoginPage extends Page {

    private final String username;
    private final String password;
    private final static String USER_INPUT_ID = "user_login";
    private final static String USER_PASS_ID = "user_pass";
    private final static String SUBMIT_ID = "wp-submit";


    public LoginPage(WebDriver driver, String username, String password, String url) {
        super(driver, url);
        this.username = username;
        this.password = password;

    }

    public void login() {
        passInput(USER_INPUT_ID, username);
        passInput(USER_PASS_ID, password);
        clickButton(SUBMIT_ID);
    }

    // helper functions for unit testing
    public String getUserInputId() {
        return USER_INPUT_ID;
    }

    public String getUserPassId() {
        return USER_PASS_ID;
    }

}
