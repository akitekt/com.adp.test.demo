package com.adp.test.second.main;


import com.google.inject.Guice;
import com.google.inject.Injector;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static junit.framework.Assert.assertEquals;

public class ByMailStepdefs {

    private Injector injector;
    private Employee employee;
    private PayStub paystub;


    @Given("^Employee of levelId (\\d+)$")
    public void Employee_of_levelId(int levelId) throws Throwable {
        injector = Guice.createInjector(new BootStrapModule());
        employee = injector.getInstance(Employee.class);
        employee.levelId = levelId;
    }


    @When("^Deliver PayStub ByMail$")
    public void Deliver_PayStub_ByMail() throws Throwable {
        // Express the Regexp above with the code you wish you had
        paystub = employee.getPayStub();
    }


    @Then("^Employee should receive PayStub of PayLevel (\\d+)$")
    public void Employee_should_receive_PayStub_of_PayLevel(int expected) throws Throwable {
        // Express the Regexp above with the code you wish you had
        assertEquals(expected,paystub.PayGradeId);
    }

    @And("^Employee should receive PayStub of PaymentAmount (\\d+)$")
    public void Employee_should_receive_PayStub_of_PaymentAmount(int expectedAmount) throws Throwable {
        // Express the Regexp above with the code you wish you had
        assertEquals(expectedAmount,paystub.Payment,0.001);
    }
}
