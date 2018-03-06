package com.hashworks.testing.SeliniumJenkins;

import java.awt.Dimension;
import java.awt.Point;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class FacebookTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void testStart() {
//		ChromeOptions chromeOptions = new ChromeOptions();
//		chromeOptions.addArguments("--headless");
//		chromeOptions.addArguments("--disable-gpu");
//		chromeOptions.addArguments("--no-sandbox");
//		driver = new ChromeDriver(chromeOptions);
		// driver = new ChromeDriver();
		
//		FirefoxOptions firefoxOptions = new FirefoxOptions();
//		firefoxOptions.addArguments("--headless");
//		firefoxOptions.addArguments("--disable-gpu");
//		firefoxOptions.addArguments("--no-sandbox");
//		driver = new FirefoxDriver(firefoxOptions);
//		driver = new FirefoxDriver();
		
//		driver = new HtmlUnitDriver();
		
// Change this to match the location of your server
	URL server;
	String browser_name = "chrome";
	try {
		// to run on windows with dockerToolbox uncomment next line of code
		server = new URL("http://192.168.99.101:4444/wd/hub");

		// to run the code on docker setup on Linux_VM uncomment next line of code
		// server = new URL("http://172.16.0.40:4444/wd/hub");
		DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setBrowserName(browser_name);

	    System.out.println("Connecting to " + server);

	    driver = new RemoteWebDriver(server, capabilities);
		
	} catch (MalformedURLException e) {
		e.printStackTrace();
	}
		
	}
	@Test
	public void testFacebook() {		
		try {
			driver.get("https://github.com/login");
			// driver.manage().window().maximize();
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
