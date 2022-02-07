package org.learn.data;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DataProviderTest {

    @Test(dataProvider = "getData" )
    public void testDataProvider(Map<Object,String> map)
    {
        map.forEach( (k,v) -> System.out.println(k + " --  " +  v));

    }

    @DataProvider
    public Object getData() throws IOException {
        HashMap<String,Object> map1 = new ObjectMapper().readValue(new File(System.getProperty("user.dir") + "/src/test/resources/json/config.json"), new TypeReference<HashMap<String, Object>>() {});
        HashMap<String,Object> map2 = new ObjectMapper().readValue(new File(System.getProperty("user.dir") + "/src/test/resources/json/config.json"), new TypeReference<HashMap<String, Object>>() {});
        return new Object[] {map1,map2};
    }
}
