package Activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.*;

public class Activity1 {
	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver","C://Users//LakshmiMaruboyina//Desktop//FST_selenium//geckodriver.exe");  
		WebDriver driver = new FirefoxDriver();
		
			
	driver.get("https://www.training-support.net");
			
		
		driver.close();
	    }

}
