package config;
//
//public class AppConfig {
//    public static final String PLATFORM_NAME = ConfigReader.getProperty("platformName");
//    public static final String DEVICE_NAME = ConfigReader.getProperty("deviceName");
//    public static final String APP_PATH = ConfigReader.getProperty("appPath");
//    // Add other configuration properties
//}

public class AppConfig {
    public static final String UUID = ConfigReader.getProperty("appium_UUID");
    public static final String PLATFORM_NAME = ConfigReader.getProperty("platformName");
    public static final String DEVICE_NAME = ConfigReader.getProperty("appium_deviceName");
    public static final String AUTOMATION_NAME = ConfigReader.getProperty("appium_automationName");
    public static final String APP_PACKAGE = ConfigReader.getProperty("appium_appPackage");
    public static final String APP_ACTIVITY = ConfigReader.getProperty("appium_appActivity");
    public static final String APP_PATH = ConfigReader.getProperty("appium_appPath");
    // Add other configuration properties
}
