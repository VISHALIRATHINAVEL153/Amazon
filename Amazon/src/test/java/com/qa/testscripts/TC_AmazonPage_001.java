package com.qa.testscripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.qa.pages.AmazonPages;

public class TC_AmazonPage_001 extends TestBase {
AmazonPages amp;
@Test
public void searchPage() throws InterruptedException {
	amp=new AmazonPages(Driver);
	Thread.sleep(8000);
	//Driver.get("https://www.amazon.in/");
	String title=Driver.getTitle();
	System.out.print(title);
//	amp.Searchbox().sendKeys("Think and grow rich");
//	amp.Magnifier().click();
//	String title1=Driver.getTitle();
//	System.out.print(title1);
	
	JavascriptExecutor js=(JavascriptExecutor) Driver;
	//scroll down for partculriar
	js.executeScript("window.scroll(0,700)","");
	Thread.sleep(4000);
	//scroll up
	js.executeScript("window.scroll(0,-700)","");
	Thread.sleep(4000);
	//scroll down till the bottom of the page
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
	Thread.sleep(4000);
	//scroll up to top of the page
	js.executeScript("window.scroll(0,0)","");
	Thread.sleep(5000);
	Driver.close();
	
}
}
