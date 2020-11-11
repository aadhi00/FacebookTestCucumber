package com.stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.base.LibGlobal;
import com.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends LibGlobal {
	LoginPage lp;

	@Given("User is in the facebook login page")
	public void user_is_the_facebook_login_page() {
		getDriver();
		launch("https://www.facebook.com/");
	}

	@When("User enters username and password")
	public void user_enters_username_and_password(io.cucumber.datatable.DataTable userData) {
		List<Map<String, String>> cred = userData.asMaps();
		lp = new LoginPage();
		fill(lp.getLstUsername().get(0), cred.get(1).get("username"));
		fill(lp.getLstPassword().get(0), cred.get(1).get("password"));
	}

	@When("User clicks login button")
	public void user_clicks_login_button() {
		click(lp.getLstBtnLogin().get(0));
	}

	@Then("User should be logged into facebook")
	public void user_should_be_logged_into_facebook() {
		Assert.assertTrue(driver.getCurrentUrl().contains("login_attempt"));
		driver.quit();
		System.out.println("Login Failed");
	}

}
