package com.srs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Assignment1 
{
	WebDriver driver;
	
	@FindBy(xpath="//a[text()='Menu']")
	WebElement menuLink;
	
	@FindBy(xpath="//div[text()='Music']")
	WebElement musicLink;
	
	@FindBy(xpath="//div[text()='Rock']")
	WebElement rockLink;
	
	@FindBy(xpath="//div[text()='Classic']")
	WebElement classicLink;
	

	public Assignment1(WebDriver driver)
	{
       this.driver = driver;
       PageFactory.initElements(driver, this);
    } 

	
	public void verifyClassic() throws InterruptedException
	{
		System.out.println("==========");
		menuLink.click();
		driver.switchTo().frame(0);
		Actions act = new Actions(driver);
		act.moveToElement(musicLink).build().perform();
		act.moveToElement(rockLink).build().perform();
		act.moveToElement(classicLink).build().perform();
		String actual = classicLink.getText();
		Assert.assertEquals("Classic", actual);
		
	}
	
	
}
