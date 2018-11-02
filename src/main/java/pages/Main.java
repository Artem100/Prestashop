package pages;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;

public class Main {

    private String clickSignInButton = "a.login";

    public boolean assertMainPage(){
        //Assert.assertTrue($(By.cssSelector("[title='http://prestashop.qatestlab.com.ua/']")).isDisplayed());
        return title().contains("http://prestashop.qatestlab.com.ua/");
    }

    public void clickSignInButton(){
        $(By.cssSelector(clickSignInButton)).click();
    }
}
