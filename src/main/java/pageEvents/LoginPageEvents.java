package pageEvents;

//import org.asynchttpclient.util.Assertions;

import baseTest.BaseTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import pageObjects.LoginPageElements;
import utils.ElementFetch;
import utils.TestArguments;


public class LoginPageEvents extends BaseTest {

    ElementFetch ele = new ElementFetch(driver, sparkReporter,extent, logger);


    public LoginPageEvents(WebDriver driver, ExtentSparkReporter sparkReporter, ExtentReports extent, ExtentTest logger) {
        super(driver, sparkReporter, extent, logger);
    }

    public WelcomePageEvents logIn() {
        ele.getWebElement("ID", LoginPageElements.userNameInput).sendKeys(TestArguments.getUsername());
        ele.getWebElement("ID", LoginPageElements.passwordInput).sendKeys(TestArguments.getPassword());
        ele.getWebElement("XPATH", LoginPageElements.loginButton).click();
        return new WelcomePageEvents(driver, sparkReporter, extent, logger);
    }


}



