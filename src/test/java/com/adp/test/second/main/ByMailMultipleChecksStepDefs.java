package com.adp.test.second.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;


public class ByMailMultipleChecksStepDefs {

    private Injector injector;

    public ByMailMultipleChecksStepDefs()
    {
        injector = Guice.createInjector(new BootStrapModule());
    }

    Map<String,Double> employeesPays = new HashMap<String, Double>() {
    };


    @Given("^the following employee exist:$")
    public void the_following_employee_exist(DataTable cases) throws Throwable {
        System.out.println(cases);
        for (List<String> ecase : cases.raw()) {
            Employee employee = injector.getInstance(Employee.class);
            employee.levelId = Integer.parseInt(ecase.get(2));
            employeesPays.put(ecase.get(0),employee.getPayStub().Payment);

        }

    }

    @Then("^I should see the following paychecks:$")
    public void I_should_see_the_following_paychecks(DataTable results) throws Throwable {
        System.out.println(results);
        for (List<String> result : results.raw()) {
            assertEquals(Double.parseDouble(result.get(1)) , employeesPays.get(result.get(0)), 0.001);
        }
    }
}
