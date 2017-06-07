package com.nop.test;

import com.nop.pages.NopLoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Jey
 * Date: 28/05/17
 * Time: 00:42
 * To change this template use File | Settings | File Templates.
 */
public class NopLoginTest {

    private WebDriver driver;

   /* @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/Jey/development/mySelenium/src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://demo.nopcommerce.com");
    }

    @After
    public void tearDown(){
        driver.quit();
    }*/

      @Test
    public void loginAUser()
      {
              NopLoginPage nopLoginPage= PageFactory.initElements(driver,NopLoginPage.class);
//              nopLoginPage.enterLoginDetail();



          }
      }



