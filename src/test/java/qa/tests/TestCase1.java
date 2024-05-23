package qa.tests;

import baseTest.BaseTest;
import org.testng.annotations.Test;
import pageEvents.DevicesEvents;
import pageEvents.LoginPageEvents;
import pageEvents.WelcomePageEvents;
import utils.ElementFetch;

public class TestCase1 extends BaseTest {

    ElementFetch ele = new ElementFetch();
    LoginPageEvents loginPage = new LoginPageEvents();
    WelcomePageEvents welcomePage = new WelcomePageEvents();
    DevicesEvents devicesPage = new DevicesEvents();


    @Test( enabled=false )
    public void TC1(){
        logger.info("Login into MedScape-Data");
        loginPage.logIn();
        welcomePage.verifyLoggedIn();
        logger.info("Welcome Page is visible");
        welcomePage.expandGeneralListAndVerify();
        welcomePage.headToDevices();
        devicesPage.clickOnTheSearchButton();
        devicesPage.verifyVisibilityOfTheChart();

    }

    @Test( enabled=false )
    public void TC2() {
        loginPage.logIn();
        welcomePage.verifyLoggedIn();
        welcomePage.verifyLoggedIn();
        logger.info("Welcome Page is visible");
        welcomePage.expandGeneralListAndVerify();
        welcomePage.headToDevices();
        devicesPage.clickOnTheSelectStartDate();
        devicesPage.select2021Year();
        devicesPage.selectJan();
        devicesPage.selectEndDate();
        devicesPage.select2021Year();
        devicesPage.selectDec();
        devicesPage.expandCountryFilter();
        devicesPage.unCheckFR();
        devicesPage.checkES();
        devicesPage.expandSpecialtyFilter();
        devicesPage.uncheckAll();
        devicesPage.checkSpecialty();
        devicesPage.clickOverlay();
        devicesPage.clickOnTheSearchButton();
        devicesPage.verifyVisibilityOfTheChart();
    }

    @Test
    public void TC3() {
        loginPage.logIn();
        welcomePage.verifyLoggedIn();
        welcomePage.verifyLoggedIn();
        logger.info("Welcome Page is visible");
        welcomePage.expandGeneralListAndVerify();
        welcomePage.headToContentTypes();
        devicesPage.clickOnTheSelectStartDate();




    }

    //Click on the 'Select Start Date'
    //Select "2023" from available years
    //Select "JAN" from the available months
    //Click on the 'Select End Date'
    //Select "2023" from available years
    //Select "DEC" from the available months
    //Click on the 'Select Country' filter
    //Uncheck FR
    //Click on the 'Select Specialty'
    //Verify "all" is checked
    //Click anywhere
    //Click on the 'Search' button
    //Verify alert is displayed
    //Verify alert is not displayed











        //Click on the 'Search' button

    }



