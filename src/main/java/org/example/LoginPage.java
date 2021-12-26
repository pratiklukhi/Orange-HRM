package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils{

    LoadProp loadProp = new LoadProp();

    // Enter username and password
    By _username = By.id("txtUsername");
    By _password = By.id("txtPassword");


    public void userShouldAbleToLoginWithValidUserNameAndPassword(){

        // Type username
        typeText(_username,loadProp.getProperty("username"));

        // Type password
        typeText(_password,loadProp.getProperty("password"));

        // Click on login button
        clickOnElement(By.id("btnLogin"));

    }
    public void userEnterValidCradentials() {

        // Employee's username
        typeText(By.id("txtUsername"), "Joseph12");

        // Employee's password
        typeText(By.id("txtPassword"), "12345678");

        // Click on login
        clickOnElement(By.id("btnLogin"));
    }
}
