import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Authentication;
import pages.Main;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestsUI {

    private static Main main;
    private static Authentication authentication;
    String email;

    @BeforeTest
    public void setup(){
        main = new Main();
        authentication = new Authentication();
        Configuration.browser="chrome";
        open("http://prestashop.qatestlab.com.ua");
    }

    @Test
    public void checkMainPage() throws InterruptedException{
        main.assertMainPage();
        main.clickSignInButton();
        authentication.assertMainPage();
        authentication.clickAccountField();
        email = authentication.valueNewEmail;
        authentication.enterEmailfield(email);
    }
}
