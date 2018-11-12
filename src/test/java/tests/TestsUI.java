package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Authentication;
import pages.CreateAccount;
import pages.MainPage;
import pages.MyAccount;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestsUI {

    private static MainPage mainPage;
    private static Authentication authentication;
    private static CreateAccount createAccount;
    private static MyAccount myAccount;
    String email;

    @BeforeTest
    public void setup(){
        mainPage = new MainPage();
        authentication = new Authentication();
        createAccount = new CreateAccount();
        myAccount = new MyAccount();
        Configuration.browser="chrome";
        open("http://prestashop.qatestlab.com.ua");
    }

    @Test
    public void fullregistration() throws InterruptedException{
        mainPage.assertMainPage();
        mainPage.clickSignInButton();
        authentication.assertMainPage();
        authentication.clickAccountField();
        email = authentication.valueEmail();
        authentication.clickCreateAccountButton();
        createAccount.checkEmailField(email);// check availability of text with email in Email field
        createAccount.onlyRequiredFields();
        myAccount.checkRequiredPage();
    }


    @Test(description = "Try to place an order for goods selected it on the main page", groups= "smoke")
    public void id02() throws InterruptedException{
        myAccount.gotoMainPage();
        mainPage.assertMainPage();
        mainPage.navigateOnGoods();
        mainPage.clickOnAddToCard();
        mainPage.clickProceedToCheckoutButtonCss();

    }


}
