package PageObjectModel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Sign_upObejectPage<Select> 
{
	
	public WebDriver driver;
	
	//creating parameterized constructor for initialization of object of WebDriver driver
	 public Sign_upObejectPage(WebDriver driver1)
	{
		driver= driver1;
	}
	//here we are declare all methods and initialized
	
    //Enter Firstname
    By UserNamefirst=By.xpath("//input[@name='UserFirstName']");
  
    //enter Userlastname
    By UserLastnameText=By.xpath("//input[@name='UserLastName']");
    
    //Enter user job type JobText
    By UserJobTitle=By.xpath("//input[@name='UserTitle']");
    
    //Enter user verify user mail id
    By UserMailIdText=By.xpath("//input[@name='UserEmail']");
    
    //Enter and Verify user phone number
    By UserPhoneNumText=By.xpath("//input[@name='UserPhone']");
    
    //Select from DropDown and verify Employee name
    By Employeestotalnumtext=By.xpath("//select[@name='CompanyEmployees']");
    
    //verify company name
    By EmpCompanyNameText=By.xpath("//input[@name='CompanyName']");
    
    //Verify employee country name
    By EmpCountrtyName=By.xpath("//select[@name='CompanyCountry']");
    
    public WebElement EntUserName()
    {
    	 return driver.findElement(UserNamefirst);
    }
    
    public WebElement EnterUserLastName()
    {
     return driver.findElement(UserLastnameText);	
    }
    
    public WebElement EnterJobStream()
    {
    	return driver.findElement(UserJobTitle);
    }
    
    public WebElement EnterUserMailId()
    {
     return driver.findElement(UserMailIdText);	
    }
    
    public WebElement EnterPhonenumber()
    {
    	return driver.findElement(UserPhoneNumText);
    }
    public WebElement EnterEmptotalnumber()
    {
    	return driver.findElement(Employeestotalnumtext);
    }
    
    public WebElement EnterEmpCompanyName()
    {
    	return driver.findElement(EmpCompanyNameText);
    }
    
    public WebElement EnterEmpCountryName()
    {
    	return driver.findElement(EmpCountrtyName);
    }
    
}
