package com.timur.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(
		 
		features = {"src/test/resources/features"},
		glue={"stepDefinition"}
		
		 )





	public class runner {

			}
