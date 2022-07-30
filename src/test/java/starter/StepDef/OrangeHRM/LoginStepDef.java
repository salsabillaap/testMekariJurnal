package starter.StepDef.OrangeHRM;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Step.Orange.LoginSteps;

public class LoginStepDef {

    @Steps
    LoginSteps loginSteps;
    @Given("I already on login page")
    public void iAlreadyOnLoginPage() {
        loginSteps.openLoginPage();
    }

    @When("I input my username")
    public void iInputMyUsername() {
        loginSteps.inputUsername();
    }

    @And("I input my password")
    public void iInputMyPassword() {
        loginSteps.inputPassword();
    }

    @And("I click login button")
    public void iClickLoginButton() {
        loginSteps.clickLoginButton();
    }

    @Then("The system show dashboard page")
    public void theSystemShowDashboardPage() {
        loginSteps.verifyDashboardPage();
    }

    @And("The system show welcome message")
    public void theSystemShowWelcomeMessage() {
        loginSteps.verifyDashboardPage();
    }
}
