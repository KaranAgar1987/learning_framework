package org.pages;

import com.google.common.util.concurrent.Uninterruptibles;
import org.extentreport.ExtentLogger;
import org.extentreport.ExtentManager;
import org.extentreport.ExtentReport;
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

            click(lnk_About,"Welcome Link");
            click(lnk_logout,"Logout Link");

            return new OrangeHRMLoginPage();
        }


    }