package org.utils;

import org.enums.ConfigProperties;
import org.constants.FrameworkConstants;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public final class ReadPropertyFile {

    private ReadPropertyFile(){}

    private static Properties prop = new Properties();
    private static FileInputStream file;
    private static final Map<String,String> ConfigMap = new HashMap<>();
    static {
        try {
            file = new FileInputStream(FrameworkConstants.getCONFIGPROPPATH());
            prop.load(file);
            for(Map.Entry<Object, Object> entry : prop.entrySet()){
                ConfigMap.put(entry.getKey().toString(),String.valueOf(entry.getValue()).trim());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Covert to hasmap if the properties fetch request is too large,
    // else its already optimized in the current hashtable format
    public static String getValue(ConfigProperties Key) throws Exception {
        if(Objects.isNull(Key) || Objects.isNull(Key.name().toLowerCase()))
        {
            throw new Exception("Property name " + Key + " not Found in the config file.");
        }
        return ConfigMap.get(Key.name().toLowerCase());
    }
}
