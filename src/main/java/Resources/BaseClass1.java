package Resources;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.firefox.FirefoxDriver;
public class BaseClass1 
{   
	 public WebDriver driver;
	public void initilizationbrowser() throws IOException
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
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
		System.out.println("Select right browser to run test cases");
		}
	}
	public Select selctclass(WebElement elem)
	{
		Select select=new Select(elem);
				return select;
	}
	

}
