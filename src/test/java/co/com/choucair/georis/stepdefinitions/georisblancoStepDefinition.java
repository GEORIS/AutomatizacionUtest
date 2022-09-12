package co.com.choucair.georis.stepdefinitions;

import co.com.choucair.georis.model.DataUtestPage;
import co.com.choucair.georis.questions.Response;
import co.com.choucair.georis.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import java.util.List;

public class georisblancoStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^create a new user for the page Utest$")
    public void createANewUserForThePageUtest() {
        OnStage.theActorCalled("Georis").wasAbleTo(OpenUp.thePage());
    }

    @When("^the user enters the required data in the form$")
    public void theUserEntersTheRequiredDataInTheForm(List <DataUtestPage> DataPage) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillData.thePage(DataPage), FillLocation.thePage(DataPage),
                FillDevice.thePage(DataPage), FillPasswordPage.thePage(DataPage));
    }

    @Then("^ends with user registration$")
    public void endsWithUserRegistration(List <DataUtestPage> DataPage) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Response.thePage(DataPage)));
    }

}
