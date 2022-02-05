package org.pages;

import com.google.common.util.concurrent.Uninterruptibles;
import org.learn.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class OrangeHRMHomePage extends BasePage{

        private final By lnk_About = By.id("welcome");
        private final By lnk_logout = By.xpath("//a[text()='Logout']");

        public OrangeHRMLoginPage click_logout() {
            //DriverManager.getWebDriver().findElement(lnk_About).click();
            //Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
            //WebDriverWait wait = new WebDriverWait(DriverManager.getWebDriver(),10);
            ////wait.until(ExpectedConditions.elementToBeClickable(lnk_logout));
            //wait.until(e -> e.findElement(lnk_logout).isEnabled());
            //DriverManager.getWebDriver().findElement(lnk_logout).click();

            click(lnk_About);
            click(lnk_logout);
            return new OrangeHRMLoginPage();
        }


    }