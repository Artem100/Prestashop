package pages;

import com.codeborne.selenide.Condition;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CreateAccount {

    private String MaleID ="uniform-id_gender1";
    private String FemaleID ="id_gender2";
    private String FirstNameFieldID="customer_firstname";
    private String LastNameFieldID="customer_lastname";
    private String EmailFieldID="email";
    private String PasswdFieldID="passwd";
    //private String DayFieldID="days";
    //private String selectValueCss="option[value]";

    private String RegisterButtonID="submitAccount";


    public void checkEmailField(String email){
        $(By.id(EmailFieldID)).shouldHave(Condition.value(email));
    }

    public void onlyRequiredFields(){
        $(By.id(MaleID)).click();
        $(By.id(FirstNameFieldID)).sendKeys(RandomStringUtils.randomAlphabetic(5));
        $(By.id(LastNameFieldID)).sendKeys(RandomStringUtils.randomAlphabetic(5));
        $(By.id(PasswdFieldID)).sendKeys(RandomStringUtils.randomAlphabetic(5));
        clickRegisterButton();
    }

    public void clickRegisterButton(){
        $(By.id(RegisterButtonID)).click();
    }






}
