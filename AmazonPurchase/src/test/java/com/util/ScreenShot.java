package com.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {

	public static void screenS(WebDriver driver, String s) throws Exception {

		TakesScreenshot sh = (TakesScreenshot) driver;
		File fl = sh.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fl, new File(s + ".png"));

	}
}