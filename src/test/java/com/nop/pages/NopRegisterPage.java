package com.nop.pages;

import com.nop.util.NopSessionData;
import com.nop.util.RandomGen;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created with IntelliJ IDEA.
 * User: Jey
 * Date: 27/05/17
 * Time: 20:39
 * To change this template use File | Settings | File Templates.
 */
public class NopRegisterPage {

    private WebDriver driver;
    WebDriverWait wait;

    public NopRegisterPage(WebDriver driver)
    {
        this.driver = driver;
        wait=new WebDriverWait(driver,30);
//        boolean isRegisteredPageLoaded = driver.findElement(By.cssSelector(".page-body")).isDisplayed();
//        System.out.println("isRegisteredPageLoaded = " + isRegisteredPageLoaded);

//        Assert.assertTrue("Registered page not loaded properly",isRegisteredPageLoaded);

//        Assert.assertEquals("Registered page not loaded properly", true, isRegisteredPageLoaded);
        }



    public void registerAUser(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gender-female")));
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Firstname");
        driver.findElement(By.id("LastName")).sendKeys("Lastname");
        Select select_dob = new Select(driver.findElement(By.name("DateOfBirthDay")));
        select_dob.selectByIndex(4);
        Select select_dom = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        select_dom.selectByIndex(4);
        Select select_doy = new Select(driver.findElement(By.name("DateOfBirthYear")));
        select_doy.selectByIndex(4);
        String Email = RandomGen.randomString()+"@test.com";
        NopSessionData.getInstance().put("email",Email);
        driver.findElement(By.id("Email")).sendKeys(Email);
        driver.findElement(By.id("Password")).sendKeys("123456");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
        submitRegistrationForm();
//        driver.findElement(By.id("register-button")).click();

    }

    public void submitRegistrationForm(){
        driver.findElement(By.id("register-button")).click();
    }


    public String getFirstNameErrorMessage(){
        return driver.findElement(By.cssSelector("[data-valmsg-for='FirstName']")).getText();
    }

    public String getRegisterMessage(){
        return  driver.findElement(By.cssSelector(".result")).getText();
    }

    public void continueAfterRegister()
    {
        driver.findElement(By.name("register-continue")).click();


    }
}
