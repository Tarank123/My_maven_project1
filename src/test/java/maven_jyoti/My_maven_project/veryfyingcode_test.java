package maven_jyoti.My_maven_project;

import java.io.IOException;

import org.testng.annotations.Test;

import Resources.baseClass;

public class veryfyingcode_test extends baseClass
{
	@Test
	public void login() throws IOException
	{
		initializationBrowser();
		System.out.println("verified test case...");
	}

}
