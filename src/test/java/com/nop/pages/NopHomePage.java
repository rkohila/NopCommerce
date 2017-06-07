package com.nop.pages;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Jey
 * Date: 21/05/17
 * Time: 23:15
 * To change this template use File | Settings | File Templates.
 */
public class NopHomePage {

    private WebDriver driver;

    public NopHomePage(WebDriver driver)
    {
        this.driver = driver;


    }

    public void clickRegisterLink()
    {
        driver.findElement(By.linkText("Register")).click();

    }

    public void clickLoginLink(){
        //driver.get("http://demo.nopcommerce.com");
        driver.findElement(By.linkText("Log in")).click();


    }

    public void clickMyAccountLink()
    {
        WebElement myAccountBtn = driver.findElement(By.linkText("My account"));
        myAccountBtn.click();
    }

    public boolean isMyAccounBtnDisplayed()
    {
        WebElement myAccountBtn = driver.findElement(By.linkText("My account"));
        boolean displayed = myAccountBtn.isDisplayed();
        return displayed;
    }

    public void clickLogoutBtn()
    {
        driver.findElement(By.linkText("Log out")).click();

    }
}
