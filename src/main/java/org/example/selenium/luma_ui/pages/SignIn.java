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

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div")
    public WebElement errorrMessage;

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

    //result *****************************************************************************************
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div[1]/div[3]/div[2]/div/div[1]/p")
    public WebElement resultName;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div[1]/div[3]/div[2]/div/div[1]/p")
    public WebElement resultSurname;


    //EditBtn **********************************************************************************
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div[1]/div[3]/div[2]/div/div[2]/a[1]")
    public WebElement clickEdit;

    @FindBy(xpath = "//*[@id=\"change-email\"]")
    public WebElement clickChangeEmail;

    @FindBy(xpath = "//*[@id=\"change-password\"]")
    public WebElement clickChangePassword;

    //EditAddress ***************************************************************************
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div[1]/div[4]/div[2]/div[1]/div[2]/a")
    public WebElement clickEditAddress;

    @FindBy(id = "company")
    public WebElement fillCompany;

    @FindBy(id = "telephone")
    public WebElement fillTelephone;

    public SignIn writeCompany(String userCompany){
        elementActions.writeText(fillCompany, userCompany);
        return this;
    }

    public SignIn writeTelephone(String userTelephone){
        elementActions.writeText(fillTelephone, userTelephone);
        return this;
    }




}
