package thaotester.Actions.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import thaotester.Actions.Commons.BasePage;
import thaotester.Interfaces.ClientPageUI;
import thaotester.Interfaces.TasksPageUI;
import thaotester.Testcases.TC04_BT_AddTask;

public class TasksPageObject {
    private static BasePage basePage = new BasePage();
    public static String keyss = TC04_BT_AddTask.keys;

    public static void Tasks(WebDriver driver){
        basePage.clickToElement(driver, TasksPageUI.TaskPage_txt);
        basePage.isElementDisplayed(driver, TasksPageUI.TaskPage_show);
    }
    public static void Add_Tasks(WebDriver driver){
        basePage.clickToElement(driver, TasksPageUI.AddTasks_txt);
        basePage.sendKeyToElement(driver, TasksPageUI.Title_txb, keyss);
        basePage.clickToElement(driver, TasksPageUI.Project_txt);
        basePage.clickToElement(driver, TasksPageUI.Project_txt2);
        basePage.clickToElement(driver, TasksPageUI.Save_btn);
        basePage.clickToElement(driver, TasksPageUI.Close_btn);
    }
}
