package com.hashworks.testing.SeliniumJenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void testStart() {
		System.setProperty("webdriver.chrome.driver", "src/main/resorurces/exe/chromedriver");;
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		chromeOptions.addArguments("--disable-gpu");
		chromeOptions.addArguments("--no-sandbox");
		 driver = new ChromeDriver(chromeOptions);
//		 driver = new ChromeDriver();
	}
	@Test
	public void testFacebook() {		
		try {
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.findElement(By.id("email")).sendKeys("abc");
			driver.findElement(By.id("pass")).sendKeys("abc");
//			driver.findElement(By.xpath("//input[@value='Log In']")).click();
// 			driver.findElement(By.xpath("//input[@value='Log In']")).sendKeys(Keys.ENTER);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@AfterTest
	public void close() {
		driver.quit();
	}
}
