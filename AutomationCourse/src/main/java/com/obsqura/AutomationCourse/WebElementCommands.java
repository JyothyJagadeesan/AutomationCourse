package com.obsqura.AutomationCourse;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base
{

	public void webElementCommandsSample()
	{
		
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement singleInputTextField=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleInputTextField.sendKeys("Hello");
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessageButton.click();
		singleInputTextField.clear();
		boolean singleInputTextFieldIsDisplayed= singleInputTextField.isDisplayed();
		boolean showMessageButtonIsEnabled=showMessageButton.isEnabled();
		String showMessageButtonText= showMessageButton.getText();
		Dimension showMessageButtonSize = showMessageButton.getSize();
		int showmessagebtnheight = showMessageButtonSize.getHeight();
		int showmessagebtnwidth = showMessageButtonSize.getWidth();
		int singleInputTextFieldX=singleInputTextField.getLocation().getX();
		int singleInputTextFieldY=singleInputTextField.getLocation().getY();
		int showMessageButtonX=showMessageButton.getLocation().getX();
		int showMessageButtonY=showMessageButton.getLocation().getY();
		String showMessageButtonAttribute= showMessageButton.getAttribute("class");
		String showMessageButtonBorderRadius=showMessageButton.getCssValue("border-radius");
		String showMessageButtonBackgroundColour =showMessageButton.getCssValue("background-color");
		
	}
	public void verifyShowMessageButton()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement singleinputtextfield=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleinputtextfield.sendKeys("Jyothy");
		WebElement showmessagebtn=driver.findElement(By.xpath("//button[@id='button-one']"));
		showmessagebtn.click();
		String showmessagebtntxt= driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		System.out.println(showmessagebtntxt);
		String expectedmessage="Your Message : Jyothy";
		if(showmessagebtntxt.equals(expectedmessage))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
			
		}
	}
	
	public void verifyGetTotalButton()	
	{
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
	    Scanner sc=new Scanner(System.in); 
		WebElement enterValueA=driver.findElement(By.xpath("//input[@id='value-a']"));
		System.out.println("ENTER THE VALUE OF A:");
		String a=sc.next();
	    enterValueA.sendKeys(a);
		WebElement enterValueB=driver.findElement(By.xpath("//input[@id='value-b']"));
		System.out.println("ENTER THE VALUE OF B:");
		String b=sc.next();
		enterValueB.sendKeys(b);
		int total=Integer.valueOf(a)+Integer.valueOf(b);
	    String totalValue=String.valueOf(total);
		System.out.println("SUM="+total);
		WebElement getTotalButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		getTotalButton.click();
		String messageValue=driver.findElement(By.xpath("//div[@id='message-two']")).getText();
		String expectedValue="Total A + B : ";
		
		if(messageValue.equals(expectedValue.concat(totalValue)))
			
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
			
		}
			
	}
	public void verifyTheLengthAndWidthOfGetTotal()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement getTotalButton= driver.findElement(By.xpath("//button[@id='button-two']"));
		Dimension getTotalButtonSize= getTotalButton.getSize();
		int getTotalButtonHeight=getTotalButtonSize.getHeight();
		int getTotalButtonWidth=getTotalButtonSize.getWidth();
		if(getTotalButtonHeight==38)
		{
			System.out.println("HEIGHT IS SAME AS EXPECTED HEIGHT TEST PASSED");
		}
		else
		{
			System.out.println("Test Failed");
		}
		if(getTotalButtonWidth==93)
		{
			System.out.println("WIDTH IS SAME AS EXPECTED WIDTH TEST PASSED");
		}
		else
		{
			System.out.println("Test Failed");
		}
	}
	
	public void verifyWhetherTheTextfieldAIsDisplayedAboveTheTextfieldB()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement enterValueA=driver.findElement(By.xpath("//input[@id='value-a']"));
		int enterValueAY= enterValueA.getLocation().getY();
		WebElement enterValueB=driver.findElement(By.xpath("//input[@id='value-b']")) ;
		int enterValueBY= enterValueB.getLocation().getY();
		if(enterValueAY<enterValueBY)
		{
			System.out.println("Test Passed: Field A is displayed above Field B");
		}
		else
		{
			System.out.println("Test Failed");
		}
	}
	
	public void verifyTheBackgroundColorOfGettotalbutton() 
	{
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement getTotalButton= driver.findElement(By.xpath("//button[@id='button-two']"));
		String getTotalButtonBackgroundColor= getTotalButton.getCssValue("background-color");
		String expectedValue="rgba(0, 123, 255, 1)";
		if(getTotalButtonBackgroundColor.equals(expectedValue))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Passed");
		}
			
	}	
		
		
	
	public static void main(String[] args) 
	{
		WebElementCommands webelementcommands=new WebElementCommands();
		webelementcommands.initializeBrowser();
		webelementcommands.webElementCommandsSample();
		webelementcommands.verifyShowMessageButton();
		webelementcommands.verifyGetTotalButton();
		webelementcommands.verifyTheLengthAndWidthOfGetTotal();
		webelementcommands.verifyWhetherTheTextfieldAIsDisplayedAboveTheTextfieldB();
		webelementcommands.verifyTheBackgroundColorOfGettotalbutton();
		webelementcommands.driverQuit();

	}

	

}
