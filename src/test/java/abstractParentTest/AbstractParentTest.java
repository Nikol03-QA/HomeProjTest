package abstractParentTest;

import library.ActionWithElement;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AccountPage;
import pages.LoginPage;
import pages.pageElements.MyProfileMenu;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class AbstractParentTest {
    protected WebDriver webDriver;
    protected LoginPage loginPage;
    protected AccountPage accountPage;
    protected ActionWithElement actionWithElement;
    protected MyProfileMenu myProfileMenu;


    @Before
    public void settingUp(){
        //two lines down are for to find our chrome for testing
        File file = new File("./src/drivers/chromedriver");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  //every 0.3sec during 5sec the operation will try to run

        loginPage = new LoginPage(webDriver);
        accountPage = new AccountPage(webDriver);
        actionWithElement = new ActionWithElement(webDriver);
        myProfileMenu = new MyProfileMenu (webDriver);


    }

    @After
    public void chromeClose(){
        webDriver.quit();
    }
    protected void checkExpResult (String message, boolean actualResult){
        Assert.assertEquals(message, true, actualResult);
    }
    protected void correctLogin (String message, boolean actualResult){
        Assert.assertEquals(message, true, actualResult);
    }

    protected void incorrectLogin (String message, boolean actualResult){
            Assert.assertEquals(message, true, actualResult);
}


}
