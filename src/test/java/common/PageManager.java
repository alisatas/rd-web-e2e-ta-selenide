package common;

import driver.DriverFactory;
import pages.AddUserPage;
import pages.ButtonPage;

public class PageManager {
    public AddUserPage addUserPage;
    public ButtonPage buttonPage;

    public PageManager() {

        DriverFactory.initDriver();
        buttonPage = PageFactory.buildHomePage();
        addUserPage= PageFactory.addUserPage ();
    }
}
