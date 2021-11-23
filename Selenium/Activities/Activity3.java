package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		String s = driver.getTitle();
		System.out.println("Title" + s);
		WebElement Firstname=driver.findElement(By.id("firstName"));
		Firstname.sendKeys("Lakshmi");
		WebElement Lastname=driver.findElement(By.id("lastName"));
		Lastname.sendKeys("Maruboyina");
		driver.findElement(By.id("email")).sendKeys("test@example.com");
        driver.findElement(By.id("number")).sendKeys("0123456789");
        driver.findElement(By.cssSelector(".ui.green.button")).click();
        driver.close();
		
	}

}
