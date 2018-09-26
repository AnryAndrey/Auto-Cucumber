package com.luxoft.dbdc.etsycom.stepdefs;

import com.luxoft.dbdc.etsycom.pageobjects.EtsyComPageObject;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StepsDefenition {


    private WebDriver webDriver;
    private EtsyComPageObject etsyPage;

    @Before
    public void initializeTest() {
        System.out.println("Starting our Cucumber tests");
        ChromeOptions options = new ChromeOptions();
        boolean isHeadless = Boolean.valueOf(System.getProperty("isHeadless"));
        options.setHeadless(isHeadless);
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("chromeDriverBinaryPath")+"/chromedriver.exe");
        webDriver = new ChromeDriver(options);
    }


    @Given("^I am on the main page$")
    public void i_am_on_the_main_page() {
        etsyPage = new EtsyComPageObject(webDriver);
    }

    @When("^I accept terms and conditions$")
    public void i_accept_terms_and_conditions() {
        etsyPage.acceptTermsAndConditions();
    }

    @When("I search for \"(.*?)\" items")
    public void i_search_for_items(String items) {
        etsyPage.searchFor(items);
    }

    @Then("I see search results")
    public void i_see_search_results() {
        etsyPage.isSearchResultsVisible();
    }

    @Then("I get search results for \"(.*?)\" items")
    public void i_get_search_results_for_items(String items) {
        Assertions.assertTrue(etsyPage.getPageTitle.contains(items));
    }

    @After
    public void tearDown(){
        webDriver.quit();
    }

}
