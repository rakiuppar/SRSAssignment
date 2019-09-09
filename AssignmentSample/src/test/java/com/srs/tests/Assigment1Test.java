package com.srs.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.srs.pages.Assignment1;

public class Assigment1Test 
{
	public static WebDriver driver;
	Assignment1 as = null;;
	

	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "\\AssignmentSample\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		as = new Assignment1(driver);
	}
	
	
	@Test
	public void handleFrames() throws InterruptedException
	{
		as.verifyClassic( );
			}
	
	
	@AfterMethod
	public void finish()
	{
		driver.quit();
	}
	
	
}
