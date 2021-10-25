package com.qa.lesson2.Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WikiLoginPageTest {
	
	WebDriver driver ;
	@BeforeClass
	public void openbrowser()
	{
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
	}
	
	@Test(priority='1')
	public void HomepageTest() throws InterruptedException
	{
		driver.findElement(By.id("searchInput")).sendKeys("selenium automation");
		driver.findElement(By.xpath("//*[@id='search-form']/fieldset/button")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority='2')
	
	public void searchpageTest() throws InterruptedException
	{
		driver.findElement(By.linkText("Main page")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Contact us")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log in")).click();
		//Thread.sleep(3000);
	}
	
	@Test(priority='3')
	public void loginTest() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.navigate().to("https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Main+Page");
		driver.findElement(By.xpath("//*[@id=\"mw-createaccount-join\"]")).click();
		
	driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
