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

public class Activity1 {
  WebDriverWait wait;
	AndroidDriver<MobileElement> driver;
	@BeforeTest
	public void setup() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "mobile_testing");
		caps.setCapability("platformName", "Android");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("appPackage", "com.google.android.apps.tasks");
		caps.setCapability("appActivity", ".ui.TaskListsActivity");
		caps.setCapability("noReset", true);
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		wait = new WebDriverWait(driver, 10);
	}
	@Test
	public void addListInTask() throws InterruptedException {
		String addTask[] = { "Complete Activity with Google Tasks", "Complete Activity with Google Keep",
				"Complete the second Activity Google Keep" };
		for (String task : addTask) {
			wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("tasks_fab")));
			driver.findElementById("tasks_fab").click();
			wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("add_task_title")));
			MobileElement addTaskTitle = driver.findElementById("add_task_title");
			MobileElement saveButton = driver.findElementById("add_task_done");
			addTaskTitle.sendKeys(task);
			saveButton.click();
		}
		wait.until(ExpectedConditions.numberOfElementsToBe(MobileBy.id("task_name"), 3));
		List<MobileElement> textAdded = driver.findElementsById("com.google.android.apps.tasks:id/task_name");
		Assert.assertEquals(textAdded.size(), 3);
		Assert.assertEquals(textAdded.get(2).getText(), "Complete Activity with Google Tasks");
		Assert.assertEquals(textAdded.get(1).getText(), "Complete Activity with Google Keep");
		Assert.assertEquals(textAdded.get(0).getText(), "Complete the second Activity Google Keep");
	}
	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
