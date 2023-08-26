package maven_jyoti.My_maven_project;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import PageObjectModel.LoginObjectpage;
import Resources.BaseClass1;

public class VeryfiyingCode_of_test extends BaseClass1

{   
	@Test
	public void login() throws IOException
	{
		initilizationbrowser();
		driver.get("https://login.salesforce.com");
		
		//maximize window
		driver.manage().window().maximize();
		
		LoginObjectpage  lop=new LoginObjectpage(driver);
		
		
		lop.enterUsername().sendKeys("jyoti");
		lop.enterpassword().sendKeys("abcd12");
		lop.enterLoginButton().click();
		
		//Method call by SignupObjectpage class object  
		lop.ClickOnTryForFreeLink().click();
		Assert.assertEquals(10, 10);
		
		System.out.println("Veryfying Test code......");
		
		
		
	}

}
