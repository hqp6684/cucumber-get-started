package io.stepdefs;

import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.Calculator;

public class CalculatorStepDef {
    Calculator cal;

    @Before
    public void beforeCalScenario() {
        System.out.println("Before calculator");
    }

    @Given("^I have a calculator$")
    public void i_have_a_calculator() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        cal = new Calculator();
    }

    @When("^I add (-?\\d+) and (-?\\d+)$")
    public void i_add_and(int arg1, int arg2) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        // System.out.println(arg1 + " and " + arg2);
        cal.add(arg1, arg2);
    }

    @Then("^the result should be (-?\\d+)$")
    public void the_result_should_be(int arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(arg1, cal.getAddResult());
    }

}