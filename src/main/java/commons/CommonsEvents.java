package commons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.FilterSectionElements;
import utils.ElementFetch;

import java.util.List;

public class CommonsEvents {

    ElementFetch ele = new ElementFetch();

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


