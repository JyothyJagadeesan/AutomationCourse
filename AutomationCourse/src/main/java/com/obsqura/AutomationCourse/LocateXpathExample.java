package com.obsqura.AutomationCourse;

import org.openqa.selenium.By;

public class LocateXpathExample extends Base
{

	public void locateXPath()
	{
		driver.findElement(By.xpath("//input[contains(@id,'nav-search-submit-button')]"));
		driver.findElement(By.xpath("//span[contains(@id,'nav-search-submit-text')]"));
		driver.findElement(By.xpath("//div[contains(@id,'nav-tools')]"));
		driver.findElement(By.xpath("//select[contains(@aria-describedby,'searchDropdownDescription')]"));
		driver.findElement(By.xpath("//option[contains(@value,'search-alias=stripbooks')]"));
		
		driver.findElement(By.xpath("//a[starts-with(@href,'/deals?ref_=nav_cs_gb')]"));
		driver.findElement(By.xpath("//img[starts-with(@alt,'Collected Rewards')]"));
		driver.findElement(By.xpath("//img[starts-with(@alt,'Shop & Pay')]"));
		driver.findElement(By.xpath("//i[starts-with(@class,'hm-icon nav-sprite')]"));
		
		driver.findElement(By.xpath("//a[text()='Customer Service']"));
		driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		driver.findElement(By.xpath("//h2[text()='Today’s Deals']"));
		driver.findElement(By.xpath("//span[text()='Prime']"));
	
		
		
	}
	public static void main(String[] args) 
	{
		LocateXpathExample locator= new LocateXpathExample();
		locator.initializeBrowser();
		locator.locateXPath();
		locator.driverQuit();
		
	}

}
