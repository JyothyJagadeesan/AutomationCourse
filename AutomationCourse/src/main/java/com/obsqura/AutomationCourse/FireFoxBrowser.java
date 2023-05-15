package com.obsqura.AutomationCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FireFoxBrowser 
{
	public WebDriver driver;
	public void initializeBrowser()
	{
	   System.setProperty("webdriver.firefox.driver","C:\\Users\\Joe\\eclipse-workspace\\AutomationCourse\\src\\main\\java\\Resource3\\geckodriver.exe" );
	   driver =new FirefoxDriver();
	   driver.get("https://www.amazon.in/");
    }
    public static void main(String[] args) 
    {
	   FireFoxBrowser base=new FireFoxBrowser();
	   base.initializeBrowser();
	     
	}

	
}
