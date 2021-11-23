package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
		WebElement element=driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/header/h1"));
		String getheading=element.getText();
		System.out.println(getheading);
		String heading="Welcome to Alchemy Jobs";
		System.out.println(heading);
		if(getheading.contentEquals(heading)) {
			driver.close();
		}


	}

}
