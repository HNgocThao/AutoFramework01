package thaotester.Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import thaotester.Actions.Commons.BaseTest;
import thaotester.Actions.PageObject.HomePageObject;
import thaotester.Utilities.Listeners.ReportListener;
import thaotester.Utilities.Listeners.TestListener;
import thaotester.Actions.PageObject.LoginPageObject;
import thaotester.Actions.PageObject.TasksPageObject;

@Listeners({TestListener.class, ReportListener.class})
public class TC03_BT_TaskList extends BaseTest {
    private static WebDriver driver;
    @Parameters({ "browserType", "appURL" })
    @BeforeClass
    public void beforeClass() {
        driver = getDriver();
    }
    @Test(priority = 0)
    public void Test_Login() {
        LoginPageObject.Login(driver);
    }
    @Test (priority = 1)
    public void Test_TaskPage() {
        TasksPageObject.Tasks(driver);
    }
    @Test (priority = 2)
    public void Test_Logout() {
        HomePageObject.Home(driver);
    }
    @AfterTest
    public void afterTest() throws Exception{
        tearDown();
    }
}
