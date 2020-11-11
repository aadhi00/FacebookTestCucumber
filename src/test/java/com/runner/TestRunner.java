package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/features/"}, glue={"com.stepdefinitions"},
					monochrome=true,plugin="pretty",dryRun=false)
public class TestRunner{
	
}
