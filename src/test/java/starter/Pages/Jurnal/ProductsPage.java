package starter.Pages.Jurnal;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://my.jurnal.id/products/products_and_services")
public class ProductsPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"main-content\"]/header/div/div[1]/div/div/h2")
    WebElement headerProductsPage;

    @FindBy(xpath = "//*[@id=\"main-content\"]/header/div/div[2]/div/div/div[1]/div/div[2]/i")
    WebElement dropdownAction;

    @FindBy(xpath = "//*[@id=\"main-content\"]/header/div/div[2]/div/div/div[2]/div[1]/a/div")
    WebElement Product;

    public String getProductsHeader(){
        return headerProductsPage.getText();
    }

    public void clickDropdownAction(){
        dropdownAction.click();
    }

    public void selectNewProduct(){
        Product.click();
    }
}
