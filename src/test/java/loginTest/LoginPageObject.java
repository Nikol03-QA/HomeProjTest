package loginTest;


import abstractParentTest.AbstractParentTest;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class LoginPageObject extends AbstractParentTest {


    public LoginPageObject(WebDriver webDriver) {
        super(webDriver);
    }

    @Test
    public void CorrectLogin (){
        loginPage.openPage();
        loginPage.enterLoginInToTheField("nikolcorp@ukr.net");
        loginPage.enterPswdInToTheField ("ae20f83990");
        loginPage.clickOnButtonEnter();
    }
    @Test
    public  void InccorectLogin (){
        loginPage.openPage();
        loginPage.enterLoginInToTheField("nikolcorp@ukr.net");
        loginPage.enterPswdInToTheField("dshfiruhwefw2");
        loginPage.clickOnButtonEnter();

        incorrectLogin("Login/password is incorrect!", accountPage.isLoginFailed());
    }
}
