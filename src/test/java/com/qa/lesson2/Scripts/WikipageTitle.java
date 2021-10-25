package com.qa.lesson2.Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WikipageTitle {
	
	WebDriver driver ;
	@BeforeClass
	public void openbrowser()
	{
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
	}
	
	@Test(priority='1')
	public void HomepageTestTitle()
	{

System.out.println(driver.getTitle());
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}


}
