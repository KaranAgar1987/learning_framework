package org.extentreport;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;

public final class ExtentManager {

    private ExtentManager(){}

    public static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    static ExtentTest geExtentTest()
    {
        return test.get();
    }

    static void setExtentTest(ExtentTest ptest)
    {
        test.set(ptest);
    }

    static void unload(){
        test.remove();
    }

}
