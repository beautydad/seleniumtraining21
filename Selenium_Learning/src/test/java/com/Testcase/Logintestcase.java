package com.Testcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Baseclass.Library;
import com.Seleniumreusability_Function.Reusable;
import com.pages.Loginpage;

public class Logintestcase extends Library
{
@BeforeTest
public void startup() {
	launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");

}

@Test
public void login() {
Loginpage ipage=new Loginpage(driver);
ipage.login("Admin", "admin123");
}

@AfterTest
public void close() {
Reusable re=new Reusable(driver);
re.to_take_screenshot("/Selenium_Learning/src/test/resources/Screenshot");

quit();
}

}
