package thaotester.Actions.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import thaotester.Interfaces.LoginPageUI;


public class LoginPageObject {

    public static void Login(WebDriver driver){
        driver.findElement(By.xpath(LoginPageUI.Id_txb)).click();
        driver.findElement(By.xpath(LoginPageUI.Login_btn)).click();
    }
}
