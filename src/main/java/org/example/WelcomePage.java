package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class WelcomePage extends HomePage{


    public void MainPage(){
        // User click on PIM
        click(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b"));

    }
    public void userAtWelcomePage(){
//        Assert.assertTrue(driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/index.php/dashboard"));
        // User Verify That Used As Dashboard After Login
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/h1")).getText().equals("Dashboard"));
    }
}
