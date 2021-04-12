package com.test.bintudhillon.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ConfigUtils {
    static Properties prop = new Properties();

    public static void loadProperties() {
        try {
            String os = System.getProperty("os.name").toLowerCase();
            String confPath, msgPath;

            if (os.startsWith("win")) {
                confPath = "\\src\\test\\resources\\config.properties";
                msgPath = "\\src\\test\\resources\\messages.properties";
            } else {
                confPath = "/src/test/resources/config.properties";
                msgPath = "/src/test/resources/messages.properties";
            }
            prop.load(new FileInputStream(System.getProperty("user.dir") + File.separator + confPath));
            prop.load(new FileInputStream(System.getProperty("user.dir") + File.separator + msgPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getPropertyByKey(String key) {
        return prop.getProperty(key);
    }
}
