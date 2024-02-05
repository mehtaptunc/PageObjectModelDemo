package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class RegisterPage extends BaseTest {

    @Step("Firstname doldurulur")
   public void firstNameFill(String fistName){
       driver.findElement(By.id("customer.firstName")).sendKeys(fistName);}

    @Step("Lastname doldurulur")
    public void lastNameFill(String lastName){
       driver.findElement(By.id("customer.lastName")).sendKeys(lastName);}

    @Step("Adres doldurulur")
    public void addressFill(String address){
        driver.findElement(By.id("customer.address.street")).sendKeys(address);
    }

    @Step("Cityn alanı doldurulur")
    public void cityFill(String city){
        driver.findElement(By.id("customer.address.city")).sendKeys(city);}

    @Step("State doldurulur")
    public void stateFill(String state){
        driver.findElement(By.id("customer.address.state")).sendKeys(state);}

    @Step("Zipcode doldurulur")
    public void zipCodeFill(String zipCode){
        driver.findElement(By.id("customer.address.zipCode")).sendKeys(zipCode);}

    @Step("PhoneNumber doldurulur")
    public void phoneNumberFill(String phone){
       driver.findElement(By.id("customer.phoneNumber")).sendKeys(phone);}

    @Step("SSN doldurulur")
    public void ssnNoFill(String ssn){
       driver.findElement(By.id("customer.ssn")).sendKeys(ssn);}

    @Step("Username doldurulur")
    public void userNameFill(String userName){
        driver.findElement(By.id("customer.username")).sendKeys(userName);
    }

    @Step("Password doldurulur")
    public void userPasswordFill(String password){
       driver.findElement(By.id("customer.password")).sendKeys(password);}

    @Step("Repeated Password doldurulur")
    public void repeatedPasswordFill(String repeatedPassword){
        driver.findElement(By.id("repeatedPassword")).sendKeys(repeatedPassword);}

    @Step("Register tıklanır")
    public void registerButton(){
        driver.findElement(By.cssSelector("input[value='Register']")).click();
    }
}

