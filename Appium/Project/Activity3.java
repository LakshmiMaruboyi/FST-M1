package aapium_fst_project;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class Activity3 {
	WebDriverWait wait;
    AndroidDriver<MobileElement> driver;
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	 
	  DesiredCapabilities caps = new DesiredCapabilities();
      caps.setCapability("deviceName", "mobile_testing");
      caps.setCapability("platformName", "Android");
      caps.setCapability("automationName", "UiAutomator2");
      caps.setCapability("appPackage", "com.google.android.keep");
      caps.setCapability("appActivity", ".activities.BrowseActivity");
      caps.setCapability("noReset", true);
   driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
   wait = new WebDriverWait(driver, 10);
  }
  @Test
  public void addReminderToNote(){
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("New text note")));
	  driver.findElementByAccessibilityId("New text note").click();
	 
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("com.google.android.keep:id/editable_title")));
	  driver.findElementById("com.google.android.keep:id/editable_title").sendKeys("Reminder Test Title");
	 
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("com.google.android.keep:id/edit_note_text")));
	  driver.findElementById("com.google.android.keep:id/edit_note_text").sendKeys("This is note for reminder testing");
	  driver.findElementByAccessibilityId("Reminder").click();
	 
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("com.google.android.keep:id/menu_text")));
	  driver.findElementByXPath("//android.widget.TextView[contains(@text,'Pick a date & time')]").click();
	
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("com.google.android.keep:id/time_spinner")));
	  driver.findElementById("com.google.android.keep:id/time_spinner").click();
	 
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("com.google.android.keep:id/reminder_time_afternoon")));
	  driver.findElementById("com.google.android.keep:id/reminder_time_afternoon").click();
	
	  driver.findElementById("com.google.android.keep:id/save").click();
	 
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Open navigation drawer")));
	  driver.findElementByAccessibilityId("Open navigation drawer").click();
	  List<MobileElement> titleAdded = driver.findElementsById("index_note_title");
	  List<MobileElement> noteAdded = driver.findElementsById("index_note_text_description");
	  List<MobileElement> reminderAdded = driver.findElementsById("reminder_chip_text");
	 
	  Assert.assertEquals(titleAdded.get(0).getText(), "Reminder Test Title");
	  Assert.assertEquals(noteAdded.get(0).getText(), "This is note for reminder testing");
	  Assert.assertEquals(reminderAdded.get(0).getText(), "Today, 1:00 PM");
	 
  }
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
}
