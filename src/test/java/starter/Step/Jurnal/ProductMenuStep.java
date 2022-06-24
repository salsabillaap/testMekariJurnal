package starter.Step.Jurnal;

import net.thucydides.core.annotations.Step;
import starter.Pages.Jurnal.CreateNewProductPage;
import starter.Pages.Jurnal.MenuPage;
import starter.Pages.Jurnal.ProductDetailPage;
import starter.Pages.Jurnal.ProductsPage;

import static org.junit.Assert.assertTrue;

public class ProductMenuStep {

    MenuPage menuPage;
    ProductsPage productsPage;
    CreateNewProductPage createNewProductPage;
    ProductDetailPage productDetailPage;

    @Step
    public void clickProductMenu(){
        menuPage.open();
        menuPage.clickProductMenu();
    }

    @Step
    public void verifyProductsPage(){
        String header = productsPage.getProductsHeader();
        assertTrue(header.equalsIgnoreCase("products"));
    }

    @Step
    public void selectDropdownAction(){
        productsPage.clickDropdownAction();
        productsPage.selectNewProduct();
    }

    @Step
    public void verifyCreateNewProductPage(){
        String header = createNewProductPage.getHeaderCreateNew();
        assertTrue(header.equalsIgnoreCase("create new product / service"));
    }

    @Step
    public void fillProductName(String productname){
        createNewProductPage.fillName(productname + System.currentTimeMillis());
    }

    @Step
    public void fillProductCode(String productcode){
        createNewProductPage.fillCode(productcode + System.currentTimeMillis());
    }

    @Step
    public void fillSellUnitPrice(int sellprice){
        createNewProductPage.fillSellUnitPrice(sellprice);
    }

    @Step
    public void clickCreateProductButton(){
        createNewProductPage.clickButtonCreateProduct();
    }

    @Step
    public void verifyProductCreated(String expected){
        String actualName = productDetailPage.getProductName();
        assertTrue(expected.contains(actualName));

        String actualCode = productDetailPage.getProcuctCode();
        assertTrue(expected.contains(actualCode));

        productDetailPage.getSellUnitPrice();
    }
}
