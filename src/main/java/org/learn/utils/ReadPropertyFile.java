package org.learn.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public final class ReadPropertyFile {

    private ReadPropertyFile(){}
    public static final Properties prop = new Properties();

    public static String getValue(String Key) throws Exception {
        String value=null;
        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/config/config.properties");
        prop.load(file);
        value =prop.getProperty(Key);
        if(Objects.isNull(value))
        {
            throw new Exception("Property name " + Key + " not Found in the config file.");
        }
        return value;

    }
}
