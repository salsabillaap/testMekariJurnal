package starter.StepDef.Jurnal;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Step.Jurnal.AddContactStep;

public class AddContactStepDef {

    @Steps
    AddContactStep addContactStep;
    @When("I click contact menu")
    public void iClickContactMenu() {
        addContactStep.clickContactMenu();
    }

    @Then("Contact page appear")
    public void contactPageAppear() {
        addContactStep.verifyContactPage();
    }

    @When("I click new contact")
    public void iClickNewContact() {
        addContactStep.clickNewContact();
    }

    @Then("Create new contact page appear")
    public void createNewContactPageAppear() {
        addContactStep.verifyCreateNewContactPage();
    }

    @When("I fill name with {string}")
    public void iFillNameWith(String name) {
        addContactStep.fillContactName(name);
    }

    @And("I choose contact type as customer")
    public void iChooseContactTypeAsCustomer() {
        addContactStep.selectAsCustomer();
    }

    @And("I click add button")
    public void iClickAddButton() {
        addContactStep.clickAddButton();
    }

    @Then("Contact with name {string} is created")
    public void contactWithNameIsCreated(String name) {
        addContactStep.verifyContactCreated(name);
    }

    @When("I select Mr. in Contact Name")
    public void iSelectMrInContactName() {
        addContactStep.selectDropdownTitle();
    }
}
