package com.SeleniumJava;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Text {

	public static void main(String [] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver d  = new ChromeDriver();
		d.get("https://github.com/login");
		d.manage().window().maximize();
		
		//Handle the text box 
		 WebElement user = d.findElement(By.id("login_field"));
		 
		 if(user.isDisplayed())
		 {
			 if(user.isEnabled())
			 {
				 user.sendKeys("Jagan");
				 String usertext = user.getAttribute("value");
				 System.out.println(usertext);
				 Thread.sleep(3000);
				 user.sendKeys(" Mohan Reddy");
			
				 
			 }
			 else {
				 System.err.println("User is not enable");
			 }
		 }
		 else {
			 System.err.println("User is not displayed");
		 }
		
	}
}
