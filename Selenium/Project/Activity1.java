package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
		String BrowserTitle = driver.getTitle();
		System.out.println("Browsertitle"+BrowserTitle);

		String title = "Alchemy Jobs – Job Board Application";
		System.out.println("browser title should match with"+title);

		if (BrowserTitle.contentEquals(title)) {
			driver.close();
		}

	

	}

}
