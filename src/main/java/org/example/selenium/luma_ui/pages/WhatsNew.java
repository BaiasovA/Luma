package org.example.selenium.luma_ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WhatsNew extends BasePage{
    @FindBy(xpath = "//*[@id=\"ui-id-3\"]")
    public WebElement clickWhatNewsBtn;

    @FindBy(id = "page-title-wrapper")
    public WebElement mainText;


}
