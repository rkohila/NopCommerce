package com.nop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Jey
 * Date: 28/05/17
 * Time: 00:38
 * To change this template use File | Settings | File Templates.
 */
public class NopLoginPage {


    private WebDriver driver;
    WebDriverWait wait;

    public NopLoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }


    public void enterLoginDetail(String email, String password) {
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.cssSelector(".button-1.login-button")).click();

    }


}


