package com.nop.util;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created with IntelliJ IDEA.
 * User: Jey
 * Date: 11/06/17
 * Time: 20:30
 * To change this template use File | Settings | File Templates.
 */
public class WebElementHelper {

    private WebDriverWait webDriverWait;

    public static void click(WebElement webElement){
        // wait until expected conditions
        // do the action
    }

    public static boolean isElementExists(WebElement webElement,String text){

        // wait until expected conditions
        // do the action

        try{

        if(webElement.isDisplayed()  ){
                return true;
        }
        } catch (NoSuchElementException e){

              return false;
        }
        return true;

    }
}
