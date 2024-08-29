package qa.tests;

import baseTest.BaseTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import commons.CommonsEvents;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageEvents.ContentTypesEvents;
import pageEvents.DevicesEvents;
import pageEvents.LoginPageEvents;
import pageEvents.WelcomePageEvents;
import utils.ElementFetch;



public class TestCase1 extends BaseTest  {

    ElementFetch ele;
    LoginPageEvents loginPage;
    WelcomePageEvents header;
    DevicesEvents filters;
    ContentTypesEvents contentTypes;
    CommonsEvents commons;

    @BeforeMethod
    public void beforeClass() {
        ele = new ElementFetch(driver, sparkReporter,extent, logger);
        loginPage  = new LoginPageEvents(driver, sparkReporter,extent, logger);
        header = new WelcomePageEvents(driver, sparkReporter,extent, logger);
        filters = new DevicesEvents(driver, sparkReporter,extent, logger);
        contentTypes  = new ContentTypesEvents(driver, sparkReporter,extent, logger);
        commons  = new CommonsEvents(driver, sparkReporter,extent, logger);


    }
    public TestCase1(WebDriver driver, ExtentSparkReporter sparkReporter, ExtentReports extent, ExtentTest logger) {
        super(driver, sparkReporter, extent, logger);
    }


    @Test( enabled=false )
    public void TC1(){
        logger.info("Login into MedScape-Data");
        loginPage.logIn();
        header.verifyLoggedIn();
        logger.info("Welcome Page is visible");
        header.expandGeneralListAndVerify();
        header.headToDevices();
        filters.clickOnTheSearchButton();
        filters.verifyVisibilityOfTheChart();

    }

    @Test( enabled=false )
    public void TC2() {
        loginPage.logIn();
        header.verifyLoggedIn();
        header.verifyLoggedIn();
        logger.info("Welcome Page is visible");
        header.expandGeneralListAndVerify();
        header.headToDevices();
        filters.clickOnTheSelectStartDate();
        filters.select2021Year();
        filters.selectJan();
        filters.selectEndDate();
        filters.select2021Year();
        filters.selectDec();
        filters.expandCountryFilter();
        filters.unCheckFR();
        filters.checkES();
        filters.expandSpecialtyFilter();
        filters.uncheckAll();
        filters.checkSpecialty();
        filters.clickOverlay();
        filters.clickOnTheSearchButton();
        filters.verifyVisibilityOfTheChart();
    }

    @Test( enabled=false )
    public void TC3() {
        loginPage.logIn();
        header.verifyLoggedIn();
        //header.verifyLoggedIn();
        logger.info("Welcome Page is visible");
        header.expandGeneralListAndVerify();
        header.headToContentTypes();
        filters.clickOnTheSelectStartDate();
        filters.select2023();
        filters.selectJan();
        filters.selectEndDate();
        filters.select2023();
        filters.selectDec();
        filters.expandCountryFilter();
        filters.verifyFRisChecked();
        filters.expandSpecialtyFilter();
        filters.verifyAllisChecked();
        filters.clickOverlay();
        filters.clickOnTheSearchButton();
        //contentTypes.verifyVisibilityOfAlert();

        if(contentTypes.isAlertDisplayed()) {
            logger.info("Alert is displayed");
        }  else {
            logger.info("Alert is not displayed");
        }
    }

    @Test
    public void testYearList() {
        loginPage.logIn();
        header.verifyLoggedIn();
     //   header.verifyLoggedIn();
        logger.info("Welcome Page is visible");
        header.expandGeneralListAndVerify();
        header.headToDevices();
        filters.clickOnTheSelectStartDate();
        commons.selectYear("2023");


    }



    }



