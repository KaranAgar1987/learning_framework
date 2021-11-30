package org.learn.tests;

import org.learn.driver.Driver;
import org.learn.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public final class LoginpageTests extends BaseTest{


    private LoginpageTests(){}

    @Test
    public void test2()
    {

        DriverManager.getWebDriver().findElement(By.name("q")).sendKeys("Automation", Keys.ENTER);
    }

}
