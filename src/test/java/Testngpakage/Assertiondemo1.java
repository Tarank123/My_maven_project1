package Testngpakage;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Assertiondemo1
{   
	@Test
	public void testMethod()
	{
		//Launch Chrome browser
		WebDriver driver=new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		//open url
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		System.out.println("Veryfying title....");
		
		//Expected title 
		String expectedTitle = "Automation Testing Practice";
	    //Actual title
		String actualTitle =driver.getTitle();
		Assert.assertEquals(expectedTitle,actualTitle,"verifying title");
		
		System.out.println("veryfying actual Result by using  assert class via wikipedia icon");
		//WebElement icon = driver.findElement(By.xpath("//a[@class='wikipedia-search-wiki-link']"));
	     WebElement icon = driver.findElement(By.xpath("//img[@class='wikipedia-icon']"));
		Assert.assertTrue(icon.isDisplayed());
		
		System.out.println("Verfying wikipediaa button");
		//WebElement searchbutton=driver.findElement(By.className(""));
		WebElement searchbutton=driver.findElement(By.xpath("//input[@class='wikipedia-search-button']"));
		Assert.assertTrue(searchbutton.isDisplayed());
		
		driver.close();
		
		
		
		
		
	}

}
