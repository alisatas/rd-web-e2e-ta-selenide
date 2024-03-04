package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class AddUserPage extends BasePage{

    public SelenideElement addButton = $("button#addNewRecordButton");
    public SelenideElement firstNameText = $("input#firstName");
    public SelenideElement surNameText = $("input#lastName");
    public SelenideElement emailText = $("input#userEmail");
    public SelenideElement ageText = $("input#age");
    public SelenideElement salaryText = $("input#salary");
    public SelenideElement departmentText = $("input#department");
    public SelenideElement saveButton = $("button#submit");
    public SelenideElement editButton = $("span#edit-record-3 >svg");
    public SelenideElement editedName=$("#app > div > div > div > div.col-12.mt-4.col-md-6 > div.web-tables-wrapper > div.ReactTable.-striped.-highlight > div.rt-table > div.rt-tbody > div:nth-child(3) > div > div:nth-child(1)");

    public AddUserPage ( String pageUrl ) {
        super ( pageUrl );
    }
}
