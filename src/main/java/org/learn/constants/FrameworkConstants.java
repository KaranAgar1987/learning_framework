package org.learn.constants;

public final class FrameworkConstants {

    private static final String CROMEDRIVERPATH = System.getProperty("user.dir") + "/src/test/resources/executables/chromedriver.exe";

    private FrameworkConstants()
    {

    }

    public static String getCROMEDRIVERPATH() {
        return CROMEDRIVERPATH;
    }


}
