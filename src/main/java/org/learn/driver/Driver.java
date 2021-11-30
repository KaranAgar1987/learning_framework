package org.learn.driver;

import org.learn.constants.FrameworkConstants;
import org.learn.utils.ReadPropertyFile;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Objects;

public class Driver{


    private Driver(){}

    public static void initDriver() throws Exception {
        System.out.println(Thread.currentThread().getId() + " : " + DriverManager.getWebDriver());
        if (Objects.isNull(DriverManager.getWebDriver())) {
            System.setProperty("webdriver.chrome.driver", FrameworkConstants.getCROMEDRIVERPATH());
            DriverManager.setWebDriver(new ChromeDriver());
            DriverManager.getWebDriver().get(ReadPropertyFile.getValue("url"));
        }
    }

    public static void quitdriver()
    {
        if (Objects.nonNull(DriverManager.getWebDriver())) {
            DriverManager.getWebDriver().quit();
            DriverManager.unload();
        }
    }
}
