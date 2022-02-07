package org.Listeners;

import lombok.SneakyThrows;
import org.extentreport.ExtentLogger;
import org.extentreport.ExtentManager;
import org.extentreport.ExtentReport;
import org.testng.*;

public class ListenerClass implements ITestListener ,ISuiteListener {


    @Override
    public void onStart(ISuite suite) {
        ExtentReport.initReports();
    }

    @SneakyThrows
    @Override
    public void onFinish(ISuite suite) {
        ExtentReport.flushReports();
    }

    @Override
    public void onTestStart(ITestResult result) {
        ExtentReport.createtest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentLogger.pass(result.getMethod().getMethodName() + " is passed. ");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentLogger.fail(result.getMethod().getMethodName() + " is Failed. ");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentLogger.skip(result.getMethod().getMethodName() + " is Skipped. ");
    }


    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
    }
}
