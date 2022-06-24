package starter.StepDef.Jurnal;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Step.Jurnal.ProductMenuStep;

public class NewProductStepDef {

    @Steps
    ProductMenuStep productMenuStep;

    @When("I click product menu")
    public void iClickProductMenu() {
        productMenuStep.clickProductMenu();
    }

    @Then("Products page is appear")
    public void productsPageIsAppear() {
        productMenuStep.verifyProductsPage();
    }

    @When("I select new product in action dropdown")
    public void iSelectNewProductInActionDropdown() {
        productMenuStep.selectDropdownAction();
    }

    @Then("Create new product page appear")
    public void createNewProductPageAppear() {
        productMenuStep.verifyCreateNewProductPage();
    }

    @And("I fill name in info with {string}")
    public void iFillNameInInfoWith(String name) {
        productMenuStep.fillProductName(name);
    }

    @And("I fill code with {string}")
    public void iFillCodeWith(String code) {
        productMenuStep.fillProductCode(code);
    }

    @And("I fill sell unit price {int}")
    public void iFillSellUnitPrice(int sellprice) {
        productMenuStep.fillSellUnitPrice(sellprice);
    }

    @Then("I select as Create Product")
    public void iSelectAsCreateProduct() {
        productMenuStep.clickCreateProductButton();
    }

    @Then("New product is created")
    public void newProductIsCreated(String namecode) {
        productMenuStep.verifyProductCreated(namecode);
    }
}
