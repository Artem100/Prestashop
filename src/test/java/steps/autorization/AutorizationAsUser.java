package steps.autorization;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Authentication;
import pages.MyAccount;
import pages.PrestashopPath;

import static com.codeborne.selenide.Selenide.open;

public class AutorizationAsUser {

    private static Authentication authentication;
    private static MyAccount myAccount;


    @BeforeTest(groups= "smoke")
    public void autorizationUser(){
        authentication = new Authentication();
        myAccount = new MyAccount();
        Configuration.browser="chrome";
        open("http://prestashop.qatestlab.com.ua" + PrestashopPath.authenticationPage);
        authentication.login("123test123@test.ru", "test123");
        myAccount.checkRequiredPage();
    }
}
