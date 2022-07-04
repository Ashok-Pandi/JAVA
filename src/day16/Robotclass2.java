package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotclass2 {

	public static void main(String[] args) throws Throwable {
	 WebDriver driver = new ChromeDriver();
	  driver.navigate().to("https://www.flipkart.com/");
	  Actions ac = new Actions(driver);
	  Thread.sleep(5000);
	  ac.sendKeys(Keys.ESCAPE);
	 ac.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Fashion')]"))).perform();
	 Thread.sleep(2000);
	 ac.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='All']"))).click().perform();
	 Thread.sleep(6000);
	 ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Home & Furniture']"))).perform();
	 Thread.sleep(3000);
	 ac.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Curtains']"))).click().perform();
	 Thread.sleep(6000);
	 ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='TVs & Appliances']"))).perform();
	 Thread.sleep(2000);
	 ac.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Nokia']"))).click().build().perform();
	 Thread.sleep(7000);
	  
	  driver.close();

	}

}
