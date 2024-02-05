package PageObjectModelDemo;

import Base.BaseTest;
import Pages.LoginPage;
import Pages.RegisterPage;
import org.testng.annotations.Test;

public class Register extends BaseTest {
    LoginPage loginPage= new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    @Test(description = "Yeni Kullanıcı Kayıt")
    public void Test4() throws InterruptedException {
        Thread.sleep(3000);
        loginPage.register();
        registerPage.firstNameFill("Deneme");
        registerPage.lastNameFill("Test");
        registerPage.addressFill("İstanbul");
        registerPage.cityFill("İstanbul");
        registerPage.stateFill("Şişli");
        registerPage.zipCodeFill("12342");
        registerPage.phoneNumberFill("254848545556");
        registerPage.ssnNoFill("544552");
        registerPage.userNameFill("test98765412");
        registerPage.userPasswordFill("44551552");
        registerPage.repeatedPasswordFill("44551552");
        registerPage.registerButton();


    }

}