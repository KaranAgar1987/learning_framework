package org.learn.driver;

import org.learn.constants.FrameworkConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class Driver {

    public static WebDriver driver;

    public static void initDriver(){
        if (Objects.isNull(driver)) {
            System.setProperty("webdriver.chrome.driver", FrameworkConstants.getCROMEDRIVERPATH());
            driver = new ChromeDriver();
            driver.get("https://www.google.com/");
        }
    }

    public static void quitdriver()
    {
        if (Objects.nonNull(driver!=null)) {
            driver.quit();
            driver = null;
        }
    }
}
