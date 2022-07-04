package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablesconcept {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(3000);
		String textcell1 = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td[1]")).getText();
		String textcell2 = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td[2]")).getText();
		String textcell3= driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td[3]")).getText();
		Thread.sleep(1000);
		System.out.println(textcell1+"   "+textcell2+"   "+textcell3);
		Thread.sleep(4000);
		String row2nddata = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[2]")).getText();
		Thread.sleep(1000);
		System.out.println(row2nddata);
		Thread.sleep(2000);
		driver.close();
	}

}
