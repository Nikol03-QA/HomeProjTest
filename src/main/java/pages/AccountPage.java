package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import parentPage.ParentPage;

public class AccountPage extends ParentPage {
    public AccountPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isLoginFailed() {
        try {
            WebElement unsuccessLog = webDriver.findElement(By.xpath("//div[starts-with(@class, \"alert alert-danger \")]"));
            return unsuccessLog.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
