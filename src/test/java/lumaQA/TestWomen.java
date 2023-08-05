package lumaQA;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWomen extends BaseTest {
    @Test
    void Women(){
        driver.get("https://magento.softwaretestingboard.com/");

        elementActions.clickTheButton(women.clickWomenBtn);

        WebElement element = driver.findElement(By.xpath("//*[@id=\"page-title-heading\"]/span"));
        String text = element.getText();

        Assert.assertEquals("Women", text);





    }
}
