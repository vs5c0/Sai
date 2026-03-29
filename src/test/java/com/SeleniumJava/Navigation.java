package com.SeleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {
	public static void main(String [] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://google.com");
		Thread.sleep(3000);
		
		d.findElement(By.name("q")).sendKeys("Github");
		d.findElement(By.name("q")).submit();
		Thread.sleep(3000);
		
		d.navigate().to("https://github.com/login");
		Thread.sleep(3000);
		d.findElement(By.id("login_field")).sendKeys("Venkat@234");
		Thread.sleep(2000);
		d.findElement(By.id("password")).sendKeys("12345");
		Thread.sleep(3000);
		
		d.findElement(By.name("commit")).submit();
		Thread.sleep(3000);
		
		d.navigate().refresh();
		Thread.sleep(2000);
		
		d.navigate().back();
		Thread.sleep(2000);
		
		d.navigate().forward();
		Thread.sleep(2000);
		d.quit();
		
		
		
	}

}
