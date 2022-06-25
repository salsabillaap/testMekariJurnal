package starter.Pages.Jurnal;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class ProductDetailPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"product-detail-react\"]/div[1]/div/div[1]/div/div[1]/div/div[1]")
    WebElement productNameDetail;

    @FindBy(xpath = "//*[@id=\"product-detail-react\"]/div[1]/div/div[1]/div/div[1]/div/div[2]")
    WebElement productCodeDetail;

    @FindBy(xpath = "//*[@id=\"product-detail-react\"]/div[1]/div/div[1]/div/div[4]/div[2]")
    WebElement currentStockUnit;

    @FindBy(xpath = "//*[@id=\"product-detail-react\"]/div[1]/div/div[1]/div/div[5]/div[2]")
    WebElement minStockLimitUnit;

    @FindBy(xpath = "//*[@id=\"product-detail-react\"]/div[1]/div/div[1]/div/div[6]/div[2]")
    WebElement productCategoryDetail;

    @FindBy(xpath = "//*[@id=\"product-detail-react\"]/div[1]/div/div[1]/div/div[7]/div[2]")
    WebElement detailDesc;

    @FindBy(xpath = "//*[@id=\"product-detail-react\"]/div[1]/div/div[2]/div[2]/div[2]/div/div[3]/span")
    WebElement saleUnitPriceDetail;

    @FindBy(xpath = "//*[@id=\"product-detail-react\"]/div[1]/div/div[2]/div[2]/div[2]/div/div[7]")
    WebElement defaultTax;

    public String getProductName(){
        return productNameDetail.getText();
    }

    public String getProcuctCode(){
        return productCodeDetail.getText();
    }

    public String getUnit(){
        if (currentStockUnit == minStockLimitUnit){
            currentStockUnit.getText();
        } else {
            minStockLimitUnit.getText();
        }
        return null;
    }

    public String getCategory(){
        return productCategoryDetail.getText();
    }

    public String getDesc(){
        return detailDesc.getText();
    }

    public String getSaleUnitPrice(){
        return saleUnitPriceDetail.getText();
    }

    public String getTaxAsPPN(){
        return defaultTax.getText();
    }
}
