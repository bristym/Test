package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pages {
Pages pg;
	WebDriver driver;

	public Pages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement searchField;

	public WebElement getSearchField() {
		return searchField;
	}

	@FindBy(xpath = "//input[@type='submit']")
	WebElement submitField;

	public WebElement getSubmitField() {
		return submitField;
	}

}
