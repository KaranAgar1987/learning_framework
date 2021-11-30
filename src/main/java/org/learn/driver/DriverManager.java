package org.learn.driver;

import org.openqa.selenium.WebDriver;

public final class DriverManager {

    private DriverManager(){}

    private static ThreadLocal<WebDriver> dr = new ThreadLocal<>();

    public static WebDriver getWebDriver()
    {
        return dr.get();
    }

    public static void setWebDriver(WebDriver ref)
    {
        dr.set(ref);
    }

    public static void unload(){
        dr.remove();
    }

}
