package org.learn.tests;

import org.learn.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseTest {

    protected BaseTest(){}

    @BeforeMethod
    protected void setup() throws Exception {
        Driver.initDriver();
    }

    @AfterMethod
    protected void teardown()
    {
        Driver.quitdriver();
    }


}
