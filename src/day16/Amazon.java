package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Amazon {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions ac = new Actions(driver);
		Thread.sleep(3000);
		ac.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]"))).click().build().perform();
		Thread.sleep(3000);
		ac.moveToElement(driver.findElement(By.linkText("Today's Deals"))).click().perform();
		Thread.sleep(3000);
	//ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Clothing']")).click().perform();
		driver.close();

	}

}
