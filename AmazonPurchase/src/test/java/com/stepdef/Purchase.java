package com.stepdef;

import org.openqa.selenium.support.PageFactory;

import com.common.Base;
import com.pages.Pages;
import com.util.ScreenShot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Purchase extends Base {
	Pages pg;

	@Given("^I am on Amazon homepage$")
	public void i_am_on_amazon_homepage() throws Exception {
		getdriver();
		ScreenShot.screenS(driver, "HomePage");
	}

	@When("^I search iphone clear case and click search$")
	public void i_search_iphone_clear_case_and_click_search() {

		pg = PageFactory.initElements(driver, Pages.class);

		pg.getSearchField().sendKeys("iphone 11 clear case");
		pg.getSubmitField().click();

	}

	@Then("^I see my searched item$")
	public void i_see_my_searched_item() {
	}
}
