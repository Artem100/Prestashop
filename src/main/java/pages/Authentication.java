package pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;

public class Authentication {

    private String createAccountFieldID = "email_create";
    private String createAccountButtonID = "SubmitCreate";
    private String emailField = "email";
    private String passFieldID = "passwd";
    private String sigInButtonID = "SubmitLogin";
    private String valueNewEmail;


    public boolean assertMainPage(){
        return title().contains("Аутентификация - http://prestashop.qatestlab.com.ua/");
    }

    public void clickAccountField(){
        $(By.id(createAccountFieldID)).sendKeys(RandomStringUtils.randomAlphabetic(5)+"@mail.te");
        valueNewEmail = $(By.id(createAccountFieldID )).getValue();
    }

    public String valueEmail(){ // return value of created email
        return valueNewEmail;
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

    public void clickCreateAccountField(){
        $(By.id(createAccountFieldID)).click();
    }

    public void clickEmailField(){
        $(By.id(createAccountButtonID)).click();
    }

    public void login(String username, String password){
        assertMainPage();
        $(By.id(emailField)).sendKeys(username);
        $(By.id(passFieldID)).sendKeys(password);
        $(By.id(sigInButtonID)).click();
    }






}
