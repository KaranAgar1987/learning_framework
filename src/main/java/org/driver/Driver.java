package org.driver;

import org.enums.ConfigProperties;
import org.constants.FrameworkConstants;
import org.utils.ReadPropertyFile;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class Driver{


    private Driver(){}

    public static void initDriver() throws Exception {
        System.out.println(Thread.currentThread().getId() + " : " + DriverManager.getWebDriver());
        if (Objects.isNull(DriverManager.getWebDriver())) {
            System.setProperty("webdriver.chrome.driver", FrameworkConstants.getCROMEDRIVERPATH());
            DriverManager.setWebDriver(new ChromeDriver());
            DriverManager.getWebDriver().get(ReadPropertyFile.getValue(ConfigProperties.URL));
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
