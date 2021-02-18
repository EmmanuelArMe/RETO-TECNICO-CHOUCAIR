package com.Utest.certification.retotecnico.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/Utest.feature",
        tags = "@Regresion",
        glue = "com.Utest.certification.retotecnico.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
