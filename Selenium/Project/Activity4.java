package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
		WebElement element2=driver.findElement(By.xpath("//*[@id=\"post-16\"]/div/h2"));
		String getheading2=element2.getText();
		System.out.println(getheading2);
		String Heading2="Quia quis non";
		System.out.println(Heading2);
		if(getheading2.contentEquals(Heading2)) {
			driver.close();
			
		}

	}

}
