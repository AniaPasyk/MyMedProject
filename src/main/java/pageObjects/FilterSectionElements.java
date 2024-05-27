package pageObjects;

import java.util.Calendar;

public interface FilterSectionElements {

    String searchButtons = "//span[text()=' Search ']";
    String loadingSpinner = "//*[@class='loading__spinner']";
    String aggregatedChart = "//*[@class='highcharts-background']";

    String selectStartDate = "//*[@ng-reflect-label='Start Date']";
    //  String dateCalendarView = "//mat-calendar[@id='mat-datepicker-0']/div";
    String selectEndDate = "//*[@ng-reflect-label='End Date']";
    String year2021 = "//div[contains(text(),' 2021 ')]";
    String year2022 = "//div[contains(text(),' 2022 ')]";
    String year2023 = "//div[contains(text(),' 2023 ')]";
    String year2024 = "//div[contains(text(),' 2024 ')]";

    String calendarMultiYearView = "//div[@ng-reflect-ng-switch='multi-year']";
    String calendarMonthsView = "//div[@ng-reflect-ng-switch='year']";
    String januaryMonth = "//div[text()=' JAN ']";
    String decemberMonth = "//div[text()=' DEC ']";
    //String countryFilter = "//div[@class='mat-form-field-wrapper ng-tns-c83-9']";
    String countryFilter = "//div[@class='mat-form-field-infix ng-tns-c111-7']";
    String specialtyFilter = "//div[@class='mat-form-field-infix ng-tns-c111-9']";
    String listOfCountries = "mat-select-0-panel";
    String FR = "//span[@class='mat-option-text' and text()=' FR ']";
    String frCheck = "//mat-option[@ng-reflect-value='FR']/mat-pseudo-checkbox";
    String esCheck = "//mat-option[@ng-reflect-value='ES']/mat-pseudo-checkbox";
    String emptyState = "//div[@class='empty-state-container ng-star-inserted']";
    String overlay = "//div[@class='cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing']";
    String allCheck = "//mat-option[@ng-reflect-value='all']/mat-pseudo-checkbox";
    String specialtyCheck = "//mat-option[@ng-reflect-value='specialty']/mat-pseudo-checkbox";


}
