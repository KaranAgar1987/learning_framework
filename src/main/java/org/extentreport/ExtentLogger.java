package org.extentreport;

import com.aventstack.extentreports.MediaEntityBuilder;
import org.driver.DriverManager;
import org.enums.ConfigProperties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.utils.ReadPropertyFile;
import org.utils.screenshotUtils;

public final class ExtentLogger {

    private ExtentLogger(){}

    public static void pass(String message){
        ExtentManager.geExtentTest().pass(message);
    }

    public static void fail(String message){
        ExtentManager.geExtentTest().fail(message);
    }
    public static void skip(String message){
        ExtentManager.geExtentTest().skip(message);
    }

    public static void pass(String message, boolean isScreenshotNeeded) throws Exception {
        if (ReadPropertyFile.getValue(ConfigProperties.PASSEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes")
                && isScreenshotNeeded){
            ExtentManager.geExtentTest().pass(message, MediaEntityBuilder.createScreenCaptureFromBase64String(screenshotUtils.getBase64Image()).build());
        }else{
            ExtentLogger.pass(message);
        }

    }
    public static void fail(String message, boolean isScreenshotNeeded) throws Exception {
        if (ReadPropertyFile.getValue(ConfigProperties.FAILEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes")
                && isScreenshotNeeded){
            ExtentManager.geExtentTest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(screenshotUtils.getBase64Image()).build());
        }else{
            ExtentLogger.fail(message);
        }

    }public static void skip(String message, boolean isScreenshotNeeded) throws Exception {
        if (ReadPropertyFile.getValue(ConfigProperties.SKIPPEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes")
                && isScreenshotNeeded){
            ExtentManager.geExtentTest().skip(message, MediaEntityBuilder.createScreenCaptureFromBase64String(screenshotUtils.getBase64Image()).build());
        }else{
            ExtentLogger.skip(message);
        }

    }

}
