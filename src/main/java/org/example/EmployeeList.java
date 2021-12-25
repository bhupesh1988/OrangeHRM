package org.example;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class EmployeeList extends AddEmployee{

    public void userAtEmployeeList(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // user at EmployeeList
        click(By.id("menu_pim_viewEmployeeList"));
        // user click on welcome
        click(By.id("welcome"));
        // user click on logout
        click(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a"));

    }
}
