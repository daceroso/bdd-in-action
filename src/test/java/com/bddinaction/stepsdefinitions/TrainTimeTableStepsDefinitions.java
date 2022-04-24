package com.bddinaction.stepsdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.LocalTime;
import java.util.List;

public class TrainTimeTableStepsDefinitions {

    @Given("the {line} train to {station} leaves {station} at {times}")
    public void theTrainLeavesAt(String line,
                                 String to,
                                 String from,
                                 List<LocalTime> departureTimes
    ) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Travis want to travel from {} to {} at {}")
    public void travel(String from, String to, String departureTime) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("he should be told about the trains at: {}")
    public void heShouldBeToldAboutTheTrainsAt(String expectedTimes) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
