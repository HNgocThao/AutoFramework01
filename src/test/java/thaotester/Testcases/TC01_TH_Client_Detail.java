package thaotester.Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import thaotester.Actions.Commons.BaseTest;
import thaotester.Utilities.Listeners.ReportListener;
import thaotester.Utilities.Listeners.TestListener;
import thaotester.Actions.PageObject.ClientPageObject;
import thaotester.Actions.PageObject.HomePageObject;
import thaotester.Actions.PageObject.LoginPageObject;

@Listeners({TestListener.class, ReportListener.class})
public class TC01_TH_Client_Detail extends BaseTest {
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
    public void Test_TabClient() {
        ClientPageObject.Client(driver);
        String totalOverview = ClientPageObject.TotalClientOverview(driver);

        ClientPageObject.ClientDetail(driver);
        String totalClientTab = ClientPageObject.getTotalClientOnClientTab(driver);

        Assert.assertEquals(totalOverview, totalClientTab);
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
