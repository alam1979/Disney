package com.usa.testngrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin= {"pretty","html:target/cucumber", "json:target/cucumber.json"},

		features= {"src/main/resources/AgileTrailblazersEmailValidation.feature"},
		glue= {"com.usa.disneyworld"},
				
		tags= {"@login"}
		)


public class TestNgRunner extends AbstractTestNGCucumberTests{

}


