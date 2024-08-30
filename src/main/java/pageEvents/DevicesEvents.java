package pageEvents;

import baseTest.BaseTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.FilterSectionElements;
import utils.ElementFetch;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.Duration;


public class DevicesEvents extends BaseTest {

    ElementFetch ele = new ElementFetch(driver, sparkReporter, extent, logger);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));

    public DevicesEvents(WebDriver driver, ExtentSparkReporter sparkReporter, ExtentReports extent, ExtentTest logger) {
        super(driver, sparkReporter, extent, logger);
    }

    public DevicesEvents clickOnTheSearchButton() {
        ele.getWebElement("XPATH", FilterSectionElements.searchButtons).click();
        return this;

    }

    public DevicesEvents verifyVisibilityOfTheChart() {
        wait.until(ExpectedConditions.invisibilityOf(ele.getWebElement("XPATH", FilterSectionElements.loadingSpinner)));
        assertThat(ele.getWebElement("XPATH", FilterSectionElements.aggregatedChart).isDisplayed()).isTrue();
        return this;

    }

    public DevicesEvents clickOnTheSelectStartDate() {
        ele.getWebElement("XPATH", FilterSectionElements.selectStartDate).click();
        return this;
    }


    public DevicesEvents select2021Year() {
        ele.getWebElement("XPATH", FilterSectionElements.year2021).click();
        assertThat(ele.getWebElement("XPATH", FilterSectionElements.calendarMonthsView).isDisplayed()).isTrue();
        // assertThat(ele.getWebElement("XPATH",DevicesElements.calendarMonthsView).getAttribute("ng-reflect-ng-switch")).isEqualTo("year");
        return this;
    }

    public DevicesEvents select2023() {
        ele.getWebElement("XPATH", FilterSectionElements.year2023).click();
        assertThat(ele.getWebElement("XPATH", FilterSectionElements.calendarMonthsView).isDisplayed()).isTrue();
        return this;
    }

    public DevicesEvents selectJan() {
        ele.getWebElement("XPATH", FilterSectionElements.januaryMonth).click();
        return this;
    }

    public DevicesEvents selectDec() {
        ele.getWebElement("XPATH", FilterSectionElements.decemberMonth).click();
        return this;
    }

    public DevicesEvents selectEndDate() {
        ele.getWebElement("XPATH", FilterSectionElements.selectEndDate).click();
        //assertThat(ele.getWebElement("XPATH",DevicesElements.calendarMultiYearView).isDisplayed()).isTrue();
        return this;

    }

    public DevicesEvents expandCountryFilter() {
        ele.getWebElement("XPATH", FilterSectionElements.countryFilter).click();
        //  assertThat(ele.getWebElement("ID", DevicesElements.listOfCountries).isDisplayed()).isTrue(); //COŚ NIE TAK
        return this;
    }

    public DevicesEvents unCheckFR() {
        // System.out.println(ele.getWebElement("XPATH", DevicesElements.frCheckBox).getAttribute("ng-reflect-state"));
        assertThat(ele.getWebElement("XPATH", FilterSectionElements.frCheck).getAttribute("ng-reflect-state")).isEqualTo("checked");
        ele.getWebElement("XPATH", FilterSectionElements.frCheck).click();
        assertThat(ele.getWebElement("XPATH", FilterSectionElements.frCheck).getAttribute("ng-reflect-state")).isEqualTo("unchecked");
        return this;
    }

    public DevicesEvents verifyFRisChecked() {
        assertThat(ele.getWebElement("XPATH", FilterSectionElements.frCheck).getAttribute("ng-reflect-state")).isEqualTo("checked");
        return this;
    }

    public DevicesEvents verifyAllisChecked() {
        assertThat(ele.getWebElement("XPATH", FilterSectionElements.allCheck).getAttribute("ng-reflect-state")).isEqualTo("checked");
        return this;
    }


    public DevicesEvents checkES() {
        assertThat(ele.getWebElement("XPATH", FilterSectionElements.esCheck).getAttribute("ng-reflect-state")).isEqualTo("unchecked");
        System.out.println(ele.getWebElement("XPATH", FilterSectionElements.esCheck).getAttribute("ng-reflect-state"));
        ele.getWebElement("XPATH", FilterSectionElements.esCheck).click();
        assertThat(ele.getWebElement("XPATH", FilterSectionElements.esCheck).getAttribute("ng-reflect-state")).isEqualTo("checked");
        return this;
    }

    public DevicesEvents expandSpecialtyFilter() {
        // ele.getWebElement("XPATH", DevicesElements.emptyState).click();
        ele.getWebElement("XPATH", FilterSectionElements.overlay).click();
        ele.getWebElement("XPATH", FilterSectionElements.specialtyFilter).click();
        return this;

    }

    public DevicesEvents uncheckAll() {
        assertThat(ele.getWebElement("XPATH", FilterSectionElements.allCheck).getAttribute("ng-reflect-state")).isEqualTo("checked");
        ele.getWebElement("XPATH", FilterSectionElements.allCheck).click();
        assertThat(ele.getWebElement("XPATH", FilterSectionElements.allCheck).getAttribute("ng-reflect-state")).isEqualTo("unchecked");
        return this;
    }

    public DevicesEvents checkSpecialty() {
        assertThat(ele.getWebElement("XPATH", FilterSectionElements.specialtyCheck).getAttribute("ng-reflect-state")).isEqualTo("unchecked");
        ele.getWebElement("XPATH", FilterSectionElements.specialtyCheck).click();
        assertThat(ele.getWebElement("XPATH", FilterSectionElements.specialtyCheck).getAttribute("ng-reflect-state")).isEqualTo("checked");
        return this;
    }

    public DevicesEvents clickOverlay() {
        ele.getWebElement("XPATH", FilterSectionElements.overlay).click();
        return this;
    }


    // " String text = driver.findElement(By.tagName("h1")).getText();
//    assertEquals(text, "Testing Inputs");


}
