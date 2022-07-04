package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousemethod1_Movetoelement {

	public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.flipkart.com/");
	Thread.sleep(2000);
	Actions ac = new Actions(driver);
	//click Escape key in keyboard
	ac.sendKeys(Keys.ESCAPE);
	Thread.sleep(1000);
	ac.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Fashion')]"))).perform();
	Thread.sleep(3000);
	ac.moveToElement(driver.findElement(By.xpath("(//a[normalize-space()='All'])[1]"))).click().perform();
	Thread.sleep(7000);
	ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Electronics']"))).perform();
	Thread.sleep(5000);
	ac.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Apple']"))).click().perform();
	Thread.sleep(5000);
	ac.moveToElement(driver.findElement(By.xpath("(//span[normalize-space()='Baby & Kids'])[1]"))).perform();
	Thread.sleep(3000);
	ac.moveToElement(driver.findElement(By.xpath("(//a[normalize-space()='Puzzles'])[1]"))).click().perform();
	Thread.sleep(6000);
	driver.close();
	}

}
