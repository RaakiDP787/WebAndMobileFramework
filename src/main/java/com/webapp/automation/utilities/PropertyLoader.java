package com.webapp.automation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Properties;

public class PropertyLoader {
    public Properties loadProperty(){
        Properties properties = new Properties();
        try {
           // File file = new File("/Users/testvagrant/Documents/WebAndMobileFramework/src/test/resources/config.properties");
           File file = new File("config.properties");
           //File file = new File(System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "config.properties");

            FileInputStream input = new FileInputStream(file);
            properties.load(input);
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }


}
