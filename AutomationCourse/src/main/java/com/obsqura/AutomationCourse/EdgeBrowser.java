package com.obsqura.AutomationCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class EdgeBrowser 
{
    public WebDriver driver;
	public void initializeBrowser()
	{
	   System.setProperty("webdriver.edge.driver","C:\\Users\\Joe\\eclipse-workspace\\AutomationCourse\\src\\main\\java\\Resource1\\msedgedriver.exe" );
	   driver =new EdgeDriver();
	   driver.get("https://www.amazon.in/");
    }
    public static void main(String[] args) 
    {
	   EdgeBrowser base=new EdgeBrowser();
	   base.initializeBrowser();
	     
	}

}

