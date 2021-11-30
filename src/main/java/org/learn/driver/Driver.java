package org.learn.driver;

import org.learn.constants.FrameworkConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class Driver{

    private static WebDriver drv;

    private Driver(){}

    public static void initDriver(){
        if (Objects.isNull(drv)) {
            System.setProperty("webdriver.chrome.driver", FrameworkConstants.getCROMEDRIVERPATH());
            drv = new ChromeDriver();
            DriverManager.setWebDriver(drv);
            DriverManager.getWebDriver().get("https://www.google.com/");
        }
    }

    public static void quitdriver()
    {
        if (Objects.nonNull(DriverManager.getWebDriver())) {
            DriverManager.getWebDriver().close();
            DriverManager.getWebDriver().quit();
            DriverManager.unload();
        }
    }
}
