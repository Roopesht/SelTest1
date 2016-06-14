package com.rl.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.ExecuteMethod;
import org.openqa.selenium.remote.RemoteExecuteMethod;
import org.openqa.selenium.remote.RemoteTouchScreen;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleTest {

	@Test
	@Parameters({ "url" })
	public void TestSearch(String url) throws InterruptedException, MalformedURLException {

		
		WebDriver driver = getDriver();
		driver.get(url);
		
		ExecuteMethod method = new touch(driver);
		RemoteTouchScreen screen = new RemoteTouchScreen(method);
		
		
		driver.switchTo().alert().accept();
		Thread.sleep(10000);

		SearchShirts(driver);
		Thread.sleep(10000);
		
		/*
//String searchXPath = "//input[contains(@data-automation-ref,'SearchTxtBx')]";
String searchXPath = "(//input[contains(@title,'Search')])[1]";

//String btnXPath = "(//button[contains(@data-automation-ref,'SearchBtn')])[1]";
String btnXPath = "(//button[contains(@role,'button')])[1]";

  WebElement searchBox = getElementByXpath(driver, searchXPath);
  WebElement searchButton = getElementByXpath(driver, btnXPath);
  searchBox.sendKeys("Shirt");
  searchButton.click();
  */
  
  driver.quit();
}
	private WebDriver getDriver() throws MalformedURLException {
		String masterUrl = "http://" + "roopesh_t" + ":" + "7a2c78fd-8108-47d7-ba59-828f7e85902c" + "@ondemand.saucelabs.com:80/wd/hub";
		DesiredCapabilities caps = DesiredCapabilities.android();
		caps.setCapability("platform", "MAC");
		caps.setCapability("platformName", "iOS");
		caps.setCapability("platformVersion", "9.2");
		caps.setCapability("browserName", "Safari");
		caps.setCapability("deviceName","iPhone 6");
		caps.setCapability("deviceOrientation", "portrait");
	    caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		WebDriver driver = new RemoteWebDriver(new URL(masterUrl), caps);
		 
	    //Browserstack Chrome
		/*
		DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("browser", "Chrome");
	    caps.setCapability("browser_version", "48.0");
	    caps.setCapability("os", "Windows");
	    caps.setCapability("os_version", "7");
	    caps.setCapability("browserstack.debug", "true");
	    caps.setCapability("browserstack.local", "true");

	
	    //Browserstack Mobile
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("Android");
	    caps.setCapability("device", "Samsung Galaxy S5");
	    //caps.setCapability("browser", "Android");
	    caps.setCapability("os", "android");
		*/
		return driver;
	}
	private void SearchShirts (WebDriver driver) {
		String searchXPath = "//input[contains(@data-automation-ref,'SearchTxtBx')]";
		//String searchXPath = "(//input[contains(@title,'Search')])[1]";

		String btnXPath = "(//button[contains(@data-automation-ref,'SearchBtn')])[1]";
		//String btnXPath = "(//button[contains(@role,'button')])[1]";

		  WebElement searchBox = getElementByXpath(driver, searchXPath);
		  WebElement searchButton = getElementByXpath(driver, btnXPath);
		  searchBox.sendKeys("Shirt");
		  searchButton.click();
	}

	private WebElement getElementByXpath(WebDriver driver, String xpath) {

		return driver.findElement(By.xpath(xpath));
	}

}
  