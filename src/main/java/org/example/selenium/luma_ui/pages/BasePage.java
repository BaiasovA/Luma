package org.example.selenium.luma_ui.pages;

import com.github.javafaker.Faker;
import org.example.selenium.luma_ui.drivers.Driver;
import org.example.selenium.luma_ui.helper.ElementActions;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    Faker faker = new Faker();
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public ElementActions elementActions = new ElementActions();
}
