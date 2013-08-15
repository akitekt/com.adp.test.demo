package com.adp.test.second.main;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ByMailStepdefs {



    @Given("^Employee of levelId (\\d+)$")
    public void Employee_of_levelId(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had

    }

    @When("^Deliver PayStub ByMail$")
    public void Deliver_PayStub_ByMail() throws Throwable {
        // Express the Regexp above with the code you wish you had

    }

    @Then("^Employee should receive PayStub of PayLevel (\\d+)$")
    public void Employee_should_receive_PayStub_of_PayLevel(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had

    }


    @And("^Employee should receive PayStub of PaymentAmount (\\d+)$")
    public void Employee_should_receive_PayStub_of_PaymentAmount(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had

    }


    @And("^Paycheck is delivered through \"([^\"]*)\"$")
    public void Paycheck_is_delivered_through(String carrier_name) throws Throwable {
        // Express the Regexp above with the code you wish you had

    }
}
