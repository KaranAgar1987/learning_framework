package org.pages;

import org.enums.WaitPattern;
import org.extentreport.ExtentLogger;
import org.factory.ExplicitWaitFactory;
import org.learn.driver.DriverManager;
import org.openqa.selenium.By;

public class BasePage {

    public void click(By by,String logMessage)
    {

        ExplicitWaitFactory.performExplicityWait(by, WaitPattern.CLICKABLE).click();
        ExtentLogger.pass(logMessage + " is clicked.");
    }

    public void sendKeys(By by,String value, String logMessage)
    {
        ExplicitWaitFactory.performExplicityWait(by, WaitPattern.PRESENT).sendKeys(value);
        ExtentLogger.pass(value + " is passed to " + logMessage);
    }
    public String getTitle(){
        return DriverManager.getWebDriver().getTitle();
    }
}
