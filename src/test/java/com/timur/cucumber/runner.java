package com.timur.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(
		 features = "holiday.feature"
		 ,glue={"holiday"}
		 )
public class runner {

}
