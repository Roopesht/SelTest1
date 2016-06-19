package com.rl.tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleTest {
	private String masterUrl = "http://" + "roopesh_t" + ":"
			+ "7a2c78fd-8108-47d7-ba59-828f7e85902c"
			+ "@ondemand.saucelabs.com:80/wd/hub";
	private String xpath = "//*[@id='menuIcon']";
	private long sleepTime = 120000;

	@Test
	@Parameters({ "url" })
	public void Touch1Test(String url) throws MalformedURLException,
			InterruptedException {
		try {
			System.out.println("------------Touch1Test---------------");
			IOSDriver driver = getIOSDriver(url);
			WebElement element = driver.findElement(By.xpath(xpath));
			org.openqa.selenium.interactions.touch.TouchActions action = new org.openqa.selenium.interactions.touch.TouchActions(
					driver);
			action.singleTap(element).perform();
			System.out.println("************************* Sucess Touch1");
			Thread.sleep(2000);
			driver.quit();
		} catch (Exception e) {
			System.out.println("Touch 1: " + e.getMessage());
			e.printStackTrace();
		}
	}

	@Test
	@Parameters({ "url" })
	public void Touch2Test(String url) throws MalformedURLException,
			InterruptedException {
		try {
			System.out.println("------------Touch2Test---------------");
			IOSDriver driver = getIOSDriver(url);
			io.appium.java_client.TouchAction action = new io.appium.java_client.TouchAction(
					driver);
			WebElement element = driver.findElement(By.xpath(xpath));
			action.tap(element).perform();
			System.out.println("************************* Sucess Touch2");
			Thread.sleep(2000);
			driver.quit();
		} catch (Exception e) {
			System.out.println("Touch 2: " + e.getMessage());
			e.printStackTrace();
		}
	}

	@Test
	@Parameters({ "url" })
	public void Touch3Test(String url) throws MalformedURLException,
			InterruptedException {
		try {
			SwipableWebDriver driver = getSwipeWebDriver(url);
			System.out.println("------------Touch3Test---------------");
			String javascriptToExecute = "window.jQuery(document.getElementById('menuIcon')).trigger('tap');";
			((JavascriptExecutor) driver).executeScript(javascriptToExecute);
			System.out.println("************************* Sucess Touch3");
			Thread.sleep(2000);
			driver.quit();
		} catch (Exception e) {
			System.out.println("Touch 3: " + e.getMessage());
			e.printStackTrace();
		}
	}

	@Test
	@Parameters({ "url" })
	public void Touch4Test(String url) throws MalformedURLException,
			InterruptedException {
		try {
			SwipableDriver driver = getSwipableDriver(url);
			System.out.println("------------Touch4Test---------------");
			io.appium.java_client.TouchAction action = new io.appium.java_client.TouchAction(
					driver);
			WebElement element = driver.findElement(By.xpath(xpath));
			action.tap(element).perform();
			System.out.println("************************* Sucess Touch4");
			Thread.sleep(2000);
			driver.quit();
		} catch (Exception e) {
			System.out.println("Touch 4: " + e.getMessage());
			e.printStackTrace();
		}
	}

	@Test
	@Parameters({ "url" })
	public void Touch5Test(String url) throws MalformedURLException,
			InterruptedException {
		try {
			System.out.println("------------Touch5Test---------------");
			SwipableDriver driver = getSwipableDriver(url);
			io.appium.java_client.TouchAction action = new io.appium.java_client.TouchAction(
					driver);
			WebElement element = driver.findElement(By.xpath(xpath));
			action.tap(element).perform();
			System.out.println("************************* Sucess Touch5");
			Thread.sleep(2000);
			driver.quit();
		} catch (Exception e) {
			System.out.println("Touch 5: " + e.getMessage());
			e.printStackTrace();
		}
	}

	@Test
	@Parameters({ "url" })
	public void Touch6Test(String url) throws MalformedURLException,
			InterruptedException {
		try {
			System.out.println("------------Touch6Test---------------");
			SwipableWebDriver driver = getSwipeWebDriver(url);
			WebElement element = driver.findElement(By.xpath(xpath));
			io.appium.java_client.TouchAction action = new io.appium.java_client.TouchAction(
					(io.appium.java_client.MobileDriver) driver);
			action.tap(element).perform();
			System.out.println("************************* Sucess Touch6");
			Thread.sleep(2000);
			driver.quit();
		} catch (Exception e) {
			System.out.println("Touch 6: " + e.getMessage());
			e.printStackTrace();
		}
	}

	@Parameters({ "url" })
	public void tryTouchActionIPhone(String url) throws MalformedURLException {
		// SwipableDriver driver = getSwipableDriver();
		// SwipableWebDriver driver = getSwipeWebDriver();
		IOSDriver driver = getIOSDriver(url);
		// AndroidDriver driver = getAndroidDriver();

		WebElement element = driver
				.findElement(By.xpath("//*[@id='menuIcon']"));

		try {
			// String javascriptToExecute =
			// "window.jQuery(document.elementFromPoint(9,19)).trigger('tap');";
			String javascriptToExecute = "window.jQuery(document.getElementById('bagHeader')).trigger('click');";
			((JavascriptExecutor) driver).executeScript(javascriptToExecute);
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		/*
		 * try { TouchAction touchAction = new TouchAction(driver);
		 * touchAction.tap("#menuIcon"); Thread.sleep(2000); } catch (Exception
		 * e) { System.out.println(e.getMessage()); e.printStackTrace(); }
		 */
		try {
			WebElement el1 = driver.findElement(By.className("slot1"));
			// driver.tap(1, el1, 300);
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		try {
			String javascriptToExecute = "window.jQuery(document.elementFromPoint("
					+ element.getLocation().x
					+ ","
					+ element.getLocation().y
					+ ")).trigger('tap');";
			((JavascriptExecutor) driver).executeScript(javascriptToExecute);
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		if (driver != null)
			driver.quit();
		return;
	}

	@Parameters({ "url" })
	private void tryTouchActionAndroid(String url) throws MalformedURLException {
		AndroidDriver driver = getAndroidDriver();
		try {
			driver.get(url);
			driver.switchTo().alert().accept();
			Thread.sleep(sleepTime);
		} catch (Exception e) {
		}

		WebElement element = driver
				.findElement(By.xpath("//*[@id='menuIcon']"));

		/*
		 * try { driver.tap(1, element, 200); TouchAction touchAction = new
		 * TouchAction(driver); touchAction.tap("#menuIcon");
		 * Thread.sleep(2000); } catch (Exception e) { }
		 */
		try {
			WebElement el1 = driver.findElement(By
					.className("cta_container cont1 hotspot slot1"));
			driver.tap(1, el1, 300);
			Thread.sleep(2000);
		} catch (Exception e) {
		}

		try {
			String javascriptToExecute = "window.jQuery(document.getElementById('menuIcon')).trigger('tap');";
			((JavascriptExecutor) driver).executeScript(javascriptToExecute);
			Thread.sleep(2000);
		} catch (Exception e) {
		}

		try {
			String javascriptToExecute = "window.jQuery(document.elementFromPoint("
					+ element.getLocation().x
					+ ","
					+ element.getLocation().y
					+ ")).trigger('tap');";
			((JavascriptExecutor) driver).executeScript(javascriptToExecute);
			Thread.sleep(2000);
		} catch (Exception e) {
		}

		if (driver != null)
			driver.quit();

		return;
	}

	@SuppressWarnings("unused")
	private WebDriver createChromeDriver() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\CATS\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	@SuppressWarnings("unused")
	private WebDriver createFirefoxDriver() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(FirefoxDriver.PROFILE, new FirefoxProfile());
		capabilities.setBrowserName("firefox");
		FirefoxProfile profile = new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true);
		profile.setAssumeUntrustedCertificateIssuer(true);
		capabilities.setCapability(FirefoxDriver.PROFILE, profile);

		WebDriver driver = null;
		try {
			driver = new FirefoxDriver(capabilities);
		} catch (Exception e) {
		}
		return driver;
	}

	private AndroidDriver getAndroidDriver() throws MalformedURLException {
		DesiredCapabilities caps = DesiredCapabilities.android();
		caps.setCapability("appiumVersion", "1.5.2");
		caps.setCapability("deviceName", "LG Nexus 4 Emulator");
		caps.setCapability("deviceOrientation", "portrait");
		caps.setCapability("browserName", "Browser");
		caps.setCapability("platformVersion", "4.4");
		caps.setCapability("platformName", "Android");
		caps.setCapability("nativeWebTap", true);
		AndroidDriver driver = new AndroidDriver(new URL(masterUrl), caps);
		return driver;
	}

	private IOSDriver getIOSDriver(String url) throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("appiumVersion", "1.5.3");
		desiredCapabilities.setCapability("deviceName", "iPhone 6");
		desiredCapabilities.setCapability("deviceOrientation", "portrait");
		desiredCapabilities.setCapability("platformVersion", "9.3");
		desiredCapabilities.setCapability("platformName", "iOS");
		desiredCapabilities.setCapability("browserName", "Safari");

		IOSDriver driver = new IOSDriver(new URL(masterUrl),
				desiredCapabilities);
		try {
			driver.get(url);
			driver.switchTo().alert().accept();
			Thread.sleep(sleepTime);
		} catch (Exception e) {
		}

		return driver;
	}

	private SwipableDriver getSwipableDriver(String url)
			throws MalformedURLException {

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("appiumVersion", "1.5.3");
		desiredCapabilities.setCapability("deviceName", "iPhone 6");
		desiredCapabilities.setCapability("deviceOrientation", "portrait");
		desiredCapabilities.setCapability("platformVersion", "9.3");
		desiredCapabilities.setCapability("platformName", "iOS");
		desiredCapabilities.setCapability("browserName", "Safari");

		SwipableDriver driver = new SwipableDriver(new URL(masterUrl),
				desiredCapabilities);
		try {
			driver.get(url);
			driver.switchTo().alert().accept();
			Thread.sleep(sleepTime);
		} catch (Exception e) {
		}
		return driver;
	}

	private SwipableWebDriver getSwipeWebDriver(String url)
			throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("appiumVersion", "1.5.3");
		desiredCapabilities.setCapability("deviceName", "iPhone 6");
		desiredCapabilities.setCapability("deviceOrientation", "portrait");
		desiredCapabilities.setCapability("platformVersion", "9.3");
		desiredCapabilities.setCapability("platformName", "iOS");
		desiredCapabilities.setCapability("browserName", "Safari");

		SwipableWebDriver driver = new SwipableWebDriver(new URL(masterUrl),
				desiredCapabilities);
		try {
			driver.get(url);
			driver.switchTo().alert().accept();
			Thread.sleep(sleepTime);
		} catch (Exception e) {
		}

		return driver;
	}

	@SuppressWarnings("unused")
	private WebDriver getWebDriver(String url) throws MalformedURLException {
		DesiredCapabilities caps = DesiredCapabilities.android();
		caps.setCapability("platform", "MAC");
		caps.setCapability("platformName", "iOS");
		caps.setCapability("platformVersion", "9.2");
		caps.setCapability("browserName", "Safari");
		caps.setCapability("deviceName", "iPhone 6");
		caps.setCapability("deviceOrientation", "portrait");
		caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		WebDriver driver = new RemoteWebDriver(new URL(masterUrl), caps);
		try {
			driver.get(url);
			driver.switchTo().alert().accept();
			Thread.sleep(sleepTime);
		} catch (Exception e) {
		}
		return driver;

		// Browserstack Chrome
		/*
		 * DesiredCapabilities caps = new DesiredCapabilities();
		 * caps.setCapability("browser", "Chrome");
		 * caps.setCapability("browser_version", "48.0");
		 * caps.setCapability("os", "Windows"); caps.setCapability("os_version",
		 * "7"); caps.setCapability("browserstack.debug", "true");
		 * caps.setCapability("browserstack.local", "true");
		 * 
		 * 
		 * //Browserstack Mobile DesiredCapabilities caps = new
		 * DesiredCapabilities(); caps.setBrowserName("Android");
		 * caps.setCapability("device", "Samsung Galaxy S5");
		 * //caps.setCapability("browser", "Android"); caps.setCapability("os",
		 * "android");
		 */
	}

	@SuppressWarnings("unused")
	private void SearchShirts(WebDriver driver) {
		String searchXPath = "//input[contains(@data-automation-ref,'SearchTxtBx')]";
		// String searchXPath = "(//input[contains(@title,'Search')])[1]";

		String btnXPath = "(//button[contains(@data-automation-ref,'SearchBtn')])[1]";
		// String btnXPath = "(//button[contains(@role,'button')])[1]";

		WebElement searchBox = getElementByXpath(driver, searchXPath);
		WebElement searchButton = getElementByXpath(driver, btnXPath);
		searchBox.sendKeys("Shirt");
		searchButton.click();
	}

	@SuppressWarnings("unused")
	private void OpenHamburgerClick(WebDriver driver) {
		String searchXPath = ".//*[@id='menuHeader']";
		WebElement hamburger = getElementByXpath(driver, searchXPath);
		hamburger.click();
	}

	private WebElement getElementByXpath(WebDriver driver, String xpath) {
		return driver.findElement(By.xpath(xpath));
	}
}
