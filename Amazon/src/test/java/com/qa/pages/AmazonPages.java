package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPages 
{
	WebDriver driver;
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement search;
	 
	public WebElement Searchbox() {
		return search;
		
	}
	
	@FindBy(xpath="//*[@id=\"nav-search-submit-button\"]")
	WebElement magnifier;
	public WebElement Magnifier() {
		return magnifier;
		
	}
	public AmazonPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}