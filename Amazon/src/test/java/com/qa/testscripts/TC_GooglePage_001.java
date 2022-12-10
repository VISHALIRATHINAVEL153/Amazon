package com.qa.testscripts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.qa.pages.GooglePage;

public class TC_GooglePage_001 extends TestBase {
	GooglePage gp;
	@Test
	public void Search() throws InterruptedException {
		gp=new GooglePage(Driver);
		Thread.sleep(5000);
		gp.Gmail().click();
		Thread.sleep(5000);
		gp.SignIn().click();
		Thread.sleep(5000);
		gp.Create().click();
		System.out.println(Driver.getTitle());
		Select s=new Select(gp.Create());
		s.selectByVisibleText("For my personal use");
		Thread.sleep(2000);
		gp.First().sendKeys("veronica");
		gp.Lastname().sendKeys("R");
		gp.Username().sendKeys("veronica1234");
		gp.Password().sendKeys("12345678EBq");
		gp.CPassword().sendKeys("12345678EBq"+Keys.ENTER);
		Thread.sleep(5000);
		Driver.close();
		
		
	}

}
