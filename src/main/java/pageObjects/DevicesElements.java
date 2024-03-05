package pageObjects;

public interface DevicesElements {

    String searchButtons = "//span[text()=' Search ']";
    String loadingSpinner = "//*[@class='loading__spinner']";
    String aggregatedChart = "//*[@class='highcharts-background']";
    String selectStartDate = "//*[@ng-reflect-label='Select Start Date']";
  //  String dateCalendarView = "//mat-calendar[@id='mat-datepicker-0']/div";
    String selectEndDate = "//*[@ng-reflect-label='Select End Date']";
    String year2021 = "//div[contains(text(),' 2021 ')]";
    String calendarMultiYearView = "//div[@ng-reflect-ng-switch='multi-year']";
    String calendarMonthsView = "//div[@ng-reflect-ng-switch='year']";
    String januaryMonth = "//div[text()=' JAN ']";
    String decemberMonth = "//div[text()=' DEC ']";
    String countryFilter = "//div[@class='mat-form-field-wrapper ng-tns-c83-9']";
    String listOfCountries = "mat-select-0-panel";


}
