package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class EmployeeList extends Dashboard{
    By _userClickOnAddEmployee = By.id("menu_pim_addEmployee");
    By _employeeName = By.id("empsearch_employee_name_empName");
    By _HitOutSideOfEmpolyeeName = By.id("//*[@id=\"search_form\"]/fieldset/p");
    By _clickOnTheSearchButton = By.id("searchBtn");
    By _clickOnCheckList = By.id("ohrmList_chkSelectAll");
    By _clickOnDeleteButton = By.id("btnDelete");
    By _clickOkOnAlertBar = By.id("dialogDeleteBtn");



    public void userShouldBeAbleToSeeEmployeeList(){
        typeText(_employeeName,loadProp.getProperty("EmployeeName"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Click on search button
        clickOnElement(_clickOnTheSearchButton);

        // select name of employee
        clickOnElement(_clickOnCheckList);

        // Click on delete button
        clickOnElement(_clickOnDeleteButton);

        //click ok in alert bar
       clickOnElement(_clickOkOnAlertBar);
    }
    public void userNoRecordFound() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td")).getText().equals("No Records Found"));
    }
}
