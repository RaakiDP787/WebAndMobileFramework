package com.webapp.automation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertyLoader {
    public Properties loadProperty(){
        Properties properties = new Properties();
        try {
           // File file = new File("/Users/testvagrant/Documents/WebAndMobileFramework/src/test/resources/config.properties");
            Path filePath = Paths.get("src", "test", "resources", "config.properties");
            String pathString = filePath.toString();
            File file = new File(pathString);

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
