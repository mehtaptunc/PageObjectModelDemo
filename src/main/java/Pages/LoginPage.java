package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage extends BaseTest {
    /* @Step Anotasyonu Nedir?
       @Step anotasyonu, test adımlarını tanımlamak ve test raporlarında daha okunabilir ve anlaşılır bir
       şekilde sunmak için kullanılır.
       Bu anotasyon Selenium WebDriver ve TestNG gibi test kütüphanelerinde yaygın olarak kullanılır.*/


    @Step("Username alanına metin girişi sağlanır")
    public void fillUserName(String text) {
        driver.findElement(By.name("username")).sendKeys(text);
    }

    @Step("Password alanına metin girişi sağlanır")
    public void fillPassword(String password) {
        driver.findElement(By.cssSelector("[name=\"password\"]")).sendKeys(password);
    }
    @Step("Giriş yap butonuna tıklanır")
    public void loginClick() {

        driver.findElement(By.cssSelector("[value=\"Log In\"]")).click();
    }

    @Step("Register butonuna tıklanır")
    public void register() {

        driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
    }

    @Step("Error Mesaj kontrolü")
    public void errorMessageControl(String text) {
        String value =
        driver.findElement(By.cssSelector("#rightPanel > p")).getText();
        Assert.assertEquals(value,text);
    }
    @Step("Kullanıcı giriş kontrolü")
    public void userInformationMessageControl(String text){
        String value = driver.findElement(By.cssSelector("[id='leftPanel'] p")).getText();
        Assert.assertEquals(value,text);
    }

}
