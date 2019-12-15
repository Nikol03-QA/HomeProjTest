package loginTest;

import abstractParentTest.AbstractParentTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;

@RunWith(Parameterized.class)
public class LoginPageObjectAndParams extends AbstractParentTest {
    String login, password;

    public LoginPageObjectAndParams( String login, String password) {
        this.login = login;
        this.password = password;
    }
}
