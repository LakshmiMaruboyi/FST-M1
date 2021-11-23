package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		String s= driver.getTitle();
		System.out.println("title" + s);
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Lakshmi");
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Maruboyina"); 
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Lakshmisri1415@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"number\"]")).sendKeys("8919426436");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[5]/textarea")).sendKeys("Hi");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[6]/div[1]/input")).click();
		

	}

}
