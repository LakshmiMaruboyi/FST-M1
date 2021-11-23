package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity6 {
	WebDriver driver;
    WebDriverWait wait;
 
    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);
        
        //Open browser
        driver.get("https://www.training-support.net/selenium/login-form");
    }
    
    @Test
    @Parameters({"username", "password"})
    public void loginTestCase(String username, String password) {
        //Find username and pasword fields
       // WebElement usernameField = driver.findElement(By.id("username"));
        //WebElement passwordField = driver.findElement(By.id("password"));
    	driver.findElement(By.id("username")).sendKeys(username);
    	driver.findElement(By.id("password")).sendKeys(password);
        //Enter values
       // usernameField.sendKeys("username");
        //passwordField.sendKeys("password");
        System.out.println("dfdf");
        //Click Log in
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        System.out.println("dfdf");
        
        //Assert Message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("dfdf"+loginMessage);
        Assert.assertEquals(loginMessage, "Welcome Back, admin");
        System.out.println("dfdf");
    }
 
    @AfterClass
    public void afterClass() {
       
      //  driver.close();
    }
}
