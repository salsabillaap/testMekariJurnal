package starter.Step.Jurnal;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import starter.Pages.Jurnal.LoginJurnalPage;
import starter.Pages.OrangeHRM.LoginPage;

public class LoginJurnalStep extends PageObject {

    LoginJurnalPage loginJurnalPage;

    @Step
    public void loginInJurnal(){
        loginJurnalPage.open();
        loginJurnalPage.inputUserEmail();
        loginJurnalPage.inputPassword();
        loginJurnalPage.clickLoginBUtton();
    }
}
