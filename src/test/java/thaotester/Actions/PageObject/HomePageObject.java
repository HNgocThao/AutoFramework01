package thaotester.Actions.PageObject;

import org.openqa.selenium.WebDriver;
import thaotester.Actions.Commons.BasePage;
import thaotester.Interfaces.HomePageUI;

public class HomePageObject {
    private static BasePage basePage = new BasePage();

    public static void Home(WebDriver driver) {
        basePage.isElementDisplayed(driver, HomePageUI.imgP);
        basePage.clickToElement(driver, HomePageUI.img_click);
        basePage.clickToElement(driver, HomePageUI.signout_btn);
    }
}
