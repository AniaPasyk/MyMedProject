package commons;

import baseTest.BaseTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.FilterSectionElements;
import utils.ElementFetch;

import java.util.List;

public class CommonsEvents extends BaseTest {

    //tu będe tworzyć uniwersalne metody na wybieranie dat, specialties i różnych itemów z filtrów

    ElementFetch ele = new ElementFetch(driver, sparkReporter, extent, logger);

    public CommonsEvents(WebDriver driver, ExtentSparkReporter sparkReporter, ExtentReports extent, ExtentTest logger) {
        super(driver, sparkReporter, extent, logger);

    }

    public void selectYear(String year) {

        List<WebElement> yearsList1 = ele.getWebElements("XPATH", FilterSectionElements.givenYear);

        for (WebElement years : yearsList1) {

            if (years.getText().equals(year)) {
                years.click();
                break;
            }

        }


//
//
//
//            }
//
//
//            List<WebElement> list = ele.getWebElements("XPATH", FilterSectionElements.yearCalendarList);
//
//            // List<WebElement> yearsList = ele.getWebElements("XPATH", FilterSectionElements.listOfYears);


    }

}


