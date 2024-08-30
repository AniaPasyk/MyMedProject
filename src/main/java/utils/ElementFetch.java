package utils;

import baseTest.BaseTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import javax.swing.text.Element;
import java.util.List;

public class ElementFetch extends BaseTest {

    public ElementFetch(WebDriver driver, ExtentSparkReporter sparkReporter, ExtentReports extent, ExtentTest logger) {
        super(driver, sparkReporter, extent, logger);

    }

    public WebElement getWebElement(String identifierType, String identifierValue) {
        switch (identifierType) {

            case "CSS":
                return driver.findElement(By.cssSelector(identifierValue));

            case "ID":
                return driver.findElement(By.id(identifierValue));

            case "NAME":
                return driver.findElement(By.name(identifierValue));

            case "TAGNAME":
                return driver.findElement(By.tagName(identifierValue));

            case "LINKTEXT":
                return driver.findElement(By.linkText(identifierValue));

            default:
                return null;
        }

    }

    public List<WebElement> getWebElements(String identifierType, String identifierValue) {
        switch (identifierType) {
            case "XPATH":
                return driver.findElements(By.xpath(identifierValue));
            case "CSS":
                return driver.findElements(By.cssSelector(identifierValue));

            case "ID":
                return driver.findElements(By.id(identifierValue));

            case "NAME":
                return driver.findElements(By.name(identifierValue));

            case "TAGNAME":
                return driver.findElements(By.tagName(identifierValue));

            case "LINKTEXT":
                return driver.findElements(By.linkText(identifierValue));

            default:
                return null;
        }

    }

    public boolean isElementPresent(String identifierType, String identifierValue) {
        List<WebElement> elementList = getWebElements(identifierType, identifierValue);

        int size = elementList.size();
        if (size > 0) {
            return true;
        } else {
            return false;
        }
    }

}

//    public void WebElement waitForElement(By locator, int timeout) {
//
//    }

//    public void clickWhenReady(By locator, int timeout)
//}
