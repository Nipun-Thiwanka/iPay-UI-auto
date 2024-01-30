package test;

import Pages.HomePage;
import Pages.LoginPage;
import Utils.FileUtils;
import Utils.JSONUtils;
import org.testng.annotations.Test;


import test.BaseTest;

import config.AppConfig;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        // Load test data from JSON file
        String testData = FileUtils.readJSONFile("config/testdata.json");
        String username = JSONUtils.getJSONValue(testData, "username");
        String password = JSONUtils.getJSONValue(testData, "password");

        // Test logic
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);

        // Additional test steps
        HomePage homePage = new HomePage(driver);
        homePage.clickOnHome();
    }
}