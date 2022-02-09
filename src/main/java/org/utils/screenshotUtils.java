package org.utils;

import org.driver.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public final class screenshotUtils {
    private screenshotUtils(){}

    public static String getBase64Image(){
        return ((TakesScreenshot) DriverManager.getWebDriver()).getScreenshotAs(OutputType.BASE64);
    }
}
