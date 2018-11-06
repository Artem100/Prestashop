package pages;

import com.codeborne.selenide.Condition;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class CreateAccount {

    private String MaleID ="uniform-id_gender1";
    private String FemaleID ="id_gender2";
    private String FirstNameFieldID="customer_firstname";
    private String LastNameFieldID="customer_lastname";
    private String EmailFieldID="email";
    private String PasswdFieldID="passwd";
    private String DayFieldID="uniform-days";
    private String selectValueCss="option[value='1']";
    private String selectValue2Css="option[value='2']";
    private String selectValueYearCss="span[val='2018']";
    private String MonthFieldID="uniform-months";
    private String YearFieldID="cuselFrame-years";
    private String NewsLetterCheckboxID="newsletter";
    private String OfferCheckoxes="uniform-optin";
    private String MonthFrameID="months";

    private String RegisterButtonID="submitAccount";


    public void checkEmailField(String email){
        $(By.id(EmailFieldID)).shouldHave(Condition.value(email));
    }

    public void onlyRequiredFields() throws InterruptedException{
        /*$(By.id(NewsLetterCheckboxID)).click();
        $(By.id(OfferCheckoxes)).click();
        $(By.id(MaleID)).click();
        $(By.id(FirstNameFieldID)).setValue(RandomStringUtils.randomAlphabetic(5));
        $(By.id(LastNameFieldID)).setValue(RandomStringUtils.randomAlphabetic(5));
        $(By.id(PasswdFieldID)).setValue(RandomStringUtils.randomAlphabetic(5));*/
        $(By.id(DayFieldID)).click();
        $(By.cssSelector(selectValueCss)).click();
        //$(By.id(DayFieldID)).click();
        $(By.id(MonthFieldID)).click();
        //switchTo().frame(selectValueCss);
        Thread.sleep(2000);
        $(By.cssSelector(selectValue2Css)).sendKeys(Keys.ARROW_DOWN);
        $(By.cssSelector(selectValue2Css)).click();
        $(By.id(YearFieldID)).click();
        $(By.cssSelector(selectValueYearCss)).click();
        //clickRegisterButton();
        Thread.sleep(2000);
    }

    public void clickRegisterButton(){
        $(By.id(RegisterButtonID)).click();
    }






}
