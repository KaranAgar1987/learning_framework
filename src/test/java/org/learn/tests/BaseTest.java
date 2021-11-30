package org.learn.tests;

import org.learn.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected BaseTest(){}

    @BeforeMethod
    public void setup()
    {
        Driver.initDriver();
    }

    @AfterMethod
    public void teardown()
    {
        Driver.quitdriver();
    }


}
