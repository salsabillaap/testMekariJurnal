package starter.Pages.Jurnal;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://my.jurnal.id/contacts/new")
public class CreateContactPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[2]/div/div/span[2]")
    WebElement headerNewContactPage;

    @FindBy(id = "display_name")
    WebElement fieldDisplayName;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[3]/div[1]/div/div/div[3]/div[2]/label[1]")
    WebElement chooseAsCustomer;

    @FindBy(xpath = "//*[text()=\"Mr.\"]")
    WebElement title;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[3]/div[2]/div/div/div[2]/div[1]/div/div/span/span")
    WebElement dropdownTitle;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[3]/div[5]/div/button[1]")
    WebElement addButton;

    public String getNewContactHeader(){
        return headerNewContactPage.getText();
    }

    public void fillName(String name){
        fieldDisplayName.sendKeys(name);
    }

    public void chooseTypeasCustomer(){
        chooseAsCustomer.click();
    }

    public void clickDropdownTitle(){
        dropdownTitle.click();
    }
    public void selectMrValue(){
        title.click();
    }

    public void clickAddButton(){
        addButton.click();
    }
}
