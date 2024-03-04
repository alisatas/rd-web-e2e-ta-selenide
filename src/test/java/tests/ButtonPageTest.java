package tests;

import driver.DriverFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;
import static com.codeborne.selenide.Condition.visible;


public class ButtonPageTest extends BaseTest{

    @BeforeMethod
    public void goToUrl(){
        pageManager.addUserPage.open ();
        String URL = DriverFactory.currentDriver ( ).getCurrentUrl ( );
        Assert.assertEquals(URL, "https://demoqa.com/webtables" );
        pageManager.buttonPage.acceptCookiesButton.shouldBe ( visible, Duration.ofSeconds(30));
        pageManager.buttonPage.acceptCookiesButton.click();
    }
    @Test(priority = 1)
    public void clickButtons(){
        pageManager.buttonPage.buttonsButton.click ();
        String URL = DriverFactory.currentDriver ( ).getCurrentUrl ( );
        Assert.assertEquals(URL, "https://demoqa.com/buttons" );
    }

    @Test(priority = 2)
    public void checkMessage(){
        pageManager.buttonPage.buttonsButton.click ();
        pageManager.buttonPage.clickMeButton.click ();
        String actualElement= pageManager.buttonPage.getTextDynamicMessage.getText();
        Assert.assertEquals(actualElement, "You have done a dynamic click" );

    }
}
