package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	private static final String Webelement = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		String s=driver.getTitle();
		System.out.println("Tittle "+ s);
		WebElement idlocator=driver.findElement(By.id("about-link"));
		System.out.println("Text in element with id locator" + idlocator.getText());
		WebElement classlocator=driver.findElement(By.className("green"));
		System.out.println("Text in element with class locator" + classlocator.getText());
		WebElement linktextlocator=driver.findElement(By.linkText("About Us"));
		System.out.println("Text in element with link text locator" + linktextlocator.getText());
		WebElement csslocator=driver.findElement(By.cssSelector(".green"));
		System.out.println("Text in element with css locator" + csslocator.getText());
		WebElement cssidlocator=driver.findElement(By.cssSelector("#about-link"));
		System.out.println("Text in element with css locator" + cssidlocator.getText());
		driver.close();
	}

}
