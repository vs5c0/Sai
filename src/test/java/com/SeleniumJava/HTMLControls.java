package com.SeleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTMLControls {

	public static void main(String [] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(3000);
		
		d.findElement(By.id("firstName")).sendKeys("Jagan Mohan Reddy");
		Thread.sleep(2000);
		
		d.findElement(By.id("lastName")).sendKeys("CM");
		Thread.sleep(2000);
		
		
		//Radio Button
		
		d.findElement(By.id("femalerb")).click();
		Thread.sleep(3000);
		
		WebElement male = d.findElement(By.id("malerb"));
		male.click();
		if(male.isSelected())
		{
			male.click();
		}
		
		//Check Boxes
		
		d.findElement(By.id("englishchbx")).click();
		Thread.sleep(3000);
		
		d.findElement(By.id("hindichbx")).click();
		Thread.sleep(3000);
		
		d.findElement(By.id("chinesechbx")).click();
		Thread.sleep(3000);
		
		//Buttons 
		
		d.findElement(By.id("registerbtn")).click();
		System.out.println(d.findElement(By.id("msg")).getText());
		
		d.findElement(By.id("clearbtn")).click();
		
		
		//link Text
		
		d.findElement(By.linkText("Click here to navigate to the home page")).click();
	}
}
