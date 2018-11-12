package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

import static com.codeborne.selenide.Selenide.open;

public class UserTests {
    private static MainPage mainPage;
    private static Authentication authentication;
    private static CreateAccount createAccount;
    private static MyAccount myAccount;

    @BeforeTest(groups= "smoke")
    public void autorizationUser(){
        authentication = new Authentication();
        myAccount = new MyAccount();
        mainPage = new MainPage();
        Configuration.browser="chrome";
        open("http://prestashop.qatestlab.com.ua" + PrestashopPath.authenticationPage);
        authentication.login("123test123@test.ru", "test123");
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
