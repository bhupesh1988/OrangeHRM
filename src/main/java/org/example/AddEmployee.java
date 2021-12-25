package org.example;

import org.openqa.selenium.By;

import javax.swing.*;

public class AddEmployee extends Pim{
    LoadProp loadProp = new LoadProp();
    By _empolyeeFirstName=By.id("firstName");
    By _empolyeeLastName = By.id("lastName");
    By _employeeId =By.id("employeeId");
    By _login=By.id("chkLogin");
    By _username= By.id("user_name");
    By _userPassword= By.id("user_password");
    By _userConfirmPassword =By.id("re_password");
    By _userclickOnSaveButton= By.xpath("//input[@id=\"btnSave\"]");

    public void userCanAddEmployeeDetails(){
        // User Write Empolyee First Name
        sendKeyText(_empolyeeFirstName,loadProp.getProperty("firstName1"));
        // User Write Empolyee Last Name
        sendKeyText(_empolyeeLastName,loadProp.getProperty("lastName1"));
        // User Write Employee Id
        sendKeyText(_employeeId,loadProp.getProperty("emp]ployeeId")+currentTime());
        click(By.id("chkLogin"));
        // User write user name
        sendKeyText(_username,loadProp.getProperty("userName")+currentTime());
        // user write user password
        sendKeyText(_userPassword,loadProp.getProperty("password"));
        //user write confirm password
        sendKeyText(_userConfirmPassword,loadProp.getProperty("confirmPassword"));
        // user click on the save button
        click(_userclickOnSaveButton);
    }

}
