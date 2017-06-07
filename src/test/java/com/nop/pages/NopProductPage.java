package com.nop.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created with IntelliJ IDEA.
 * User: Jey
 * Date: 30/05/17
 * Time: 22:41
 * To change this template use File | Settings | File Templates.
 */
public class NopProductPage {

    private WebDriver driver;
    private WebDriverWait wait;



    public NopProductPage(WebDriver driver)
    {
        this.driver = driver;
        wait=new WebDriverWait(driver,30);
    }


    public void selectTheProduct()
    {
        driver.findElement(By.cssSelector("[data-productid='4']")).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("[data-productid='4']")));
        Assert.assertTrue(driver.getCurrentUrl().contains("apple-macbook-pro-13-inch"));
    }

    public void addTheSelectedProductToCart(){

        driver.findElement(By.id("add-to-cart-button-4")).click();
        System.out.println(driver.findElement(By.id("bar-notification")).isDisplayed());
        driver.findElement(By.linkText("Shopping cart")).click();
    }

    public void addTheSelectedProductToCart1(){


        driver.findElement(By.linkText("Shopping cart")).click();
    }
}
