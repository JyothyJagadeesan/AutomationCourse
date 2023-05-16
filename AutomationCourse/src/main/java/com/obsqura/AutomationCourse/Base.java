package com.obsqura.AutomationCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base
{
	public WebDriver driver;
    public void initializeBrowser()
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Joe\\eclipse-workspace\\AutomationCourse\\src\\main\\java\\Resources\\chromedriver.exe" );
        driver =new ChromeDriver();
        driver.get("https://www.amazon.in/");
    }
    public void driverClose()
    {
        driver.close();
    }
    public void driverQuit()
    {
        driver.quit();
    }
    public void gettitleAndPrint()
    {
        String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        String actualTitle=driver.getTitle();
        System.out.println("expected title is:"+expectedTitle);
        if(actualTitle.equals(expectedTitle))
        {
           System.out.println("test passed");
        }
        else
        {
           System.out.println("test failed");
        }
    }
    public void getPageSourceAdd()
    {
        String pageSource=driver.getPageSource();
    }
    public void getUrl()
    {
        driver.getCurrentUrl();
    }
    public static void main(String args[])
    {
        Base base=new Base();
        base.initializeBrowser();
        base.gettitleAndPrint();
        base.getPageSourceAdd();
        base.getUrl();
        base.driverQuit();
    }
}