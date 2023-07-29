package org.example.selenium.luma_ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MakaAnOrder extends BasePage{
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[4]/div[1]/div[1]/div[1]/a/span/span[2]")
    public WebElement clickShopNewYogaBtn;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img")
    public WebElement clickMagazine;

    @FindBy(xpath = "//*[@id=\"option-label-size-143-item-171\"]")
    public WebElement clickSizeBtn;

    @FindBy(xpath = "//*[@id=\"option-label-color-93-item-50\"]")
    public WebElement clickColorBtn;
    @FindBy(id = "product-addtocart-button")
    public WebElement clickAddToCardBtn;

    @FindBy(xpath = "/html/body/div[1]/header/div[2]/div[1]")
    public WebElement clickBasketBtn;
}
