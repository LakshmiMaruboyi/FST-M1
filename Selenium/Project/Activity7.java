package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
		WebElement postjob = driver.findElement(By.xpath("//*[@id=\"menu-item-26\"]/a"));
		postjob.click();
		driver.findElement(By.id("create_account_email")).sendKeys("Lakshmi14@gmail.com");
		String jobposting="testing";
		driver.findElement(By.id("job_title")).sendKeys("jobposting");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("job_description_ifr")).sendKeys("example");
		driver.findElement(By.id("application")).sendKeys("http://jobs");
		driver.findElement(By.id("company_name")).sendKeys("ibm");
		driver.findElement(By.name("submit_job")).click();
		driver.findElement(By.id("job_preview_submit_button")).click();
		WebElement jobtest = driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[1]"));
		jobtest.click();
		WebElement click = driver.findElement(By.id("search_keywords"));
		click.sendKeys("testing");
		click.sendKeys(Keys.ENTER);
		WebElement testing= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/main/article/div/div/ul/li[1]/a/div[1]/h3"));
		System.out.println(testing.getText());
		String testing1=testing.getText();
		if(testing1.equals(jobposting)) {
			System.out.println("job postedand successfully ");
		driver.close();
		}

	}

}
