package com.nop;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = "com.nop.stepDefn",
        features = "src/test/resources/feature",
        tags = "@smoke,@validation",
           format = { "pretty", "html:target/cucumber", "json:target/cucumber.json"})
public class NopCommerceRunner {

    // nothing to commit
    // added ssh keys


}
