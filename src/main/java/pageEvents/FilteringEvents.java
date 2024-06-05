package pageEvents;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.FilterSectionElements;
import utils.ElementFetch;

import static baseTest.BaseTest.driver;
import static org.assertj.core.api.Assertions.assertThat;

import java.time.Duration;


public class FilteringEvents {

    ElementFetch ele = new ElementFetch();

    public void clickOnTheSearchButton() {
        ele.getWebElement("XPATH", FilterSectionElements.searchButtons).click();

    }

    public void verifyVisibilityOfTheChart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
        wait.until(ExpectedConditions.invisibilityOf(ele.getWebElement("XPATH", FilterSectionElements.loadingSpinner)));
        assertThat(ele.getWebElement("XPATH", FilterSectionElements.aggregatedChart).isDisplayed()).isTrue();

    }

    public void  clickOnTheSelectStartDate(){
        ele.getWebElement("XPATH", FilterSectionElements.selectStartDate).click();
    }


    public void select2021Year() {
        ele.getWebElement("XPATH", FilterSectionElements.year2021).click();
        assertThat(ele.getWebElement("XPATH", FilterSectionElements.calendarMonthsView).isDisplayed()).isTrue();
        // assertThat(ele.getWebElement("XPATH",DevicesElements.calendarMonthsView).getAttribute("ng-reflect-ng-switch")).isEqualTo("year");

    }

    public void select2023() {
        ele.getWebElement("XPATH", FilterSectionElements.year2023).click();
        assertThat(ele.getWebElement("XPATH", FilterSectionElements.calendarMonthsView).isDisplayed()).isTrue();
    }

    public void selectJan() {
        ele.getWebElement("XPATH", FilterSectionElements.januaryMonth).click();
    }

    public void selectDec() {
        ele.getWebElement("XPATH", FilterSectionElements.decemberMonth).click();
    }

    public void selectEndDate() {
        ele.getWebElement("XPATH", FilterSectionElements.selectEndDate).click();
        //assertThat(ele.getWebElement("XPATH",DevicesElements.calendarMultiYearView).isDisplayed()).isTrue();

    }

    public void expandCountryFilter() {
        ele.getWebElement("XPATH", FilterSectionElements.countryFilter).click();
        //  assertThat(ele.getWebElement("ID", DevicesElements.listOfCountries).isDisplayed()).isTrue(); //COŚ NIE TAK
    }

    public void unCheckFR() {
        // System.out.println(ele.getWebElement("XPATH", DevicesElements.frCheckBox).getAttribute("ng-reflect-state"));
        assertThat(ele.getWebElement("XPATH", FilterSectionElements.frCheck).getAttribute("ng-reflect-state")).isEqualTo("checked");
        ele.getWebElement("XPATH", FilterSectionElements.frCheck).click();
        assertThat(ele.getWebElement("XPATH", FilterSectionElements.frCheck).getAttribute("ng-reflect-state")).isEqualTo("unchecked");

    }

    public void verifyFRisChecked() {
        assertThat(ele.getWebElement("XPATH", FilterSectionElements.frCheck).getAttribute("ng-reflect-state")).isEqualTo("checked");
    }

    public void verifyAllisChecked() {
        assertThat(ele.getWebElement("XPATH", FilterSectionElements.allCheck).getAttribute("ng-reflect-state")).isEqualTo("checked");
    }

    public void checkES() {
        assertThat(ele.getWebElement("XPATH", FilterSectionElements.esCheck).getAttribute("ng-reflect-state")).isEqualTo("unchecked");
        System.out.println(ele.getWebElement("XPATH", FilterSectionElements.esCheck).getAttribute("ng-reflect-state"));
        ele.getWebElement("XPATH", FilterSectionElements.esCheck).click();
        assertThat(ele.getWebElement("XPATH", FilterSectionElements.esCheck).getAttribute("ng-reflect-state")).isEqualTo("checked");
    }

    public void expandSpecialtyFilter() {
        // ele.getWebElement("XPATH", DevicesElements.emptyState).click();
        ele.getWebElement("XPATH", FilterSectionElements.overlay).click();
        ele.getWebElement("XPATH", FilterSectionElements.specialtyFilter).click();

    }

    public void uncheckAll() {
        assertThat(ele.getWebElement("XPATH", FilterSectionElements.allCheck).getAttribute("ng-reflect-state")).isEqualTo("checked");
        ele.getWebElement("XPATH", FilterSectionElements.allCheck).click();
        assertThat(ele.getWebElement("XPATH", FilterSectionElements.allCheck).getAttribute("ng-reflect-state")).isEqualTo("unchecked");
    }

    public void checkSpecialty() {
        assertThat(ele.getWebElement("XPATH", FilterSectionElements.specialtyCheck).getAttribute("ng-reflect-state")).isEqualTo("unchecked");
        ele.getWebElement("XPATH", FilterSectionElements.specialtyCheck).click();
        assertThat(ele.getWebElement("XPATH", FilterSectionElements.specialtyCheck).getAttribute("ng-reflect-state")).isEqualTo("checked");
    }

    public void clickOverlay() {
        ele.getWebElement("XPATH", FilterSectionElements.overlay).click();
    }

    public void verifyVisibilityOfAlert(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
        wait.until(ExpectedConditions.invisibilityOf(ele.getWebElement("XPATH", FilterSectionElements.loadingSpinner)));


    }


    // " String text = driver.findElement(By.tagName("h1")).getText();
//    assertEquals(text, "Testing Inputs");


}
