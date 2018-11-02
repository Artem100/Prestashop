package pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;

public class Authentication {

    public String createAccountFieldID = "email_create";
    private String createAccountButtonID = "SubmitCreate";
    public String emailField = "email";
    public String valueNewEmail;



    public boolean assertMainPage(){
        return title().contains("Аутентификация - http://prestashop.qatestlab.com.ua/");
    }

    public void clickAccountField(){
        $(By.id(createAccountFieldID)).sendKeys(RandomStringUtils.randomAlphabetic(5)+"@mail.te");
        valueNewEmail = $(By.id(createAccountFieldID )).getValue();
    }

    public void clickCreateAccountButton(){
        $(By.id(createAccountButtonID)).click();
    }

    public void enterEmailfield(String email){
        $(By.id(emailField)).sendKeys(email);
    }

    public void getEmailValue(){
        $(By.id(createAccountFieldID )).getValue();
    }






}
