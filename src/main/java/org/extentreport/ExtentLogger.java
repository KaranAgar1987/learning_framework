package org.extentreport;

public final class ExtentLogger {

    private ExtentLogger(){}

    public static void pass(String message){
        ExtentManager.geExtentTest().pass(message);
    }

    public static void fail(String message){
        ExtentManager.geExtentTest().fail(message);
    }
    public static void skip(String message){
        ExtentManager.geExtentTest().skip(message);
    }

}
