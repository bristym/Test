package com.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
	@Test
	public void mouseHover() {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.macys.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement a = driver.findElement(By.xpath("//span[@id='shopByDepartmentLabelText']"));
		System.out.println(a.getText());

		Actions actions = new Actions(driver);
		WebElement mc = driver.findElement(By.xpath("//span[@id='shopByDepartmentLabelText']"));
		mc.click();
		actions.moveToElement(mc).moveToElement(driver.findElement(By.xpath("//span[contains(text(),'home')]"))).click().build().perform(); 

		driver.findElement(By.xpath("//span[contains(text(),'home')]"));
		actions.moveToElement(mc);
		actions.click().build().perform();

		driver.findElement(By.xpath("//div[@class='flyout_22672 selected-flyout']//div[1]//div[1]//a[2]"));
		actions.moveToElement(mc).click().build().perform();

	}
}