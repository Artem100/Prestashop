package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MyAccount {
    private String requiredPageCss="body#my-account";

    public void checkRequiredPage(){
        $(By.cssSelector(requiredPageCss)).isDisplayed();
    }
}
