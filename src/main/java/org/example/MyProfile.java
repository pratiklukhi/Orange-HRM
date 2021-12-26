package org.example;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class MyProfile extends AddEmployee{

    public void userShouldAbleToViewProfile(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        clickOnElement(By.id("menu_pim_viewEmployeeList"));


        // Click on Profile icon
        clickOnElement(By.id("welcome"));

        // Click on Logout
        clickOnElement(By.xpath("//a[@href=\"/index.php/auth/logout\"]"));
    }

}
