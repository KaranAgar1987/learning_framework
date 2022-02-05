package org.pages;

import org.enums.WaitPattern;
import org.factory.ExplicitWaitFactory;
import org.learn.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public void click(By by)
    {
        ExplicitWaitFactory.performExplicityWait(by, WaitPattern.CLICKABLE).click();
    }

    public void sendKeys(By by,String value)
    {
        ExplicitWaitFactory.performExplicityWait(by, WaitPattern.PRESENT).sendKeys(value);
    }
    public String getTitle(){
        return DriverManager.getWebDriver().getTitle();
    }
}
