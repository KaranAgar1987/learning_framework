package org.learn.constants;

public final class FrameworkConstants {

    private static final String CROMEDRIVERPATH = System.getProperty("user.dir") + "/src/test/resources/executables/chromedriver.exe";
    private static final String CONFIGPROPPATH = System.getProperty("user.dir") + "/src/test/resources/config/config.properties";
    private FrameworkConstants()
    {

    }

    public static String getCROMEDRIVERPATH() {
        return CROMEDRIVERPATH;
    }
    public static String getCONFIGPROPPATH() {
        return CONFIGPROPPATH;
    }


}
