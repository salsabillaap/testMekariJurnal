package starter.Pages.Jurnal;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://account.mekari.com/users/sign_in")
public class LoginJurnalPage extends PageObject {
    @FindBy(id="user_email")
    WebElement fieldEmail;
    @FindBy(id="user_password")
    WebElement fieldPassword;
    @FindBy(id="new-signin-button")
    WebElement loginbutton;

    public void  inputUserEmail(){
        fieldEmail.sendKeys("salsabillaalischaputri@gmail.com");
    }

    public void inputPassword(){
        fieldPassword.sendKeys("Abc12345678");
    }

    public void clickLoginBUtton(){
        loginbutton.click();
    }
}
