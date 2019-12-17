package loginTest;


import abstractParentTest.AbstractParentTest;
import org.junit.Test;


public class LoginPageObjectTest extends AbstractParentTest {


    @Test
    public void CorrectLogin (){
        loginPage.openPage();
        loginPage.enterLoginInToTheField("nikolcorp@ukr.net");
        loginPage.enterPswdInToTheField ("03101989Me");
        loginPage.clickOnButtonEnter();

        correctLogin("Log in is success.", !accountPage.isLoginFailed());
    }
    @Test
    public  void IncorectLogin (){
        loginPage.openPage();
        loginPage.enterLoginInToTheField("nikolcorp@ukr.net");
        loginPage.enterPswdInToTheField("dshfiruhwefw2");
        loginPage.clickOnButtonEnter();

        incorrectLogin("Login/password is incorrect!", accountPage.isLoginFailed());
    }
}
