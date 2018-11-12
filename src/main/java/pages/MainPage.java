package pages;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;

public class MainPage {

    private String clickSignInButton = "a.login";
    private String elementGoodsCss= "li.ajax_block_product";
    //private String addToCardButtonCss = "a.button.ajax_add_to_cart_button.btn.btn-default";
    private String addToCardButtonCss = "a[data-id-product='1']";
    private String proceedToCheckoutButtonCss = "a.btn.btn-default.button.button-medium";

    public boolean assertMainPage(){
        //Assert.assertTrue($(By.cssSelector("[title='http://prestashop.qatestlab.com.ua/']")).isDisplayed());
        return title().contains("http://prestashop.qatestlab.com.ua/");
    }

    public void clickSignInButton(){
        $(By.cssSelector(clickSignInButton)).click();
    }

    public void navigateOnGoods() throws InterruptedException{
        WebElement ele = $(By.cssSelector(elementGoodsCss));
        Selenide.actions().moveToElement(ele).build().perform();
        Thread.sleep(1000);
    }

    public void clickOnAddToCard(){
        $(By.cssSelector(addToCardButtonCss)).click();
    }

    public void clickProceedToCheckoutButtonCss(){
        $(By.cssSelector(proceedToCheckoutButtonCss)).click();
    }
}
