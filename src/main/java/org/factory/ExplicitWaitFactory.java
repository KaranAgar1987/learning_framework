package org.factory;

import org.enums.WaitPattern;
import org.constants.FrameworkConstants;
import org.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitFactory {

    public static WebElement performExplicityWait(By by, WaitPattern patten) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getWebDriver(), FrameworkConstants.getExplicitwaittime());
        WebElement ele = null;
        if(patten == WaitPattern.CLICKABLE) {
            ele = wait.until(ExpectedConditions.elementToBeClickable(by));
        }else if(patten == WaitPattern.VISIBLE) {
            ele = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        }else if(patten == WaitPattern.PRESENT) {
            ele = wait.until(ExpectedConditions.presenceOfElementLocated(by));
        }
        else
        {
            ele = DriverManager.getWebDriver().findElement(by);
        }
        return ele;
    }

}
