package com.qa.testscripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.AmazonPages;
import com.qa.pages.GooglePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	WebDriver Driver;
	@Parameters({"Browser","Url"})
	@BeforeClass
	  public void Setup(String Browser,String Url)throws IOException
	  {
		  
		  if(Browser.equalsIgnoreCase("Chrome"))
		  {
			  WebDriverManager.chromedriver().setup();
			  Driver=new ChromeDriver();
		  }
		  else if(Browser.equalsIgnoreCase("Edge"))
		  {
			  WebDriverManager.edgedriver().setup();
			  Driver=new EdgeDriver();
		  }
		  else if(Browser.equalsIgnoreCase("Gecko")) {
			  WebDriverManager.firefoxdriver().setup();
			  Driver=new FirefoxDriver();
		  }
		  //Amazonp=new AmazonPages(Driver);
		  Driver.manage().window().maximize();
		  Driver.get(Url);
		  //gp=new GooglePage(Driver);
		  Driver.manage().window().maximize();
		  Driver.get(Url);
		
	  }
		@AfterClass
		public void TearDown() 
		{
			Driver.close();
		}
}
