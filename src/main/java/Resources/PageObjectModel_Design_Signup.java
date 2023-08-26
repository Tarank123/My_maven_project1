package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjectModel_Design_Signup 
{  
	public WebDriver driver;
	
	public void intializeBrowser() throws IOException
	{
	//Access file
	FileInputStream file=new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\My_maven_project\\src\\main\\java\\Resources\\Datafile.properties");
    
	//Access data load here via properties object and read it
	Properties prop=new Properties();
	prop.load(file);
	
	//Now get Browser key from data.properties
	String browserName=prop.getProperty("browser");
	
	if(browserName.equalsIgnoreCase("chrome"))
	{
		 driver = new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("firefox"))
	{
		//driver=new FireFoxDriver();
	}
	else
	{
	System.out.println("Select right browser to run test cases");
	}
}
}