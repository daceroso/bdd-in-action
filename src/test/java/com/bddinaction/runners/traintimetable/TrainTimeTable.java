package com.bddinaction.runners.traintimetable;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/itineraries",
        snippets = CAMELCASE,
        monochrome = true
)
public class TrainTimeTable {
}
