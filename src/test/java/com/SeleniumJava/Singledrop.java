package com.SeleniumJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Singledrop {

	public static void main(String []args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
		WebElement courses = d.findElement(By.id("course"));
		Select options = new Select(courses);
		List<WebElement> coursesdrop = options.getOptions();
	
		for(WebElement co : coursesdrop)
		{
			System.out.println(co.getText());
		}
		
		// By Using index
		options.selectByIndex(1);
		Thread.sleep(3000);
		
		//By Using value
		
		options.selectByValue("net");
		Thread.sleep(3000);
		
		//By using Visible Text
		
		options.selectByVisibleText("Python");
		Thread.sleep(3000);
		
		
		
		String VT = options.getFirstSelectedOption().getText();
		System.out.println("Visible Text: " +VT);
		
		
		WebElement course = d.findElement(By.id("ide"));
		Select option = new Select(course);
		List<WebElement> coursesdrops = option.getOptions();
	
		for(WebElement cos : coursesdrops)
		{
			System.out.println(cos.getText());
		}
		
		// By Using index
		option.selectByIndex(1);
		Thread.sleep(3000);
		
		//By Using value
		
		option.selectByValue("ij");
		Thread.sleep(3000);
		
		//By using Visible Text
		
		option.selectByVisibleText("NetBeans");
		Thread.sleep(3000);
		
		option.deselectByVisibleText("Visual Studio");
		
		List<WebElement> SO = option.getAllSelectedOptions();
		for(WebElement WE:SO)
		{
			System.out.println("Selected  Visible Text: " +WE.getText());
		}
		d.close();
		
		
		
		
	}
}
