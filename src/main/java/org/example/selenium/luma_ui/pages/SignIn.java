package org.example.selenium.luma_ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn extends BasePage{
    @FindBy(xpath = "/html/body/div[1]/header/div[1]/div/ul/li[2]/a")
    public WebElement clickSignInBtn;

    @FindBy(id = "email")
    public WebElement userEmail;

    @FindBy(xpath = "//*[@id=\"pass\"]")
    public WebElement userPassword;

    @FindBy(id = "send2")
    public WebElement signInBtn;

    public SignIn enterSignEmail(String useremail){
        elementActions.writeText(userEmail, useremail);
        return this;
    }

    public SignIn enterSignPassword(String userpassword){
        elementActions.writeText(userPassword,userpassword);
        return this;
    }

    //My Account  ***************************************************************************************
    @FindBy(xpath = "/html/body/div[1]/header/div[1]/div/ul/li[2]/span")
    public WebElement clickOskarBtn;

    @FindBy(xpath = "/html/body/div[1]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a")
    public WebElement clickMyAccountBtn;


}
