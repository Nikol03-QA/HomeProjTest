package pages.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import parentPage.ParentPage;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;


public class MyProfileMenu extends ParentPage {
    WebDriver webDriver;
    @FindBy(xpath = "//*[@class = 'myaccountContainer']")
    private WebElement accountMenu;
    @FindBy(xpath = "//div[@class=\"login-nav\"]/a[@id=\"account-popover\"]/li[@href=\"'/moy-profil/'\"]")
    private WebElement accountDropdown;

   public MyProfileMenu(WebDriver webDriver) {
        super(webDriver);
       // Select listFromDropdown = new Select(driver.findElement(By.id("account-popover")));
    }


    public void clickOnMyAccountButton (){
        accountMenu.click();
    }

}
