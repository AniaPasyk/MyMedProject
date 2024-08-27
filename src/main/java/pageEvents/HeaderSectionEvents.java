package pageEvents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.FilterSectionElements;
import pageObjects.HeaderSectionElements;
import utils.ElementFetch;

import java.time.Duration;

import static baseTest.BaseTest.driver;
import static org.assertj.core.api.Assertions.assertThat;

public class HeaderSectionEvents {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
    ElementFetch ele = new ElementFetch();


    public void verifyLoggedIn() {
        waitForLoadersToDisappear();
        wait.until(ExpectedConditions.visibilityOf(ele.getWebElement("XPATH", HeaderSectionElements.welcomeToMedscapeImg)));
        assertThat(ele.getWebElement("XPATH", HeaderSectionElements.welcomeToMedscapeImg).isDisplayed()).isTrue();
    }

    public void expandGeneralListAndVerify() {
        wait.until(ExpectedConditions.elementToBeClickable(ele.getWebElement("XPATH", HeaderSectionElements.generalMenu)));
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

    public boolean waitForLoadersToDisappear() {

        wait.until(driver ->
                ele.getWebElements("XPATH", FilterSectionElements.loadingSpinner));
        for (WebElement loaders : ele.getWebElements("XPATH", FilterSectionElements.loadingSpinner)) {
            if (loaders.isDisplayed()) {
                return false; // Loader is still visible
            }
        }
        return true; // All loaders are gone
    }

}
