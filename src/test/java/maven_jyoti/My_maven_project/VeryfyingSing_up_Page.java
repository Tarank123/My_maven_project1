package maven_jyoti.My_maven_project;
import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginObjectpage;
import PageObjectModel.Sign_upObejectPage;
import Resources.baseClass;

public class VeryfyingSing_up_Page extends baseClass 
{
	 
	    @Test
		public void Signup() throws IOException, InterruptedException
		{   
	    	initializationBrowser();
			driver.get("https://login.salesforce.com");
			
			//maximize window
			driver.manage().window().maximize();
		    
			LoginObjectpage  lop=new LoginObjectpage(driver);
			lop.ClickOnTryForFreeLink().click();
			
			//Create here Siginup pageObject
			Sign_upObejectPage objsignup=new Sign_upObejectPage(driver);
			
			Thread.sleep(2000);
			//Enter user name
			objsignup.EntUserName().sendKeys("jyoti");
			//Enter user last name
			objsignup.EnterUserLastName().sendKeys("Kushwah");
			//Enter job type of employee
			objsignup.EnterJobStream().sendKeys("it");
			 //Enter email id of employee
			objsignup.EnterUserMailId().sendKeys("jyoti123@gamil.com");
			//Enter employee phone number
			objsignup.EnterPhonenumber().sendKeys("123455667");
			//Enter Employee total number
			objsignup.EnterEmptotalnumber().click();
			Select select = new Select(objsignup.EnterEmptotalnumber());
			select.selectByIndex(3);
			//Select here company name;
			objsignup.EnterEmpCompanyName().sendKeys("L&T infotech");
			Thread.sleep(2000);
			//Enter country of employee
			//objsignup.EnterEmpCountryName().click();
	        Select s3= new Select(objsignup.EnterEmpCountryName());
			s3.selectByIndex(6);
			
        }
}