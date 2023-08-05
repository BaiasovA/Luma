package lumaQA;

import com.github.javafaker.Faker;
import org.example.selenium.luma_ui.helper.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.example.selenium.luma_ui.enums.RegistrationForm.*;

public class TestCreateAnAccount extends BaseTest {
    Faker faker = new Faker();

    @Test (description = "Login with valid credentials")
    void RegistrationForm(){
        driver.get("https://magento.softwaretestingboard.com/what-is-new.html");

        elementActions.clickTheButton(createAnAccount.clickAnAccountBtn);
        createAnAccount.enterUsername(oskarFirstName.getCredential());
        createAnAccount.enterLastname(oskarLastName.getCredential());
//        elementActions.clickTheButton(createAnAccount.clickSignUpForNewsLetter);
        createAnAccount.enterEmail(oskarEmail.getCredential());
        createAnAccount.enterPassword(oskarPassword.getCredential());
        createAnAccount.enterPasswordConfirm(oskarConfirmPassword.getCredential());
        elementActions.clickTheButton(createAnAccount.clickCreateBtn);

        Assert.assertTrue(createAnAccount.clickAnAccountBtn.isDisplayed());
        Assert.assertEquals(createAnAccount.profileTitle.getText(), "Create New Customer Account");
        Assert.assertEquals(createAnAccount.resultFirstName.getText(), "Oskar");



    }

    @Test
    void resultCreateAccount(){
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");

        Assert.assertEquals(createAnAccount.resultExistAccount.getText(), "There is already an account with this email address. If you are sure that it is your email address, ");


    }

    @Test()
    void loginWithInvalidUsername(){
        driver.get("https://magento.softwaretestingboard.com/what-is-new.html");

        elementActions.clickTheButton(createAnAccount.clickAnAccountBtn);
        createAnAccount.enterUsername(faker.name().username());
        createAnAccount.enterLastname(faker.name().lastName());
//        elementActions.clickTheButton(createAnAccount.clickSignUpForNewsLetter);
        createAnAccount.enterEmail(oskarEmail.getCredential());
        createAnAccount.enterPassword(oskarPassword.getCredential());
        createAnAccount.enterPasswordConfirm(oskarConfirmPassword.getCredential());
        elementActions.clickTheButton(createAnAccount.clickCreateBtn);

    }

    @Test
    void SignIn() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/what-is-new.html");

        elementActions.clickTheButton(signIn.clickSignInBtn);
        signIn.enterSignEmail(oskarEmail.getCredential());
        signIn.enterSignPassword(oskarPassword.getCredential());
        elementActions.clickTheButton(signIn.signInBtn);
        elementActions.clickTheButton(signIn.clickOskarBtn);
        elementActions.clickTheButton(signIn.clickMyAccountBtn);

        WebElement element = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[1]/div[1]/h1/span"));
        String text = element.getText();
        String expectedText = "My Account";
        Assert.assertEquals(text, expectedText);

        if (text.contains("My Account")) {
            System.out.println("Text is present on the page.");
        } else {
            System.out.println("Text is not present on the page.");
        }

        Assert.assertTrue(signIn.resultName.getText().contains("Oskar Baiasov"));
        Assert.assertTrue(signIn.resultSurname.getText().contains("baiasov24@gmail.com"));

//        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]"));
//        String text1 = element1.getText();
//        String expectedText1 = "Contact Information";
//        Assert.assertEquals(text1, expectedText1);
//
//        if (text1.contains("Contact Information")){
//            System.out.println("Contact Information appeared");
//        }else {
//            System.out.println("Not appeared"
//        }
    }

    @Test
    void signInValidCredentials(){
        driver.get("https://magento.softwaretestingboard.com/what-is-new.html");

        elementActions.clickTheButton(signIn.clickSignInBtn);
        signIn.enterSignEmail(faker.internet().emailAddress());
        signIn.enterSignPassword(faker.internet().password());
        elementActions.clickTheButton(signIn.signInBtn);

//        WebElement element = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div"));
//        String text = element.getText();
//
//        Assert.assertEquals("The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.", text);






    }

    @Test
    void WhatsNew(){
        driver.get("https://magento.softwaretestingboard.com/what-is-new.html");

        elementActions.clickTheButton(whatsNew.clickWhatNewsBtn);

        WebElement element = driver.findElement(By.xpath("//*[@id=\"page-title-heading\"]/span"));
        String text = element.getText();

        // Check the text using assertions
        Assert.assertEquals("What's New", text);

    }

    @Test
    void HoodiesSweetShirts(){
        driver.get("https://magento.softwaretestingboard.com/what-is-new.html");

        elementActions.clickTheButton(hoodiesSweetshirts.clickHoodiesSweetshirtsBtn);
        elementActions.clickTheButton(hoodiesSweetshirts.clickStyleBtn);
        elementActions.clickTheButton(hoodiesSweetshirts.clickSizeBtn);

        List <WebElement> styleList = driver.findElements(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol"));

        for (WebElement element:styleList){
            System.out.println(element.getText());

            System.out.println("----------------------------------");


            List<WebElement> sizeList = driver.findElements(By.xpath("//*[@id=\"narrow-by-list\"]/div[2]"));
            for (WebElement element1: sizeList){
                System.out.println(element1.getText());
            }
        }
    }

    @Test
    void MakeFirstOrder(){
        driver.get("https://magento.softwaretestingboard.com/what-is-new.html");

        elementActions.clickTheButton(makaAnOrder.clickShopNewYogaBtn);
        elementActions.clickTheButton(makaAnOrder.clickMagazine);
        elementActions.clickTheButton(makaAnOrder.clickSizeBtn);
        elementActions.clickTheButton(makaAnOrder.clickColorBtn);
        elementActions.clickTheButton(makaAnOrder.clickAddToCardBtn);
        elementActions.clickTheButton(makaAnOrder.clickBasketBtn);
    }

    @Test
    void checkEdit(){
        driver.get("https://magento.softwaretestingboard.com/customer/account/");

        elementActions.clickTheButton(signIn.clickSignInBtn);
        signIn.enterSignEmail(oskarEmail.getCredential());
        signIn.enterSignPassword(oskarPassword.getCredential());
        elementActions.clickTheButton(signIn.signInBtn);
        elementActions.clickTheButton(signIn.clickOskarBtn);
        elementActions.clickTheButton(signIn.clickMyAccountBtn);
        elementActions.clickTheButton(signIn.clickEdit);
        elementActions.clickTheButton(signIn.clickChangeEmail);
        elementActions.clickTheButton(signIn.clickChangePassword);

        Assert.assertTrue(signIn.clickChangeEmail.isSelected());
        Assert.assertTrue(signIn.clickChangePassword.isSelected());
    }

    @Test
    void checkEditAddress(){
        driver.get("https://magento.softwaretestingboard.com/customer/account/");

        elementActions.clickTheButton(signIn.clickSignInBtn);
        signIn.enterSignEmail(oskarEmail.getCredential());
        signIn.enterSignPassword(oskarPassword.getCredential());
        elementActions.clickTheButton(signIn.signInBtn);
        elementActions.clickTheButton(signIn.clickOskarBtn);
        elementActions.clickTheButton(signIn.clickMyAccountBtn);
        elementActions.clickTheButton(signIn.clickEditAddress);

        signIn.writeCompany(faker.internet().domainWord());
        signIn.writeTelephone(faker.internet().domainName());



    }













}
