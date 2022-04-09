package com.Seleniumreusability_Function;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Baseclass.Library;

public class Reusable  extends Library{
	public Reusable(WebDriver driver) {
		this.driver=driver;
		
	}
	public void to_take_screenshot(String path) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source,new File(path));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void getTitle() {
		
		System.out.println(driver.getTitle());
	
	}
	
		
	
	public void dropdown(WebElement element,String selectedvalue) {
		Select select = new Select(element); 
		select.selectByVisibleText(selectedvalue);
		
	}
	
	public  void actions() {
		Actions action=new Actions(driver);
		action.moveToElement().perform();
           		

	}
	


}
