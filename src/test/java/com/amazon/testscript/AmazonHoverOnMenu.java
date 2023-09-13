package com.amazon.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.pages.LandingPage;


public class AmazonHoverOnMenu {
	WebDriver driver;
	
	@BeforeTest
	public void startApplication() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		
	}
	
	@Test
	public void Hover() throws InterruptedException {
		LandingPage landingpage = new LandingPage(driver);
		landingpage.HoverOnPointer();
		Thread.sleep(4000);
		
		landingpage.clickOnSignin();
		landingpage.enterEmail("abfsdjf---==@gmail.com");
		landingpage.clickOnContinueButtion();
		driver.close();
		
	}
	
	
}
