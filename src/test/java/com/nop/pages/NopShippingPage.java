package com.nop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created with IntelliJ IDEA.
 * User: Jey
 * Date: 30/05/17
 * Time: 22:47
 * To change this template use File | Settings | File Templates.
 */
public class NopShippingPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public  NopShippingPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    public void shippingMethod(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkout-step-shipping-method")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("co-shipping-method-form")));

        driver.findElement(By.id("shippingoption_1")).click();
        WebElement shippingContinue =driver.findElement(By.cssSelector(".button-1.shipping-method-next-step-button"));
        shippingContinue.click();
    }

}
