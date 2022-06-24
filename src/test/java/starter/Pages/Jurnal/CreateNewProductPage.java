package starter.Pages.Jurnal;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://my.jurnal.id/products/new")
public class CreateNewProductPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"main-content\"]/header/div/div[1]/h1")
    WebElement headerCreateNewProduct;

    @FindBy(id = "name")
    WebElement fieldName;

    @FindBy(xpath = "//*[@id=\"product-new-react\"]/div/div/div/div/div/div[1]/div[3]/div[2]/input")
    WebElement fieldCode;

    @FindBy(xpath = "//*[@id=\"product-new-react\"]/div/div/div/div/div/div[1]/div[8]/div/div/div[1]/div/div[2]/div/div/div[2]/div/div/div[1]/h4/div/label[2]")
    WebElement fieldSellUnitPrice;

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

    public void fillSellUnitPrice(int price){
        fieldSellUnitPrice.sendKeys(String.valueOf(price));
    }

    public void clickButtonCreateProduct(){
        buttonCreateProduct.click();
    }

}
