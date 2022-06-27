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

    @When("I fill code with {string}")
    public void iFillCodeWith(String code) {
        productMenuStep.fillProductCode(code);
    }

    @And("I add category as {string}")
    public void iAddCategoryAs(String category) {
        productMenuStep.addedCategory(category);
    }

    @And("I add unit as {string}")
    public void iAddUnitAs(String unittype) {
        productMenuStep.fillUnitType(unittype);
    }

    @And("I fill descriptions {string}")
    public void iFillDescriptions(String desc) {
        productMenuStep.fillDesc(desc);
    }

    @And("I set default set tax as ppn")
    public void iSetDefaultSetTaxAsPpn() {
        productMenuStep.defaultTaxPPN();
    }

    @And("I fill sale unit price {string}")
    public void iFillSellUnitPrice(String saleunitPrice) {
        productMenuStep.clickFieldSaleUnitPrice();
        productMenuStep.fillSaleUnitPrice(saleunitPrice);
    }

    @Then("I select as Create Product")
    public void iSelectAsCreateProduct() {
        productMenuStep.clickCreateProductButton();
    }

    @Then("New product is created")
    public void newProductIsCreated() {
        productMenuStep.verifyProductCreated();
    }

    @And("I select product type as single default")
    public void iSelectProductTypeAsSingleDefault() {

    }

    @And("I uncheck on checkbox buy item")
    public void iUncheckOnCheckboxBuyItem() {
        productMenuStep.uncheckBuyItemCheckbox();
    }
}
