package pageEvents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.LoginPageElements;
import pageObjects.WelcomePageElements;
import utils.ElementFetch;

import java.time.Duration;

import static baseTest.BaseTest.driver;
import static org.assertj.core.api.Assertions.assertThat;

public class WelcomePageEvents {

     ElementFetch ele = new ElementFetch();


    public void verifyLoggedIn() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOf(ele.getWebElement("XPATH", WelcomePageElements.welcomeToMedscapeImg)));
        assertThat(ele.getWebElement("XPATH", WelcomePageElements.welcomeToMedscapeImg).isDisplayed()).isTrue();
    }

    public void expandGeneralListAndVerify() {
        ele.getWebElement("XPATH", WelcomePageElements.generalMenu).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOf(ele.getWebElement("XPATH",WelcomePageElements.generalList)));
        assertThat(ele.getWebElement("XPATH",WelcomePageElements.generalList).isDisplayed()).isTrue();

    }

    public void headToDevices() {
        ele.getWebElement("XPATH", WelcomePageElements.devices).click();

    }

}
