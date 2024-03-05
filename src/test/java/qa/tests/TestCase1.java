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

    @Test
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





        //Uncheck FR
        //Check ES
        //Click on the 'Select Specialty'
        //Uncheck "all"
        //Check "specialty"
        //Click anywhere
        //Click on the 'Search' button

    }


}
