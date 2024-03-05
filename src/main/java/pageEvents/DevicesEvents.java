package pageEvents;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.DevicesElements;
import utils.ElementFetch;
import static baseTest.BaseTest.driver;
import static org.assertj.core.api.Assertions.assertThat;
import java.time.Duration;

public class DevicesEvents {

    ElementFetch ele = new ElementFetch();


    public void clickOnTheSearchButton() {
        ele.getWebElement("XPATH", DevicesElements.searchButtons).click();

    }

    public void verifyVisibilityOfTheChart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
        wait.until(ExpectedConditions.invisibilityOf(ele.getWebElement("XPATH", DevicesElements.loadingSpinner)));
        assertThat(ele.getWebElement("XPATH",DevicesElements.aggregatedChart).isDisplayed()).isTrue();

    }

    public void clickOnTheSelectStartDate() {
        ele.getWebElement("XPATH",DevicesElements.selectStartDate).click();
        assertThat(ele.getWebElement("XPATH",DevicesElements.calendarMultiYearView).isDisplayed()).isTrue();
       // assertThat(ele.getWebElement("XPATH",DevicesElements.calendarMultiYearView).getAttribute("ng-reflect-start-view")).isEqualTo("multi-year");
    }

    public void select2021Year() {
        ele.getWebElement("XPATH",DevicesElements.year2021).click();
        assertThat(ele.getWebElement("XPATH",DevicesElements.calendarMonthsView).isDisplayed()).isTrue();
       // assertThat(ele.getWebElement("XPATH",DevicesElements.calendarMonthsView).getAttribute("ng-reflect-ng-switch")).isEqualTo("year");


    }

    public void selectJan() {
        ele.getWebElement("XPATH", DevicesElements.januaryMonth).click();
    }

    public void selectDec() {
        ele.getWebElement("XPATH", DevicesElements.decemberMonth).click();
    }

    public void selectEndDate() {
        ele.getWebElement("XPATH", DevicesElements.selectEndDate).click();
        assertThat(ele.getWebElement("XPATH",DevicesElements.calendarMultiYearView).isDisplayed()).isTrue();

    }

    public void expandCountryFilter() {
        ele.getWebElement("XPATH", DevicesElements.countryFilter).click();
        assertThat(ele.getWebElement("ID", DevicesElements.listOfCountries).isDisplayed()).isTrue();
    }

   // " String text = driver.findElement(By.tagName("h1")).getText();
//    assertEquals(text, "Testing Inputs");




}
