package starter.Pages.Jurnal;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://my.jurnal.id/")
public class MenuPage extends PageObject {
    @FindBy(id="contacts-li")
    WebElement contactMenu;

    @FindBy(id = "products-li")
    WebElement productMenu;

    public void clickContactMenu(){
        contactMenu.click();
    }

    public void clickProductMenu(){
        productMenu.click();
    }
}
