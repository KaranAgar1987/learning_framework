package org.learn.utils;

import org.learn.constants.FrameworkConstants;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public final class ReadPropertyFile {

    private ReadPropertyFile(){}

    public static Properties prop = new Properties();
    public static FileInputStream file;
    static {
        try {
            file = new FileInputStream(FrameworkConstants.getCONFIGPROPPATH());
            prop.load(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Covert to hasmap if the properties fetch request is too large,
    // else its already optimized in the current hashtable format
    public static String getValue(String Key) throws Exception {
        if(Objects.isNull(prop.getProperty(Key)) || Objects.isNull(Key))
        {
            throw new Exception("Property name " + Key + " not Found in the config file.");
        }
        return prop.getProperty(Key);
    }
}
