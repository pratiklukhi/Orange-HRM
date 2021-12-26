package org.example;

import org.openqa.selenium.By;

public class AddEmployee extends EmployeeInformation{
    By _firstname = By.id("firstName");
    By _lastname = By.id("lastName");
    By _employeeId = By.id("employeeId");
    By _userName = By.id("user_name");
    By _password = By.id("user_password");
    By _confirmPassword = By.id("re_password");


    public void userShouldAbleToFillRequireDetails(){

        // Enter first name
        typeText(_firstname,loadProp.getProperty("firstName"));

        // Enter Last name
        typeText(_lastname,loadProp.getProperty("lastName"));

        // Type Employee ID
        typeText(_employeeId,loadProp.getProperty("employeeId")+currentTimeStamp()+"");

        // click on create login details
        clickOnElement(By.id("chkLogin"));

        // Type Username
        typeText(_userName,loadProp.getProperty("user_name")+currentTimeStamp()+"");

        // Type password
        typeText(_password,loadProp.getProperty("user_password"));

        // Type Confirm password
        typeText(_confirmPassword,loadProp.getProperty("re_password"));

        // Click on Save button
        clickOnElement(By.id("btnSave"));


    }
}
