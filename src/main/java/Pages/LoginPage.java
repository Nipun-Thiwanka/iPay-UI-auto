package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class LoginPage extends BasePage {

    @AndroidFindBy(id = "android.username.field")
    private MobileElement usernameField;

    @AndroidFindBy(id = "android.password.field")
    private MobileElement passwordField;

    @AndroidFindBy(id = "android.login.button")

    private MobileElement loginButton;

    public LoginPage(AppiumDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }
}
