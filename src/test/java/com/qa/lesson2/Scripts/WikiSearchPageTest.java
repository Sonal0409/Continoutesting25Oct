package com.qa.lesson2.Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WikiSearchPageTest {
	
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
	
	public void searchpageTest()
	{
		driver.findElement(By.linkText("Main page")).click();
		driver.findElement(By.linkText("Contact us")).click();
		driver.findElement(By.linkText("Log in")).click();
	}

	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}

}
