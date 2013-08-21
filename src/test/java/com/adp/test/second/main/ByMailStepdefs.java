package com.adp.test.second.main;


import com.google.inject.Guice;
import com.google.inject.Injector;
import cucumber.api.java.en.Given;

public class ByMailStepdefs {

    private Injector injector;
    private Employee employee;


    @Given("^Employee of levelId (\\d+)$")
    public void Employee_of_levelId(int levelId) throws Throwable {
        injector = Guice.createInjector(new BootStrapModule());
        employee = injector.getInstance(Employee.class);
        employee.levelId = levelId;

    }




}
