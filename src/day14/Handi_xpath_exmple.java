package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handi_xpath_exmple {

	public static void main(String[] args)throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[normalize-space()='Create New Account'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ashok");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("pandi");
		driver.findElement(By.xpath("")).sendKeys("ashok.pmm12@gmail.com");
		driver.close();
		
	}
}
