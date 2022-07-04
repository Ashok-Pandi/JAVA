package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlin_alerts {

	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver", "chromedriver102.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[2]/td[1]/a[1]/img[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[2]/td[8]/a[1]/img[1]")).click();
		Thread.sleep(2000);
		String alertmessage = driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[2]/td[8]/a[1]/img[1]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		String alertmessage1 = driver.switchTo().alert().getText();
		System.out.println(alertmessage1);
		driver.switchTo().alert().accept();
		driver.quit();


	}

}
