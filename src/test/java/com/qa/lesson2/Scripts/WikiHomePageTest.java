package com.qa.lesson2.Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WikiHomePageTest {
	
	WebDriver driver ;
	@BeforeClass
	public void openbrowser()
	{
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
	}
	
	@Test(priority='1')
	public void HomepageTest()
	{
		driver.findElement(By.id("searchInput")).sendKeys("selenium automation");
		driver.findElement(By.xpath("//*[@id='search-form']/fieldset/button")).click();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}

}
