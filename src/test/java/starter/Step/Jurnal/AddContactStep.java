package starter.Step.Jurnal;

import net.thucydides.core.annotations.Step;
import starter.Pages.Jurnal.ContactDetailPage;
import starter.Pages.Jurnal.ContactPage;
import starter.Pages.Jurnal.CreateContactPage;
import starter.Pages.Jurnal.MenuPage;

import static org.junit.Assert.assertTrue;

public class AddContactStep{

    MenuPage menuPage;
    ContactPage contactPage;
    CreateContactPage createContactPage;
    ContactDetailPage contactDetailPage;

    @Step
    public void clickContactMenu(){
        menuPage.open();
        menuPage.clickContactMenu();
    }

    @Step
    public void verifyContactPage(){
        String headerPage = contactPage.getHeaderPage();
        assertTrue(headerPage.equalsIgnoreCase("contacts"));
    }

    @Step
    public void clickNewContact(){
        contactPage.clickNewContact();
    }

    @Step
    public void verifyCreateNewContactPage(){
        assertTrue(createContactPage.getNewContactHeader().equalsIgnoreCase("create new contact"));
    }

    @Step
    public void fillContactName(String name){
        createContactPage.fillName(name + System.currentTimeMillis());
    }

    @Step
    public void selectAsCustomer(){
        createContactPage.chooseTypeasCustomer();
    }

    @Step
    public void selectDropdownTitle(){
        createContactPage.clickDropdownTitle();
        createContactPage.selectMrValue();
    }

    @Step
    public void verifyContactCreated(String expectedName){
        String actualName = contactDetailPage.getContactName();
        assertTrue(expectedName.contains(actualName));
        String type = contactDetailPage.getCustomerType();
        assertTrue(type.equalsIgnoreCase("customer"));
    }

    @Step
    public void clickAddButton(){
        createContactPage.clickAddButton();
    }
}
