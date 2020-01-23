package com.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButton {
	@Test

	public void radioButton() {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement custom = driver.findElement(By.xpath("(//input[@type ='radio'])[2]"));
		custom.click();
		boolean a = custom.isSelected();
		System.out.println(a);
		boolean b = custom.isEnabled();
		System.out.println(b);
		boolean c = custom.isDisplayed();
		System.out.println(c);
	}
}