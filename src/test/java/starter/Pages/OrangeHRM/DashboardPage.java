package starter.Pages.OrangeHRM;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/index.php/dashboard")
public class DashboardPage extends PageObject {
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/h1")
    WebElement dashboardHeader;

    @FindBy( id = "panel_resizable_1_0")
    WebElement panelQuickLaunch;

    @FindBy(xpath = "//*[@id=\"welcome\"]")
    WebElement WelcomeMessage;

    public String getHeaderText() {
        return dashboardHeader.getText();
    }

    public boolean isQuickLaunchAppear() {
        return panelQuickLaunch.isDisplayed();
    }

    public boolean verifyWelcome() {
        return WelcomeMessage.isDisplayed();
    }
}
