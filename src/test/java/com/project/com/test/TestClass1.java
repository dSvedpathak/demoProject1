package com.project.com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass1 {
	WebDriver driver;
	@BeforeMethod
public void LounchBrowser() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(8);
}
	@Test
	public void Test1() throws InterruptedException {
		driver.navigate().to("https://automationtalks.com/");
		Thread.sleep(8);

		System.out.println("test1"+driver.getTitle());
	}
	@Test
	public void Test2() throws InterruptedException {
		driver.navigate().to("https://automationtalks.com/");
		Thread.sleep(8);

		System.out.println("test2"+driver.getTitle());
	}
	@Test
	public void Test3() throws InterruptedException {
		driver.navigate().to("https://automationtalks.com/");
		Thread.sleep(8);

		System.out.println("test3"+driver.getTitle());
	}
	@AfterMethod
	public void closebrowser() throws InterruptedException 
	{
		Thread.sleep(8);

		driver.quit();
	}
	
}
