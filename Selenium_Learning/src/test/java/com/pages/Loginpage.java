package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;

public class Loginpage extends Library
{
	@FindBy(id="txtUsername")
WebElement username;
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement Loginbuttion;
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory .initElements(driver, this);
	}
	
	public void login(String uname,String pas)
	
	{
		username.sendKeys(uname);
		password.sendKeys(pas);
		Loginbuttion.click();
	}
}
