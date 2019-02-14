package com.javapractice.utility;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

import org.apache.log4j.Logger;

public class ReadProperties {

    final static Logger logger = Logger.getLogger(ReadProperties.class);

    private static Properties props;

    static {
        InputStream in = null;
        try {
            props = new Properties();
            in = ClassLoader.class.getResourceAsStream("/config.properties");
            props.load(in);
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
    }

    private ReadProperties() {

    }

    private static class PropHolder {
        private static final ReadProperties INSTANCE = new ReadProperties();
    }

    public static ReadProperties getInstance() {
        return PropHolder.INSTANCE;
    }

    public String getProperty(String key) {
        return props.getProperty(key);
    }

    public Set<String> getAllPropertyNames() {
        return props.stringPropertyNames();
    }

    public boolean containsKey(String key) {
        return props.containsKey(key);
    }
}