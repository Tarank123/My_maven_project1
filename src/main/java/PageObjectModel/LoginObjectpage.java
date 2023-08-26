package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginObjectpage 
{
	WebDriver driver;
	
	By Username=By.xpath("//input[@id='username']");
	By Password=By.xpath("//input[@id='password']");
	By LoginButton=By.xpath("//input[@id='Login']");
	By Signupbutton=By.xpath("//a[@id='signup_link']");
	
	//Sign_up By TryForfree
    By TryforFreeText=By.xpath("//a[text()='Try for Free']");
    
	public LoginObjectpage(WebDriver driver2) 
	{
		driver=driver2;
	}
	public WebElement enterUsername()
	{
		return driver.findElement(Username);
	}
	public WebElement enterpassword()
	{
		return driver.findElement(Password);
	}
	public WebElement enterLoginButton()
	{
		return driver.findElement(LoginButton);
	}
	
	 public WebElement ClickOnTryForFreeLink()
	 {
	      return driver.findElement(TryforFreeText);	
	 }
}


