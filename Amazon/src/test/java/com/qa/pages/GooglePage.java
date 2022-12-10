package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[1]/a")
	WebElement gmail;
	public WebElement Gmail() {
		return gmail;
	}
	
	@FindBy(xpath="/html/body/header/div/div/div/a[2]")
	WebElement signIn;
	public WebElement SignIn() {
		return signIn;
	}
	@FindBy(xpath ="//*[@id=\'yDmH0d\']/c-wiz/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/button/span")
	WebElement create;
	public WebElement Create() {
		return create;
	}
	@FindBy(xpath="//*[@id=\"firstName\"]")
	WebElement first;
	public WebElement First() {
		return first;
	}
	
	@FindBy(xpath="//*[@id=\"lastName\"]")
	WebElement lastname;
	public WebElement Lastname() {
		return lastname;
	}
	
	@FindBy(xpath="//*[@id=\"username\"]")
	WebElement username;
	public WebElement Username() {
		return username;
	}
	
	@FindBy(xpath="//*[@id=\"passwd\"]/div[1]/div/div[1]/input")
	WebElement password;
	public WebElement Password() {
		return password;
	}
	
	@FindBy(xpath="//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input")
	WebElement cpassword;
	public WebElement CPassword() {
		return cpassword;
	}
	
	//WebElement 
	public GooglePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);

	}
}
