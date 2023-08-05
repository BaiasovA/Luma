package org.example.selenium.luma_ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAnAccount extends BasePage{

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[1]/h1/span")
    public WebElement profileTitle;

    @FindBy (xpath = "/html/body/div[1]/header/div[1]/div/ul/li[3]/a")
    public WebElement clickAnAccountBtn;

    @FindBy(id = "firstname")
    public WebElement userName;

    @FindBy(id = "lastname")
    public WebElement userLastName;

    @FindBy(xpath = "//*[@id=\"is_subscribed\"]")
    public WebElement clickSignUpForNewsLetter;

    @FindBy(id = "email_address")
    public WebElement userEmail;

    @FindBy(id = "password")
    public WebElement userPassword;

    @FindBy(id = "password-confirmation")
    public WebElement userPasswordConfirmation;

    @FindBy(xpath = "//*[@id=\"form-validate\"]/div/div[1]/button")
    public WebElement clickCreateBtn;

    public CreateAnAccount enterUsername(String username){
        elementActions.writeText(userName, username);
        return this;
    }

    public CreateAnAccount enterLastname (String userlastname){
        elementActions.writeText(userLastName, userlastname);
        return this;
    }

    public CreateAnAccount enterEmail(String useremail){
        elementActions.writeText(userEmail,useremail);
        return this;
    }
    public CreateAnAccount enterPassword(String userpassword){
        elementActions.writeText(userPassword,userpassword);
        return this;
    }

    public CreateAnAccount enterPasswordConfirm(String userConfirmPassord){
        elementActions.writeText(userPasswordConfirmation,userConfirmPassord);
        return this;
    }

    //result***********************************************************8
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div")
    public WebElement resultExistAccount;

    @FindBy(id = "firstname")
    public WebElement resultFirstName;

}

