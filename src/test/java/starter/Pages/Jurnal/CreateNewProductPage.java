package starter.Pages.Jurnal;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://my.jurnal.id/products/new")
public class CreateNewProductPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"main-content\"]/header/div/div[1]/h1")
    WebElement headerCreateNewProduct;

    @FindBy(id = "name")
    WebElement fieldName;

    @FindBy(xpath = "//*[@id=\"product-new-react\"]/div/div/div/div/div/div[1]/div[3]/div[2]/input")
    WebElement fieldCode;

    @FindBy(xpath = "//*[@id=\"react-select-2--value\"]/div[1]")
    WebElement clickCategory;
    @FindBy(xpath = "//*[@id=\"react-select-2--value\"]/div[2]/input")
    WebElement addCategory;

    @FindBy(xpath = "//*[@id=\"product-new-react\"]/div/div/div/div/div/div[1]/div[5]/div[2]/div/div/div/span[2]")
    WebElement clearValue;

    //@FindBy(xpath = "//*[@id=\"react-select-3--value\"]/div[1]")
    @FindBy(xpath = "//*[@id=\"react-select-3--value\"]/div[2]/input")
    WebElement fieldAddUnit;

    @FindBy(xpath = "//*[@id=\"product-new-react\"]/div/div/div/div/div/div[1]/div[6]/div[2]/textarea")
    WebElement fieldDescription;

    @FindBy(id = "buy-panel")
    WebElement checkboxBuyItem;

    @FindBy(xpath = "//*[@id=\"product-new-react\"]/div/div/div/div/div/div[1]/div[8]/div/div/div[1]/div/div[2]/div/div/div[2]/div/div/div[1]/h4/div")
    WebElement fieldSaleUnitPrice;
    @FindBy(xpath = "//*[@id=\"product-new-react\"]/div/div/div/div/div/div[1]/div[8]/div/div/div[1]/div/div[2]/div/div/div[2]/div/div/div[1]/h4/div/label[1]")
    WebElement fillFieldSaleUnitPrice;

    @FindBy(xpath = "//*[@id=\"product-new-react\"]/div/div/div/div/div/div[1]/div[8]/div/div/div[1]/div/div[2]/div/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/span[2]/span")
    WebElement dropdownTax;
    @FindBy(xpath = "\"//*[text()=\\\"PPN\\\"]\"")
    WebElement selectppn;

    @FindBy(xpath = "//*[@id=\"product-new-react\"]/div/div/div/div/div/div[1]/div[9]/div/button[1]")
    WebElement buttonCreateProduct;

    public String getHeaderCreateNew(){
        return headerCreateNewProduct.getText();
    }

    public void fillName(String name){
        fieldName.sendKeys(name);
    }

    public void fillCode(String code){
        fieldCode.sendKeys(code);
    }

    public void fillAddCategory(String fruit){
        clickCategory.click();
        addCategory.sendKeys(fruit);
        WebElement inputCategory = getDriver().findElement(By.xpath("//*[text()=\"+ " + fruit + "(new)\"]"));
        inputCategory.click();
    }

    public void fillUnitType(String unitType){
        clearValue.click();
        fieldAddUnit.sendKeys(unitType);
        WebElement inputUnit = getDriver().findElement(By.xpath("//*[text()=\"+ " + unitType + "(new)\"]"));
        inputUnit.click();
    }

    public void fillDescription(String desc){
        fieldDescription.sendKeys(desc);
    }

    public void clickBuyItemCheckbox(){
        checkboxBuyItem.click();
    }

    public void clickFieldSaleUnit(){
        fieldSaleUnitPrice.click();
    }

    public void fillFieldSaleUnitPrice(String saleUnitPrice){
        fillFieldSaleUnitPrice.click();
        fillFieldSaleUnitPrice.sendKeys(saleUnitPrice);
    }

    public void setTaxPPN(){
        dropdownTax.click();
        selectppn.click();
    }

    public void clickButtonCreateProduct(){
        buttonCreateProduct.click();
    }

}
