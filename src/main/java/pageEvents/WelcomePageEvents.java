package pageEvents;

import baseTest.BaseTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.FilterSectionElements;
import pageObjects.HeaderSectionElements;
import utils.ElementFetch;

import java.time.Duration;


import static org.assertj.core.api.Assertions.assertThat;

public class WelcomePageEvents extends BaseTest {

    public WelcomePageEvents(WebDriver driver, ExtentSparkReporter sparkReporter, ExtentReports extent, ExtentTest logger) {
        super(driver, sparkReporter, extent, logger);
    }

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
    ElementFetch ele = new ElementFetch(driver, sparkReporter, extent, logger);


    public Boolean verifyLoggedIn() {
        waitForLoadersToDisappear();
        wait.until(ExpectedConditions.visibilityOf(ele.getWebElement("XPATH", HeaderSectionElements.welcomeToMedscapeImg)));
        assertThat(ele.getWebElement("XPATH", HeaderSectionElements.welcomeToMedscapeImg).isDisplayed()).isTrue();
        return true;
    }

    public WelcomePageEvents expandGeneralListAndVerify() {
        wait.until(ExpectedConditions.elementToBeClickable(ele.getWebElement("XPATH", HeaderSectionElements.generalMenu)));
        ele.getWebElement("XPATH", HeaderSectionElements.generalMenu).click();
        wait.until(ExpectedConditions.visibilityOf(ele.getWebElement("XPATH", HeaderSectionElements.generalList)));
        assertThat(ele.getWebElement("XPATH", HeaderSectionElements.generalList).isDisplayed()).isTrue();
        return this;
    }

    public DevicesEvents headToDevices() {
        ele.getWebElement("XPATH", HeaderSectionElements.devices).click();
        return new DevicesEvents(driver, sparkReporter, extent, logger);

    }

    public ContentTypesEvents headToContentTypes() {
        ele.getWebElement("XPATH", HeaderSectionElements.contentTypes).click();
        return new ContentTypesEvents(driver, sparkReporter, extent, logger);
    }

    public void waitForLoadersToDisappear() {

        wait.until(driver ->
                ele.getWebElements("XPATH", FilterSectionElements.loadingSpinner));
        for (WebElement loaders : ele.getWebElements("XPATH", FilterSectionElements.loadingSpinner)) {
            if (loaders.isDisplayed()) {
                return; // Loader is still visible
            }
        }
    }

}
