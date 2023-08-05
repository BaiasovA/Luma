package org.example.selenium.luma_ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Women extends BasePage{
    @FindBy(xpath = "//*[@id=\"ui-id-4\"]")
    public WebElement clickWomenBtn;
}
