package pageEvents;

//import org.asynchttpclient.util.Assertions;
import pageObjects.LoginPageElements;
import utils.ElementFetch;
import utils.TestArguments;


public class LoginPageEvents {

    ElementFetch ele = new ElementFetch();


    public void logIn () {
        ele.getWebElement("ID", LoginPageElements.userNameInput).sendKeys(TestArguments.getUsername());
        ele.getWebElement("ID", LoginPageElements.passwordInput).sendKeys(TestArguments.getPassword());
        ele.getWebElement("XPATH", LoginPageElements.loginButton).click();
    }



}



