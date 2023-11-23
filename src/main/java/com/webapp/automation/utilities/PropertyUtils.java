package com.webapp.automation.utilities;

import javax.annotation.Nonnull;
import java.util.Objects;
import java.util.Properties;

public class PropertyUtils {

    private final Properties properties;

    public PropertyUtils() {
        this.properties = new PropertyLoader().loadProperty();
    }

        public String getProperty(String property, @Nonnull String defaultValue) {
            String propertyValue = properties.getProperty(property);
            propertyValue = Objects.isNull(propertyValue) ? defaultValue : propertyValue;

            String value = System.getProperty(property, "");
            if (value.isEmpty() || value.equalsIgnoreCase("any")) {
                System.setProperty(property, propertyValue);
                return propertyValue;
            } else {
                return value;
            }
        }

        public Properties loadProperties(){
           return properties;
        }
    }
