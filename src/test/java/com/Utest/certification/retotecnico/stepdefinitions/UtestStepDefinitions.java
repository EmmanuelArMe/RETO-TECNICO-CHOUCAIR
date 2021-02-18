package com.Utest.certification.retotecnico.stepdefinitions;

import com.Utest.certification.retotecnico.model.UtestData;
import com.Utest.certification.retotecnico.questions.Answer;
import com.Utest.certification.retotecnico.tasks.OpenUp;
import com.Utest.certification.retotecnico.tasks.PersonalRegister;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinitions {
    @Before
    public void setStage () { OnStage.setTheStage(new OnlineCast()); }

    @Given("^Emmanuel wants to overcome the technical challenge to work at Choucair they try to automate the registration$")
    public  void emmanuelWantsToOvercomeTheTechnicalChallengeToWorkAtChoucairTheyTryToAutomateTheRegistration(List<UtestData> utestData) throws Exception {
        OnStage.theActorCalled("Emmanuel").wasAbleTo(OpenUp.thePage(),(PersonalRegister.onThePage(utestData.get(0).getStrFirstName(),
                utestData.get(0).getStrLastName(),
                utestData.get(0).getStrEmailAddress(),
                utestData.get(0).getStrMonthOfBirth(),
                utestData.get(0).getStrDayOfBirth(),
                utestData.get(0).getStrYearOfBirth(),
                utestData.get(0).getStrLanguages())))
    }

    @When("^He tries to automate the registration in (.*)$")
    public void heTriesToAutomateTheRegistrationInUtest(List<UtestData> utestData)
            throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo();
    }

    @Then("^manage to register in (.*)$")
    public void manageToRegisterInUtest(List<UtestData> utestData) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utestData.get(0))));
    }
}
