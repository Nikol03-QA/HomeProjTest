package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class LoginPage extends ParentPage {
    @FindBy (name = "email")
    private WebElement inputLogin;
    @FindBy (name = "password")
    private WebElement inputPassword;
    @FindBy (xpath = "//*//button[contains(text(), 'Войти')]")
    private WebElement enterButton;


    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openPage(){
        try{
           webDriver.get("https://muzline.ua/login");
        }catch (Exception e){
            Assert.fail("Couldn't open browser.");
        }
    }
    public void enterLoginInToTheField(String login){
       // webDriver.findElement(By.name("email"));
        inputLogin.clear();
        actionWithElements.enterTextIntoInput(inputLogin, login);
    }
    public void enterPswdInToTheField (String password){
       // webDriver.findElement(By.name("password"));
        inputPassword.clear();
        inputPassword.sendKeys(password);
       // actionWithElements.enterTextIntoInput(inputPassword, password);
        logger.info("The button was clicked.");
    }
    public void clickOnButtonEnter (){
        enterButton.click();
        logger.info("The button was clicked.");
    }


}
