package day12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlinksinfacebook {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		List<WebElement> collection = driver.findElements(By.tagName("a"));
		System.out.println("no of Hyperlinks   "+collection.size());
		for (WebElement each : collection)
		{
		String str1 = each.getText();
		System.out.println(str1);
		Thread.sleep(2000);
		driver.close();	
		}

	}

}
