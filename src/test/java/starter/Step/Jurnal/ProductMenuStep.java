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
    public void addedCategory(String fruit){
        createNewProductPage.fillAddCategory(fruit);
    }

    @Step
    public void fillUnitType(String unittype){
        createNewProductPage.fillUnitType(unittype);
    }

    @Step
    public void fillDesc(String desc){
        createNewProductPage.fillDescription(desc);
    }

    @Step
    public void clickFieldSaleUnitPrice(){
        createNewProductPage.clickFieldSaleUnit();
    }
    @Step
    public void fillSaleUnitPrice(String saleUnitPrice){
        createNewProductPage.fillFieldSaleUnitPrice(saleUnitPrice);
    }

    @Step
    public void defaultTaxPPN(){
        createNewProductPage.setTaxPPN();
    }

    @Step
    public void clickCreateProductButton(){
        createNewProductPage.clickButtonCreateProduct();
    }

    @Step
    public void verifyProductCreated(){
        String actualName = productDetailPage.getProductName();
        assertTrue("apple".equals(actualName));

        String actualCode = productDetailPage.getProcuctCode();
        assertTrue("f322".equals(actualCode));

        String actualUnitType = productDetailPage.getUnit();
        assertTrue("kg".equals(actualUnitType));

        String actualCategory = productDetailPage.getCategory();
        assertTrue("fruit".equals(actualCategory));

        String actualDesc = productDetailPage.getDesc();
        assertTrue("An apple is an edible fruit produced by an apple tree (Malus domestica)".equals(actualDesc));

        String actualSalePrice = productDetailPage.getSaleUnitPrice();
        assertTrue("25000".equals(actualSalePrice));

        assertTrue(productDetailPage.getTaxAsPPN().equals("PPN"));
    }
}
