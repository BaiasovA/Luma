package lumaQA;

import org.example.selenium.luma_ui.drivers.Driver;
import org.example.selenium.luma_ui.helper.ElementActions;
import org.example.selenium.luma_ui.pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {
    public WebDriver driver;
    public ElementActions elementActions;
    public CreateAnAccount createAnAccount;
    public SignIn signIn;
    public WhatsNew whatsNew;
    public HoodiesSweetshirts hoodiesSweetshirts;

    public MakaAnOrder makaAnOrder;

    @BeforeClass
    public void setUpBrowser() {
        driver = Driver.getDriver();
        elementActions = new ElementActions();
        createAnAccount = new CreateAnAccount();
        signIn = new SignIn();
        whatsNew = new WhatsNew();
        hoodiesSweetshirts = new HoodiesSweetshirts();
        makaAnOrder = new MakaAnOrder();
    }


//    @AfterClass
//    public void tearDown(){
//      Driver.closeDriver();
//    }

}
