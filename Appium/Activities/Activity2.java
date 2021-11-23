package activity;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class Activity2 {
	WebDriverWait wait;
	AndroidDriver<MobileElement> driver = null;
	@BeforeTest
	public void setup() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "mobile_testing");
		caps.setCapability("platformName", "Android");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("appPackage", "com.android.chrome");
		caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		caps.setCapability("noReset", true);
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		wait = new WebDriverWait(driver, 10);
	}
	@Test
	public void testSearchAppium() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.training-support.net/");
		String pageTitle = driver.findElementByXPath("//android.view.View[@text='Training Support']").getText();
		System.out.println("Title on Homepage: " + pageTitle);
		// wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("/android.view.View[4][contains(@text,'About
		// Us')]")));
		Thread.sleep(5000);
		driver.findElementByXPath("//android.view.View[4][contains(@text,'About Us')]").click();
		String newPageTitle = driver.findElementByXPath("//android.view.View[2][contains(@text,'About Us')]").getText();
		System.out.println("Title on new page: " + newPageTitle);
		Assert.assertEquals(pageTitle, "Training Support");
		Assert.assertEquals(newPageTitle, "About Us");
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
