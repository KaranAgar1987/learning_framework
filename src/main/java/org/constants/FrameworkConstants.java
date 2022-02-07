package org.constants;

import org.enums.ConfigProperties;
import org.testng.internal.PropertyUtils;
import org.utils.ReadPropertyFile;

public final class FrameworkConstants {

    private static final String CROMEDRIVERPATH = System.getProperty("user.dir") + "/src/test/resources/executables/chromedriver.exe";
    private static final String CONFIGPROPPATH = System.getProperty("user.dir") + "/src/test/resources/config/config.properties";
    private static final int EXPLICITWAITTIME = 10;
    private static final String EXTENTREPORTPATH = System.getProperty("user.dir") + "/extent-test-output";
    private static String extentFilePath = "";



    private FrameworkConstants()
    {

    }
    public static int getExplicitwaittime()
    {
        return EXPLICITWAITTIME;
    }
    public static String getCROMEDRIVERPATH() {
        return CROMEDRIVERPATH;
    }
    public static String getCONFIGPROPPATH() {
        return CONFIGPROPPATH;
    }

    public static String getExtentReportFilePath() throws Exception {
        if (extentFilePath.isEmpty()){
            extentFilePath = getEXTENTREPORTPATH();
        }
        return extentFilePath;
    }
    public static String getEXTENTREPORTPATH() throws Exception {
        if (ReadPropertyFile.getValue(ConfigProperties.OVERRIDEREPORTS).equalsIgnoreCase("yes"))
        {
            return EXTENTREPORTPATH + "/" + String.valueOf(System.currentTimeMillis()) + " index.html";
        }
        else {
            return EXTENTREPORTPATH + "/index.html";
        }
    }


}
