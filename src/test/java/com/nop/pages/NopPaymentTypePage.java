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
 * Time: 22:59
 * To change this template use File | Settings | File Templates.
 */
public class NopPaymentTypePage {

    private WebDriverWait wait;
    private WebDriver driver;

    public NopPaymentTypePage(WebDriver driver)
    {
        this.driver = driver;
        wait=new WebDriverWait(driver,30);
    }

    public void paymentType()
    {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("paymentmethod_1")));
        driver.findElement(By.id("paymentmethod_1")).click();
        driver.findElement(By.cssSelector(".button-1.payment-method-next-step-button")).click();
    }

}
