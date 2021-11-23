package Activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		 
        //Open browser
        driver.get("https://training-support.net/selenium/selects");
 
        //Chosen option
        WebElement chosen = driver.findElement(By.id("single-value"));
 
        //Find dropdown
        Select dropdown = new Select(driver.findElement(By.id("single-select")));
 
        //Select second option by visible text
        dropdown.selectByVisibleText("Option 2");
        System.out.println(chosen.getText());
 
        //Select third option by index
        dropdown.selectByIndex(3);
        System.out.println(chosen.getText());
 dropdown.selectByValue("4");
        System.out.println(chosen.getText());
        List<WebElement> options = dropdown.getOptions();
        for(WebElement option : options) {
            System.out.println("Option: " + option.getText());
        }
 
        driver.close();

	}

}
