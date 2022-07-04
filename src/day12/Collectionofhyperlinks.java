//Write a script to print collection of hyperlinks in a webpage and print name of each and every link which are visible in primusBank webpage
package day12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collectionofhyperlinks {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.primusbank.qedgetech.com/");
		Thread.sleep(5000);
		// to print collection/number of hyper links in primusbank webpage 
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No of links are  "+links.size());
		// to print each and every  link names
		for (WebElement each : links)
		{
		String nameofHyperlink = each.getText();
		System.out.println("Name of Hyperlink   "+nameofHyperlink);
		Thread.sleep(2000);
		driver.close();
		}
		
		
	}

}
