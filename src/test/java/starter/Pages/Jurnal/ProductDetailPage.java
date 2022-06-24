package starter.Pages.Jurnal;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class ProductDetailPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"product-detail-react\"]/div[1]/div/div[1]/div/div[1]/div/div[1]")
    WebElement productNameDetail;

    @FindBy(xpath = "//*[@id=\"product-detail-react\"]/div[1]/div/div[1]/div/div[1]/div/div[2]")
    WebElement productCodeDetail;

    @FindBy(xpath = "//*[@id=\"product-detail-react\"]/div[1]/div/div[2]/div[2]/div[2]/div/div[3]/span")
    WebElement sellUnitPriceDetail;

    public String getProductName(){
        return productNameDetail.getText();
    }

    public String getProcuctCode(){
        return productCodeDetail.getText();
    }

    public boolean getSellUnitPrice(){
        return sellUnitPriceDetail.isDisplayed();
    }
}
