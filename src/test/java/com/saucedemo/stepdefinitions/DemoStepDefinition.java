package com.saucedemo.stepdefinitions;

import com.saucedemo.models.LoginModel;
import com.saucedemo.models.UserModel;
import com.saucedemo.questions.ValidateText;
import com.saucedemo.tasks.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DemoStepDefinition {

    private LoginModel loginModel;
    private UserModel userModel;

    @Before
    public void initialConfiguration(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Jose");
    }

    @Given("^that i login as a stander user$")
    public void thatILoginAsAStanderUser( DataTable data) {
        loginModel = LoginModel.setLoginModel(data.asList());
        theActorInTheSpotlight().wasAbleTo(OpenPage.inTheBrowser());
        theActorInTheSpotlight().attemptsTo(Login.inPage(loginModel));
    }
    @When("^i buy a product")
    public void iBuyAProduct(DataTable data) {
        userModel = UserModel.setUserModel(data.asList());
        theActorInTheSpotlight().attemptsTo(AddProduct.toACar());
        theActorInTheSpotlight().attemptsTo(AddInformation.inTheFields(userModel));
        theActorInTheSpotlight().attemptsTo(CheckOverview.ofThePurchase());

    }
    @Then("^i should see the complete message (.*)$")
    public void iShouldSeeTheCompleteMessage(String expectedMessage) {
        theActorInTheSpotlight().should(seeThat("The text message is the expected", ValidateText.inThePage(expectedMessage, Serenity.sessionVariableCalled("actualMessage"))));
    }
}
