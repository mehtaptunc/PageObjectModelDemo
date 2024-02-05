package PageObjectModelDemo;

import Base.BaseTest;
import Pages.LoginPage;
import org.testng.annotations.Test;



public class Login extends BaseTest {
    LoginPage loginPage =new LoginPage();
    @Test(description = "Hatalı Kullanıcı Girişi")
    public void Test1() throws InterruptedException {
        loginPage.fillUserName("mehtap");
        loginPage.fillPassword("");
        loginPage.loginClick();
        loginPage.errorMessageControl("Please enter a username and password.");
    }
    @Test(description = "Başarılı Kullanıcı Girişi")
    public void Test2() throws InterruptedException {
        loginPage.fillUserName("testqa123");
        loginPage.fillPassword("deneme123");
        loginPage.loginClick();
        Thread.sleep(3000);
        loginPage.userInformationMessageControl("Welcome QA TEST");
    }
    @Test(description = "Onaylama Kontrolleri")
    public void Test3() {
        //tüm alanların boş kontrolü
        loginPage.fillUserName("");
        loginPage.fillPassword("");
        loginPage.loginClick();
        loginPage.errorMessageControl("Please enter a username and password.");

        //username dolu password alanı boş
        loginPage.fillUserName("testqa123");
        loginPage.fillPassword("");
        loginPage.loginClick();
        loginPage.errorMessageControl("Please enter a username and password.");

        //username boş password alanının dolu
        loginPage.fillUserName("");
        loginPage.fillPassword("test123");
        loginPage.loginClick();
        loginPage.errorMessageControl("Please enter a username and password.");

        //başarılı giriş kontrolü
        loginPage.fillUserName("testqa123");
        loginPage.fillPassword("deneme123");
        loginPage.loginClick();
        loginPage.userInformationMessageControl("Welcome QA TEST");
    }
}