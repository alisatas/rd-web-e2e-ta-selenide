package tests;

import driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;

public class AddUserPageTest extends BaseTest {
    @BeforeMethod
    public void goToUrl () {
        pageManager.addUserPage.open ( );
        pageManager.buttonPage.acceptCookiesButton.shouldBe ( visible, Duration.ofSeconds ( 30 ) );
        pageManager.buttonPage.acceptCookiesButton.click ( );
    }

    @Test(priority = 1)
    public void addNewUser () {
        pageManager.addUserPage.addButton.click ( );
        pageManager.addUserPage.firstNameText.sendKeys ( "Ali Isa" );
        pageManager.addUserPage.surNameText.sendKeys ( "Tas" );
        pageManager.addUserPage.emailText.sendKeys ( "blas@hotmail.com" );
        pageManager.addUserPage.ageText.sendKeys ( "31" );
        pageManager.addUserPage.salaryText.sendKeys ( "3500" );
        pageManager.addUserPage.departmentText.sendKeys ( "QA" );
        pageManager.addUserPage.saveButton.click ( );
    }

    @Test(priority = 2)
    public void editUser () {
        pageManager.addUserPage.editButton.click ( );
        pageManager.addUserPage.firstNameText.clear ( );
        pageManager.addUserPage.firstNameText.sendKeys ( "Ali" );
        pageManager.addUserPage.surNameText.clear ( );
        pageManager.addUserPage.surNameText.sendKeys ( "Tas" );
        pageManager.addUserPage.emailText.clear ( );
        pageManager.addUserPage.emailText.sendKeys ( "blabladblas@hotmail.com" );
        pageManager.addUserPage.ageText.clear ( );
        pageManager.addUserPage.ageText.sendKeys ( "31" );
        pageManager.addUserPage.salaryText.clear ( );
        pageManager.addUserPage.salaryText.sendKeys ( "3600" );
        pageManager.addUserPage.departmentText.clear ( );
        pageManager.addUserPage.departmentText.sendKeys ( "Test" );
        pageManager.addUserPage.saveButton.click ( );
        pageManager.addUserPage.editedName.shouldHave ( exactText ( "Ali" ) );

    }
}