package com.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googles {
	@Test
	public void Search() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		 driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-1341518722%3A1670322761140376&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Drm%26ogbl&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Drm%26ogbl&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=ARgdvAsy-YD-gl9gkOAV294LsFYa4TFS-C1LpEcsBjNeGx0mxybMKhHXX9px96pGc-DUQ7ZRc0nj");
		 driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		 Thread.sleep(2000);
		 String s=driver.getTitle();
		 System.out.println(s);
		 driver.close();
	}
}
