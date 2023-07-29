package org.example.selenium.luma_ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class HoodiesSweetshirts extends BasePage{
    @FindBy (xpath = "//*[@id=\"maincontent\"]/div[4]/div[2]/div/div/ul[1]/li[1]/a")
    public WebElement clickHoodiesSweetshirtsBtn;

    @FindBy (xpath = "//*[@id=\"narrow-by-list\"]/div[1]/div[1]")
    public WebElement clickStyleBtn;

    @FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[2]")
    public WebElement clickSizeBtn;
}
