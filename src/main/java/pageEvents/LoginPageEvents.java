package pageEvents;

//import org.asynchttpclient.util.Assertions;
import pageObjects.LoginPageElements;
import pageObjects.WelcomePageElements;
import utils.ElementFetch;
import utils.TestArguments;
import static org.assertj.core.api.Assertions.*;


public class LoginPageEvents {

    ElementFetch ele = new ElementFetch();


    public void logIn () {
        ele.getWebElement("ID", LoginPageElements.userNameInput).sendKeys(TestArguments.getUsername());
        ele.getWebElement("ID", LoginPageElements.passwordInput).sendKeys(TestArguments.getPassword());
        ele.getWebElement("XPATH", LoginPageElements.loginButton).click();
    }



}



