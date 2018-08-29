
package io.stepdefs;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.Belly;
import org.junit.Assert;

public class BellyStepDef {
    Belly belly;

    @Before
    public void beforeScenario() {
        System.out.println("Before belly");
    }

    @Given("^I have (\\d+) cukes in my belly$")
    public void i_have_cukes_in_my_belly(int cukes) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        this.belly = new Belly();
        belly.setCuke(cukes);
    }

    @When("^I wait (\\d+) hour$")
    public void i_wait_hour(int hours) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        belly.waitFor(hours);

    }

    @Then("^my belly should be (.*)$")
    public void my_belly_should_growlll(String sound) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        int waitedTime = belly.getWaitedTime();
        if (waitedTime >= 5) {
            Assert.assertEquals(sound, belly.getSound());
        } else {
            Assert.assertEquals(sound, belly.getSound());
        }
    }

}