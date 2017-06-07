package com.nop.test;

import com.nop.pages.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Jey
 * Date: 30/05/17
 * Time: 11:08
 * To change this template use File | Settings | File Templates.
 */
public class NopUserJourneyTest {

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
    public void shouldSearchAProductFromMenuForGuestUser()
    {
        NopMenuPage nopMenuPage  = PageFactory.initElements(driver,NopMenuPage.class);
        nopMenuPage.searchAProductFromMenu();

        NopProductPage nopProductPage  = PageFactory.initElements(driver,NopProductPage.class);
        nopProductPage.selectTheProduct();
        nopProductPage.addTheSelectedProductToCart();

        NopCheckoutPage nopCheckoutPage = PageFactory.initElements(driver,NopCheckoutPage.class);
        nopCheckoutPage.checkOut();
        nopCheckoutPage.checkOutAsAGuestUser();

        NopBillingPage nopBillingPage =PageFactory.initElements(driver,NopBillingPage.class);
        nopBillingPage.billingAddress();

        NopShippingPage   nopShippingPage =  PageFactory.initElements(driver,NopShippingPage.class);
        nopShippingPage.shippingMethod();

        NopPaymentTypePage   nopPaymentTypePage =  PageFactory.initElements(driver,NopPaymentTypePage.class);
        nopPaymentTypePage.paymentType();


    }

    @Test
    public void shouldRegisterANewUserAndCheckoutJourney(){

        NopHomePage nopHomePage = PageFactory.initElements(driver,NopHomePage.class);
         nopHomePage.clickRegisterLink();
        NopRegisterPage nopRegisterPage =PageFactory.initElements(driver,NopRegisterPage.class);
        nopRegisterPage.registerAUser();

        String registerMessage= nopRegisterPage.getRegisterMessage();
        Assert.assertEquals("Registration unsuccessful","Your registration completed",registerMessage);
        Assert.assertTrue(nopHomePage.isMyAccounBtnDisplayed());
        NopMenuPage nopMenuPage  = PageFactory.initElements(driver,NopMenuPage.class);
        nopMenuPage.searchAProductFromMenu();

        NopProductPage nopProductPage  = PageFactory.initElements(driver,NopProductPage.class);
        nopProductPage.selectTheProduct();
        nopProductPage.addTheSelectedProductToCart();

        NopCheckoutPage nopCheckoutPage = PageFactory.initElements(driver,NopCheckoutPage.class);
        nopCheckoutPage.checkOut();

        NopBillingPage nopBillingPage =PageFactory.initElements(driver,NopBillingPage.class);
        nopBillingPage.billingAddress();

        NopShippingPage   nopShippingPage =  PageFactory.initElements(driver,NopShippingPage.class);
        nopShippingPage.shippingMethod();

        NopPaymentTypePage   nopPaymentTypePage =  PageFactory.initElements(driver,NopPaymentTypePage.class);
        nopPaymentTypePage.paymentType();

    }

    @Test
    public void shouldCheckOutAndRegisterAUserJourney(){

        NopMenuPage nopMenuPage  = PageFactory.initElements(driver,NopMenuPage.class);
        nopMenuPage.searchAProductFromMenu();

        NopProductPage nopProductPage  = PageFactory.initElements(driver,NopProductPage.class);
        nopProductPage.selectTheProduct();
        nopProductPage.addTheSelectedProductToCart();

        NopCheckoutPage nopCheckoutPage = PageFactory.initElements(driver,NopCheckoutPage.class);
        nopCheckoutPage.checkOut();
        nopCheckoutPage.checkoutAsRegisteredUser();
        NopRegisterPage nopRegisterPage =PageFactory.initElements(driver,NopRegisterPage.class);
        nopRegisterPage.registerAUser();

        String registerMessage= nopRegisterPage.getRegisterMessage();
        Assert.assertEquals("Registration unsuccessful","Your registration completed",registerMessage);

        nopProductPage.addTheSelectedProductToCart1();
        NopBillingPage nopBillingPage =PageFactory.initElements(driver,NopBillingPage.class);
        nopBillingPage.billingAddress();

       /* NopShippingPage   nopShippingPage =  PageFactory.initElements(driver,NopShippingPage.class);
        nopShippingPage.shippingMethod();

        NopPaymentTypePage   nopPaymentTypePage =  PageFactory.initElements(driver,NopPaymentTypePage.class);
        nopPaymentTypePage.paymentType(); */


    }

}
