package com.test.example;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

public class LoginPageTest {

    private static LoginPage page;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
        FirefoxDriver driver = new FirefoxDriver();
        page = new LoginPage(driver, "test", "test",
                "https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
        page.open();
    }

    @Test
    public void testUserInputBoxIsPresentForValidIdentitifier() {
        assertTrue("User Input Text Box is not present ", page.isElementPresentById(page.getUserInputId()));

    }

    @Test(expected = NoSuchElementException.class)
    public void testUserInputBoxIsNotPresentForInValidIdentitifier() {
        page.isElementPresentById("InvalidIdentifier");
    }




}


