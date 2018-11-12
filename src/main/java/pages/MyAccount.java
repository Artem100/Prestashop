package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MyAccount {

    private String requiredPageCss="body#my-account";
    private String gotoMainPageButton = "img.logo.img-responsive";

    public void checkRequiredPage(){
        $(By.cssSelector(requiredPageCss)).isDisplayed();
    }

    public void gotoMainPage(){
        $(By.cssSelector(gotoMainPageButton)).click();
    }
}
