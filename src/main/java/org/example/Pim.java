package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Pim extends WelcomePage {

    By _userClickOnAddEmployee = By.id("menu_pim_addEmployee");
    By _employeeName = By.id("empsearch_employee_name_empName");
    By _HitOutSideOfEmpolyeeName = By.id("//*[@id=\"search_form\"]/fieldset/p");
    By _clickOnTheSearchButton = By.id("searchBtn");
    By _clickOnCheckList = By.id("ohrmList_chkSelectAll");
    By _clickOnDeleteButton = By.id("btnDelete");
    By _clickOkOnAlartBar = By.id("dialogDeleteBtn");


    public void userClickOnPimFromWelcomePage() {
        click(_userClickOnAddEmployee);
    }

    public void userEnterEmployeeName(){
        // User enter Employee Name
        sendKeyText(_employeeName,loadProp.getProperty("EmpolyeeName"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Hit out side of the employee name
//        click(_HitOutSideOfEmpolyeeName);
        // click on Search Button
        click(_clickOnTheSearchButton);
        // select all the name
        click(_clickOnCheckList);
        //click on Delete button
        click(_clickOnDeleteButton);
        //click ok in alart bar
        click(_clickOkOnAlartBar);

    }
    public void userNoRecordFound(){
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td")).getText().equals("No Records Found"));
    }
}