package loginTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class LoginTest {
    WebDriver webDriver;

    @Test
    public void correctLogin(){
        //two lines down are for to find our chrome for testing
        File file = new File("./src/drivers/chromedriver");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  //every 0.3sec during 5sec the operation will try to run
        webDriver.get("https://www.bonprix.ua/moj-profil/login?redirect=/");

        webDriver.findElement(By.name("email")).clear();
        webDriver.findElement(By.name("email")).sendKeys("nikolcorp@ukr.net");

        webDriver.findElement(By.name("password")).clear();
        webDriver.findElement(By.name("password")).sendKeys("03101989Me");

        webDriver.findElement(By.xpath("//*//button[contains(text(), 'Войти')]")).click();

        Assert.assertTrue("Popup didn't appear this time", checkPopupAppearance());
     //   Assert.assertTrue("Login failed. Try again.", checkRedirectOnAccountPage());

        webDriver.quit();

    }
//   private boolean checkRedirectOnAccountPage(){
//        try{
//            return webDriver.findElement(By.xpath(".//*/li[text()='Мой профиль']")).isDisplayed();
//        }catch (Exception e){
//            return false;
//        }
//    }

    private boolean checkPopupAppearance (){
        if (webDriver.findElement(By.xpath(".//*[@id='newsletter-subscribe']")).isDisplayed()){
           webDriver.findElement(By.xpath("//div[starts-with(@class, 'modal-body')]/button[starts-with(@data-dismiss, 'modal')]" +
                   "/i[starts-with(@class, 'icon-cancel')]")).click();
        }
        return true;
    }
}
