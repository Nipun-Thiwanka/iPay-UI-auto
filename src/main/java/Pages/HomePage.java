package Pages;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class HomePage extends Pages.BasePage {

    @AndroidFindBy(id = "android.homepage.element")
    private MobileElement homeElement;

    public HomePage(AppiumDriver driver) {
        super(driver);
    }

    public void clickOnHome() {
        homeElement.click();
    }
}