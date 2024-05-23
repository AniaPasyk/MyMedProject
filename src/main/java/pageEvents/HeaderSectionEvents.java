package pageEvents;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.HeaderSectionElements;
import utils.ElementFetch;

import java.time.Duration;

import static baseTest.BaseTest.driver;
import static org.assertj.core.api.Assertions.assertThat;

public class HeaderSectionEvents {

     ElementFetch ele = new ElementFetch();


    public void verifyLoggedIn() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        System.out.println("znikł spinner");
        wait.until(ExpectedConditions.visibilityOf(ele.getWebElement("XPATH", HeaderSectionElements.welcomeToMedscapeImg)));
        assertThat(ele.getWebElement("XPATH", HeaderSectionElements.welcomeToMedscapeImg).isDisplayed()).isTrue();
    }

    public void expandGeneralListAndVerify() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        //wait.until(ExpectedConditions.elementToBeClickable(ele.getWebElement("XPATH", WelcomePageElements.generalMenu))).click();
        ele.getWebElement("XPATH", HeaderSectionElements.generalMenu).click();
        wait.until(ExpectedConditions.visibilityOf(ele.getWebElement("XPATH", HeaderSectionElements.generalList)));
        assertThat(ele.getWebElement("XPATH", HeaderSectionElements.generalList).isDisplayed()).isTrue();

    }

    public void headToDevices() {
        ele.getWebElement("XPATH", HeaderSectionElements.devices).click();

    }

    public void headToContentTypes() {
        ele.getWebElement("XPATH", HeaderSectionElements.contentTypes).click();
    }

}
