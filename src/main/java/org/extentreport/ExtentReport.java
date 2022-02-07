package org.extentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public final class ExtentReport {

    private ExtentReport(){};

    private static ExtentReports extent = null;

    public static void initReports()
    {
        if (Objects.isNull(extent)) {
            extent = new ExtentReports();
            ExtentSparkReporter html = new ExtentSparkReporter("index.html");
            extent.attachReporter(html);
            html.config().setTheme(Theme.DARK);
            html.config().setDocumentTitle("Automation Framework Report");
            html.config().setReportName("Test ABC");
        }
    }

    public static void flushReports() throws IOException {

        if (Objects.nonNull(extent))
        {
            extent.flush();

        }
        Desktop.getDesktop().browse(new File("index.html").toURI());

    }

    public static void createtest(String testcasename)
    {
        ExtentTest test =  extent.createTest(testcasename);
        ExtentManager.setExtentTest(test);
    }
}
