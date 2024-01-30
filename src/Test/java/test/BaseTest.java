package test;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import Pages.BasePage;
import config.AppConfig;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    protected AppiumDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Set up Appium driver
        // Use AppConfig values for desired capabilities
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}