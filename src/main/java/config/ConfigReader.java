package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//public class ConfigReader {
//    private static final String CONFIG_FILE_PATH = "config/config.properties";
//    private static Properties properties;
//
//    static {
//        try {
//            FileInputStream fileInput = new FileInputStream(CONFIG_FILE_PATH);
//            properties = new Properties();
//            properties.load(fileInput);
//            fileInput.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static String getProperty(String key) {
//        return properties.getProperty(key);
//    }
//}

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static final String CONFIG_FILE_PATH = "src/main/resources/config.properties"; // Specify the path to your .properties file

    private static Properties properties;

    static {
        try (FileInputStream input = new FileInputStream(CONFIG_FILE_PATH)) {
            properties = new Properties();
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception appropriately
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
