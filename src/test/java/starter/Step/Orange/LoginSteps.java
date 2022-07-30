package starter.Step.Orange;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import starter.Pages.OrangeHRM.DashboardPage;
import starter.Pages.OrangeHRM.LoginPage;

import static org.junit.Assert.assertTrue;

public class LoginSteps extends PageObject {
    LoginPage loginpage;
    DashboardPage dashboardPage;

    @Step
    public void openLoginPage(){
        loginpage.open();
    }

    @Step
    public void inputUsername(){
        loginpage.inputUserName();
    }

    @Step
    public void inputPassword(){
        loginpage.inputPassword();
    }

    @Step
    public void clickLoginButton(){
        loginpage.clickLoginButton();
    }

    @Step
    public void verifyDashboardPage(){
        String header = dashboardPage.getHeaderText();
        assertTrue(header.equalsIgnoreCase("dashboard"));
        assertTrue(dashboardPage.isQuickLaunchAppear());
        assertTrue(dashboardPage.verifyWelcome());
    }
}
