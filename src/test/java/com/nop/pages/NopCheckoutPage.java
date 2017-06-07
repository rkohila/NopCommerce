package com.nop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created with IntelliJ IDEA.
 * User: Jey
 * Date: 30/05/17
 * Time: 22:44
 * To change this template use File | Settings | File Templates.
 */
public class NopCheckoutPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public  NopCheckoutPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    public void checkOutAsAGuestUser(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".button-1.checkout-as-guest-button")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".form-fields")));
        driver.findElement(By.cssSelector(".button-1.checkout-as-guest-button")).click();
    }

    public void checkOut(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#termsofservice")));

        driver.findElement(By.cssSelector("#termsofservice")).click();
        driver.findElement(By.id("checkout")).click();

    }

    public void checkoutAsRegisteredUser(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".button-1.register-button")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".form-fields")));
        driver.findElement(By.cssSelector(".button-1.register-button")).click();
    }

}
