package com.nop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created with IntelliJ IDEA.
 * User: Jey
 * Date: 30/05/17
 * Time: 22:40
 * To change this template use File | Settings | File Templates.
 */
public class NopMenuPage {
    private WebDriver driver;
    WebDriverWait wait;

    public NopMenuPage(WebDriver driver)
    {
        this.driver = driver;
        wait=new WebDriverWait(driver,30);
        boolean isHomePageLoaded = driver.findElement(By.cssSelector(".page-body")).isDisplayed();
        System.out.println("isHomePageLoaded = " + isHomePageLoaded);
    }

    public void searchAProductFromMenu(){
        driver.findElement(By.linkText("Computers")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Notebooks")));
        driver.findElement(By.linkText("Notebooks")).click();
    }
}
