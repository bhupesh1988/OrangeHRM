package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{
    LoadProp loadProp =new LoadProp();
    By _defultlogin = By.id("txtUsername");
    By _defultloginefultPassword = By.id("txtPassword");
    By _userClickOnSubmitButton = By.xpath("//input[@type=\"submit\"]");
    By _validUserName = By.id("txtUsername");
    By _validPassword = By.id("txtPassword");

    public void UserCanAbleToLogingWIthDefultUserNameAndPassword(){
        // user write Default User name
        sendKeyText(_defultlogin,loadProp.getProperty("defaultuserName"));
        // user write Default password
        sendKeyText(_defultloginefultPassword,loadProp.getProperty("defaultpassword"));
        // user click on login button
        click(_userClickOnSubmitButton);
    }
    public void userEnterValidCredentialsInLogInPage(){
        // user write valid username on username
        sendKeyText(_validUserName,loadProp.getProperty("username1"));
       //  user write valid password on password
        sendKeyText(_validPassword,loadProp.getProperty("password1"));
        // user click on login button
        click(_userClickOnSubmitButton);



    }

}
