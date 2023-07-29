package org.example.selenium.luma_ui.drivers;

import org.example.selenium.luma_ui.config.ConfigReader;
import org.openqa.selenium.WebDriver;

public class Driver {
    private Driver() {
        // Singleton

    }

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null){
            switch (ConfigReader.getProperty("browser").toLowerCase()){
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "firefox":
                    driver = FireFoxWebDriver.loadFireFoxWebDriver();
                    break;
                case "edge":
                    driver = EdgeWebDrivers.loadEdgeWebDriver();
                    break;
                default:
                    throw new IllegalArgumentException("You provided wrong Driver name");
            }
        }
        return driver;
    }

    public static void closeDriver(){
        try {
            if (driver != null){
                driver.close();
                driver.quit();
                driver = null;
            }

        }catch (Exception e){
            System.out.println("Error while closing driver");
        }
    }
}
