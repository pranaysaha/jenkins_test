package com.hashworks.testing.SeliniumJenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FacebookTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void testStart() {
		//ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("--headless");
		//chromeOptions.addArguments("--disable-gpu");
		//chromeOptions.addArguments("--no-sandbox");
		//driver = new ChromeDriver(chromeOptions);
		 driver = new ChromeDriver();

		// FirefoxOptions firefoxOptions = new FirefoxOptions();
		// firefoxOptions.addArguments("--headless");
		// firefoxOptions.addArguments("--disable-gpu");
		// firefoxOptions.addArguments("--no-sandbox");
		// driver = new FirefoxDriver(firefoxOptions);
		// driver = new FirefoxDriver();

	}
	@Test
	public void testFacebook() {		
		try {
			// driver.get("https://www.facebook.com");
			//driver.manage().window().maximize();
			// driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			// driver.findElement(By.id("email")).sendKeys("abc");
			// driver.findElement(By.id("pass")).sendKeys("abc");
			// driver.findElement(By.xpath("//input[@value='Log In']")).click();
			// driver.findElement(By.xpath("//input[@value='Log In']")).sendKeys(Keys.ENTER);
		
			driver.get("https://github.com/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			System.out.println("entering email id...");
			driver.findElement(By.id("login_field")).sendKeys("abc");
			driver.findElement(By.id("password")).sendKeys("abc");
			driver.findElement(By.xpath("//div[contains(@class,'mt-3')]//input[contains(@value,'Sign in')]")).click();
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}
		
		
	}
	
	@AfterTest
	public void close() {
		driver.quit();
	}
}
