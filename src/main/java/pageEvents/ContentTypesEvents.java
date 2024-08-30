package pageEvents;

import baseTest.BaseTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.ContentTypesElements;
import pageObjects.FilterSectionElements;
import utils.ElementFetch;

import java.time.Duration;

public class ContentTypesEvents extends BaseTest {

    ElementFetch ele = new ElementFetch(driver, sparkReporter,extent, logger);

    public ContentTypesEvents(WebDriver driver, ExtentSparkReporter sparkReporter, ExtentReports extent, ExtentTest logger) {
        super(driver, sparkReporter, extent, logger);

    }
        public boolean isAlertDisplayed () {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
            wait.until(ExpectedConditions.invisibilityOf(ele.getWebElement("XPATH", FilterSectionElements.loadingSpinner)));

            try {
                ele.getWebElement("XPATH", ContentTypesElements.contentAlert).isDisplayed();
                return true;

            } catch (NoSuchElementException e) {
                return false;
            }
        }

    }



