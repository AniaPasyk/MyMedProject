package pageEvents;

import baseTest.BaseTest;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.ContentTypesElements;
import pageObjects.FilterSectionElements;
import utils.ElementFetch;

import java.time.Duration;

import static baseTest.BaseTest.driver;


public class ContentTypesEvents {

    ElementFetch ele = new ElementFetch();


    public boolean isAlertDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
        wait.until(ExpectedConditions.invisibilityOf(ele.getWebElement("XPATH", FilterSectionElements.loadingSpinner)));

        try {
            ele.getWebElement("XPATH", ContentTypesElements.contentAlert).isDisplayed();
            return true;

        }  catch (NoSuchElementException e) {
            return false;
        }
    }

}

