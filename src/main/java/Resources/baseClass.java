package Resources;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class baseClass 
{
	 public WebDriver driver;
	public void initializationBrowser() throws IOException
	{   
		//Access file here
		FileInputStream fis=new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\My_maven_project\\src\\main\\java\\Resources\\Datafile.properties");
		
		//here to read load data from file object
		Properties prop=new Properties();
		prop.load(fis);
		
		//key provide now
		String BrowserName=prop.getProperty("browser");
		
		if(BrowserName.equalsIgnoreCase("chrome"))
		{
			 driver=new ChromeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("firefox"))
		{    
			//driver=new FirefoxDriver();
		}
		else
		{
		System.out.println("Now Select right browser to run test cases..");
		}
	}
	public Select selectClass(WebElement elem) 
	{
		Select s1 =new Select(elem);
		return s1;
	}
	public Select selectDropDown(WebElement element)
	{
	Select s2 = new Select(element);
	 return s2;
	}
}
