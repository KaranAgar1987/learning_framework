package org.Listeners;

import lombok.SneakyThrows;
import org.FrameworkAnnotation.FrameworkAnnotation;
import org.constants.FrameworkConstants;
import org.enums.ConfigProperties;
import org.extentreport.ExtentLogger;
import org.extentreport.ExtentManager;
import org.extentreport.ExtentReport;
import org.testng.*;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ListenerClass implements ITestListener ,ISuiteListener {


    @SneakyThrows
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
        ExtentReport.AddAuthors(result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(FrameworkAnnotation.class).author());
        ExtentReport.AddCategory(result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(FrameworkAnnotation.class).Category());
    }

    @SneakyThrows
    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentLogger.pass(result.getMethod().getMethodName() + " is passed. ",true);
    }

    @SneakyThrows
    @Override
    public void onTestFailure(ITestResult result) {
        ExtentLogger.fail(result.getMethod().getMethodName() + " is Failed. ",true);
        ExtentLogger.fail(Arrays.toString(result.getThrowable().getStackTrace()));

    }

    @SneakyThrows
    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentLogger.skip(result.getMethod().getMethodName() + " is Skipped. ",true);
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
