package org.extentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.constants.FrameworkConstants;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public final class ExtentReport {

    private ExtentReport(){};

    private static ExtentReports extent = null;

    public static void initReports() throws Exception {
        if (Objects.isNull(extent)) {
            extent = new ExtentReports();
            ExtentSparkReporter html = new ExtentSparkReporter(FrameworkConstants.getExtentReportFilePath());
            extent.attachReporter(html);
            html.config().setTheme(Theme.DARK);
            html.config().setDocumentTitle("Automation Framework Report - Team NAME");
            html.config().setReportName("Platform Report");
        }
    }

    public static void flushReports() throws Exception {

        if (Objects.nonNull(extent))
        {
            extent.flush();

        }
        if (!FrameworkConstants.getEXTENTREPORTPATH().isEmpty())
        Desktop.getDesktop().browse(new File(FrameworkConstants.getExtentReportFilePath()).toURI());

    }

    public static void createtest(String testcasename)
    {
        ExtentTest test =  extent.createTest(testcasename);
        ExtentManager.setExtentTest(test);
    }
}
