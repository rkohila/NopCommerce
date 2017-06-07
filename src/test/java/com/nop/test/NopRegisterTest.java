package com.nop.test;

import com.nop.pages.NopHomePage;
import com.nop.pages.NopLoginPage;
import com.nop.pages.NopRegisterPage;
import com.nop.util.NopSessionData;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Jey
 * Date: 21/05/17
 * Time: 23:12
 * To change this template use File | Settings | File Templates.
 */
public class NopRegisterTest {

    private WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/Jey/development/mySelenium/src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://demo.nopcommerce.com");
    }

    @After
    public void tearDown(){
      driver.quit();
    }

    @Test
    public void shouldRegisterAnewUserAndLogout() {

        NopHomePage nopHomePage = PageFactory.initElements(driver, NopHomePage.class);
        nopHomePage.clickRegisterLink();
        NopRegisterPage   nopRegisterPage =PageFactory.initElements(driver,NopRegisterPage.class);
        nopRegisterPage.registerAUser();
        String regMesssage=nopRegisterPage.getRegisterMessage();
        System.out.println("regMesssage = " + regMesssage);
        nopRegisterPage.continueAfterRegister();
        boolean isMyAccountDisplayed= nopHomePage.isMyAccounBtnDisplayed();
        Assert.assertTrue("My Account link is not displayed",isMyAccountDisplayed);
        nopHomePage.clickLogoutBtn();

    }

    @Test
    public void shouldRegisterAndLogin() {

        shouldRegisterAnewUserAndLogout();
        NopHomePage nopHomePage = PageFactory.initElements(driver, NopHomePage.class);


        NopLoginPage nopLoginPage= PageFactory.initElements(driver,NopLoginPage.class);
        nopHomePage.clickLoginLink();

        String email = NopSessionData.getInstance().get("email");
        nopLoginPage.enterLoginDetail(email,"123456");
        System.out.println("User successfully logged in");

    }



}
