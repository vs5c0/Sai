package com.SeleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager.*;
public class web {

	public static void main(String [] args) throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login");
		Thread.sleep(3000);
		// ID Locator 
		
		highlight(driver, driver.findElement(By.id("login_field")));
		Thread.sleep(3000);
		
		//Name Locator
		
		highlight(driver, driver.findElement(By.name("password")));
		Thread.sleep(3000);
		
		//class or className Locators
		
		highlight(driver, driver.findElement(By.className("authentication-login-footer-links")));
		Thread.sleep(3000);
		
		//LinkText Locator
		
		highlight(driver, driver.findElement(By.linkText("Forgot password?")));
		Thread.sleep(3000);
		
	    //PartiallinkText Locator
		
		highlight(driver, driver.findElement(By.partialLinkText("Create an ")));
		Thread.sleep(3000);
		
		//Tag locator
		
		highlight(driver, driver.findElement(By.tagName("h1")));
		Thread.sleep(3000);
		
	    //Xpath Locator
		
		highlight(driver, driver.findElement(By.xpath("//label[contains(text(), 'Username or email address')]")));
		Thread.sleep(3000);
		
        //Css Selectors Locator
 		
		highlight(driver, driver.findElement(By.cssSelector("input[name='commit']")));
		Thread.sleep(3000);
		
	
		
		
	}
	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:white')", element);
	}
}
