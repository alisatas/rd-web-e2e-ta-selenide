package common;

import pages.AddUserPage;
import pages.ButtonPage;
import tests.AddUserPageTest;

public class PageFactory {


    public static ButtonPage buildHomePage() {
        return new ButtonPage ("/inventory.html");
    }
    public static AddUserPage addUserPage(){
        return new AddUserPage ("");
    }


}
