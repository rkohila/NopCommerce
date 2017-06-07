package com.nop.stepDefn;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created with IntelliJ IDEA.
 * User: Jey
 * Date: 03/06/17
 * Time: 00:03
 * To change this template use File | Settings | File Templates.
 */
public class LoginSteps {

    private WebDriver driver;

    /*@Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/Jey/development/mySelenium/src/test/resources/chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
*/


    @When("^the user decides to login$")
    public void the_user_decides_to_login() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^click the login button$")
    public void click_the_login_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^user  logsin again with his credentials$")
    public void user_logsin_again_with_his_credentials() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^user clicks on the login button$")
    public void user_clicks_on_the_login_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^user see the message \"(.*?)\"$")
    public void user_see_the_message(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the user expects to see the Myaccount link$")
    public void the_user_expects_to_see_the_Myaccount_link() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
