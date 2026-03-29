package com.SeleniumJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


class AppTest
{
	public static void main(String [] args)
	{
		
		
		System.setProperty("webdriver.chrome.driver", "./Resource/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=O_eupfuwRT0&list=PLacgMXFs7kl_7BbV1p_KqDYM65Zm4L_HU&index=6");
		
//		System.out.println("Title: " +driver.getTitle());
//		System.out.println("CurrentURL: " +driver.getCurrentUrl());
//	driver.quit();
		
		

		
	}
}