package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ButtonPage extends BasePage{

    public SelenideElement acceptCookiesButton= $ ( ".fc-button.fc-cta-consent.fc-primary-button" );
    public SelenideElement buttonsButton = $ ( "div[class='element-list collapse show'] li[class='btn btn-light ']:nth-child(5)" );
    public SelenideElement clickMeButton = $ ("div[class='col-12 mt-4 col-md-6'] div:nth-child(4) button");
    public SelenideElement getTextDynamicMessage = $("p[id='dynamicClickMessage']");

    public ButtonPage ( String pageUrl) {
        super(pageUrl);
    }

}
