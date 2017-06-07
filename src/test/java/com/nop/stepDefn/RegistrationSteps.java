package com.nop.stepDefn;

import com.nop.pages.NopHomePage;
import com.nop.pages.NopRegisterPage;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Jey
 * Date: 03/06/17
 * Time: 00:09
 * To change this template use File | Settings | File Templates.
 */
public class RegistrationSteps {

    private WebDriver driver;
    NopRegisterPage nopRegisterPage;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/Jey/development/mySelenium/src/test/resources/chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Given("^the user opens the nopcommerce site$")
    public void the_user_opens_the_nopcommerce_site() throws Throwable {
        driver.get("http://demo.nopcommerce.com");
    }

    @When("^the user decides to register$")
    public void the_user_decides_to_register() throws Throwable {
        nopRegisterPage = PageFactory.initElements(driver, NopRegisterPage.class);

    }

    @Then("^verify the register link$")
    public void verify_the_register_link() throws Throwable {
        NopHomePage nopHomePage = PageFactory.initElements(driver,NopHomePage.class);
        nopHomePage.clickRegisterLink();
    }

    @When("^user fills and submits the  regsitration form$")
    public void user_fills_and_submits_the_regsitration_form() throws Throwable {
        nopRegisterPage.registerAUser();

    }

    @Then("^user view the successful register message \"(.*?)\"$")
    public void user_view_the_successful_register_message(String expectedMessage) throws Throwable {
        String actualMessage= nopRegisterPage.getRegisterMessage();
        Assert.assertEquals("Registration unsuccessful", expectedMessage, actualMessage);
    }

    @When("^user didn't fill the firstname$")
    public void user_didn_t_fill_the_firstname() throws Throwable {

    }

    @Then("^the error message displayed as \"([^\"]*)\"$")
    public void the_error_message_displayed_as(String expectedErrorMessage) throws Throwable {
        String firstNameErrorMessage = nopRegisterPage.getFirstNameErrorMessage();
        System.out.println("firstNameErrorMessage = " + firstNameErrorMessage);
        Assert.assertEquals(expectedErrorMessage,firstNameErrorMessage);
    }

    @When("^user submits the empty form$")
    public void user_submits_the_empty_form() throws Throwable {
        nopRegisterPage.submitRegistrationForm();
    }
}
