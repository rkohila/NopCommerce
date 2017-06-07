package com.nop.pages;

import com.nop.util.RandomGen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: Jey
 * Date: 30/05/17
 * Time: 22:48
 * To change this template use File | Settings | File Templates.
 */
public class NopBillingPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public  NopBillingPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }



    public void billingAddress(){

        String firstNameValue=driver.findElement(By.id("BillingNewAddress_FirstName")).getAttribute("value");
        System.out.println("firstNameValue = " + firstNameValue);

        if(firstNameValue==null && !firstNameValue.equals(" ")) {

            driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("FirstName");
            driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("LastName");
            String email = RandomGen.randomString()+"@test.com";
            driver.findElement(By.id("BillingNewAddress_Email")).sendKeys(email);
        }



        Select select  = new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
        select.selectByVisibleText("United States");

        wait.until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver webDriver) {
                return driver.findElements(By.cssSelector("#BillingNewAddress_StateProvinceId>option")).size() > 1;
            }
        });

        Select stateSelect  = new Select(driver.findElement(By.id("BillingNewAddress_StateProvinceId")));
        stateSelect.selectByVisibleText("New York");


        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("uk");
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("adsdfsdf");
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")) .sendKeys("123456");
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("1234567890");
        driver.findElement(By.cssSelector(".button-1.new-address-next-step-button")).click();
    }




}

