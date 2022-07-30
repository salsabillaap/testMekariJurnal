package starter.Pages.OrangeHRM;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/")
public class LoginPage extends PageObject {

    @FindBy(id="txtUsername")
    WebElement fieldUsername;

    @FindBy(xpath = "//*[@id=\"txtUsername\"]")
    WebElement getFieldUsernameWithXpath;

    @FindBy(id="txtPassword")
    WebElement fieldPassword;

    @FindBy(id="btnLogin")
    WebElement buttonLogin;

    public void inputUserName(){
        fieldUsername.sendKeys("Admin");
    }

    public  void inputPassword(){
        fieldPassword.sendKeys("admin123");
    }

    public void clickLoginButton(){
        buttonLogin.click();
    }
}
