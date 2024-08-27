package qa.tests;

import baseTest.BaseTest;
import commons.CommonsEvents;
import org.testng.annotations.Test;
import pageEvents.ContentTypesEvents;
import pageEvents.FilteringEvents;
import pageEvents.LoginPageEvents;
import pageEvents.HeaderSectionEvents;
import utils.ElementFetch;

public class TestCase1 extends BaseTest {

    ElementFetch ele = new ElementFetch();
    LoginPageEvents loginPage = new LoginPageEvents();
    HeaderSectionEvents header = new HeaderSectionEvents();
    FilteringEvents filters = new FilteringEvents();
    ContentTypesEvents contentTypes = new ContentTypesEvents();
    CommonsEvents commons = new CommonsEvents();


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



