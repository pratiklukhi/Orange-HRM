package org.example;

import org.openqa.selenium.By;

public class EmployeeInformation extends Dashboard{

    // Add Employee
    public void userShouldAbleToAddEmployee(){
        clickOnElement(By.id("menu_pim_addEmployee"));

    }
}
