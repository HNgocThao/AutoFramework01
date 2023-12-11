package thaotester.Actions.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import thaotester.Actions.Commons.BasePage;
import thaotester.Interfaces.ClientPageUI;

public class ClientPageObject {
    private static BasePage basePage = new BasePage();

    public static void Client(WebDriver driver){
        basePage.clickToElement(driver, ClientPageUI.ClientPage_txt);
        basePage.isElementDisplayed(driver, ClientPageUI.ClientPage_show);
    }

    public static void ClientDetail(WebDriver driver){
        basePage.clickToElement(driver, ClientPageUI.TabClient_txt);
        basePage.isElementDisplayed(driver, ClientPageUI.ClientDetail_show);
    }
    public static void ContactDetail(WebDriver driver){
        basePage.clickToElement(driver, ClientPageUI.TabContacts_txt);
        basePage.isElementDisplayed(driver, ClientPageUI.TabContacts_show);
    }

    //Total
    public static String TotalClientOverview(WebDriver driver){
        basePage.waitForElementVisible(driver,ClientPageUI.Client_total);
        String totals = basePage.getElementText(driver,ClientPageUI.Client_total).trim();
        return totals;
    }
    public static String TotalContactsOverview(WebDriver driver){
        basePage.waitForElementVisible(driver,ClientPageUI.Contacts_total);
        String totals = basePage.getElementText(driver,ClientPageUI.Contacts_total).trim();
        return totals;
    }

    public static String getTotalClientOnClientTab(WebDriver driver){
        basePage.scrollToBottomPage(driver);
        basePage.waitForElementVisible(driver,ClientPageUI.ClientDetail_total);
        String totalClientOnTab = basePage.getElementText(driver,ClientPageUI.ClientDetail_total).trim();
        String[] substrings = totalClientOnTab.split(" ");
        //lấy chuối cuối cùng
        return substrings[substrings.length - 1].trim();
    }
    public static String getTotalContactsOnContactsTab(WebDriver driver){
        basePage.scrollToBottomPage(driver);
        basePage.waitForElementVisible(driver,ClientPageUI.ContactsDetail_total);
        String totalClientOnTab = basePage.getElementText(driver,ClientPageUI.ContactsDetail_total).trim();
        String[] substrings = totalClientOnTab.split(" ");
        //lấy chuối cuối cùng
        return substrings[substrings.length - 1].trim();
    }


}
