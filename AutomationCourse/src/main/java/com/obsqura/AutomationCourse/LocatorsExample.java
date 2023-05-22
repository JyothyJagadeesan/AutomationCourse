package com.obsqura.AutomationCourse;

import org.openqa.selenium.By;

public class LocatorsExample  extends Base
{
    
	    public void locatingByID()
	    {
	    	driver.findElement(By.id("nav-search-submit-button")); 
		    driver.findElement(By.id("glow-ingress-line2"));
	    	driver.findElement(By.id("nav-cart-count"));
	    	driver.findElement(By.id("nav-search-dropdown-card"));
	    	driver.findElement(By.id("nav-search-bar-form")); 
	    }
	    public void locatingByClassname()
	    {
	    	driver.findElement(By.className("nav-imageHref")); 
	        driver.findElement(By.className("hm-icon-label")); 
	    	driver.findElement(By.className("navFooterBackToTopText")); 
	    	driver.findElement(By.className("icp-color-base")); 
	    	
	    } 
	    public void locatingByName()
	    {
	    	driver.findElement(By.name("glow-validation-token")); 
	    	driver.findElement(By.name("google-site-verification")); 
	    	driver.findElement(By.name("msvalidate.01")); 
	    	driver.findElement(By.name("field-keywords")); 
	    	driver.findElement(By.name("twitter:card")); 
	    } 
		public void locateByCSSSelector()
		{
			driver.findElement(By.cssSelector("span#glow-ingress-line2"));
			driver.findElement(By.cssSelector("input#nav-search-submit-button"));
			driver.findElement(By.cssSelector("div#nav-search-dropdown-card"));
			
			driver.findElement(By.cssSelector("style.vjs-styles-defaults"));
			driver.findElement(By.cssSelector("a.nav-imageHref"));
			driver.findElement(By.cssSelector("span.hm-icon-label"));
			
			driver.findElement(By.cssSelector("select[aria-describedby='searchDropdownDescription']"));
			driver.findElement(By.cssSelector("style[mark='aboveNavInjectionCSS']")); 
			driver.findElement(By.cssSelector("input[placeholder='Search Amazon.in']"));
			
		} 
		public static void main(String[] args) 
		
		{
			LocatorsExample locators= new LocatorsExample();
			locators.initializeBrowser();
			locators.locatingByID();
			locators.locatingByClassname();
			locators.locatingByName();
			locators.locateByCSSSelector();
			locators.driverQuit();
		}


}
