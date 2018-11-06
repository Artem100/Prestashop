import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Authentication;
import pages.CreateAccount;
import pages.Main;
import pages.MyAccount;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestsUI {

    private static Main main;
    private static Authentication authentication;
    private static CreateAccount createAccount;
    private static MyAccount myAccount;
    String email;

    @BeforeTest
    public void setup(){
        main = new Main();
        authentication = new Authentication();
        createAccount = new CreateAccount();
        myAccount = new MyAccount();
        Configuration.browser="chrome";
        open("http://prestashop.qatestlab.com.ua");
    }

    @Test
    public void fullregistration() throws InterruptedException{
        main.assertMainPage();
        main.clickSignInButton();
        authentication.assertMainPage();
        authentication.clickAccountField();
        email = authentication.valueEmail();
        authentication.clickCreateAccountButton();
        createAccount.checkEmailField(email);// check availability of text with email in Email field
        createAccount.onlyRequiredFields();
        myAccount.checkRequiredPage();
    }
}
