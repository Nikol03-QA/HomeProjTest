package myProfileTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MyProfileTest extends AbstractParentTest {
    // WebDriver driver;
    @Test
    public void selectListFromDropdown() {
        loginPage.allLoginSteps("nikolcorp@ukr.net", "03101989Me");
        Assert.assertTrue("Popup didn't appear this time", checkPopupAppearance());
        myProfileMenu.clickOnMyAccountButton();

    }

    private boolean checkPopupAppearance() {
        if (webDriver.findElement(By.xpath(".//*[@id='newsletter-subscribe']")).isDisplayed()) {
            webDriver.findElement(By.xpath("//div[starts-with(@class, 'modal-body')]/button[starts-with(@data-dismiss, 'modal')]" +
                    "/i[starts-with(@class, 'icon-cancel')]")).click();
        }
        return true;

    }
}