package com.luxoft.dbdc.etsycom.stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsDefenition {


    @Given("I am on the main page")
    public void i_am_on_the_main_page() {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println("Main Page Step");
    }

    @When("I accept terms and conditions")
    public void i_accept_terms_and_conditions() {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println("Accept terms and conditions Step");
    }

    @When("I search for {string} items")
    public void i_search_for_items(String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println("I search for {string} items STEPS");
    }

    @Then("I see search results")
    public void i_see_search_results() {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println("Search Result step");
    }

    @Then("I get search results for {string} items")
    public void i_get_search_results_for_items(String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println("final step");
    }


}
