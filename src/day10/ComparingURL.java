package day10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComparingURL {

	public static void main(String[] args) throws Throwable {
WebDriver driver= new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("http://paytm.com");
 String expectedurl = "https://";
 String actualurl= driver.getCurrentUrl();
 	if (actualurl.startsWith(expectedurl))
 	{
 		System.out.println("URL is secured   "+expectedurl+"   "+actualurl);
 		
 	}
 	else
 	{
 		System.out.println("URL is not secured"+expectedurl+"   "+actualurl);
Thread.sleep(4000);
 	}
 	
 	driver.close();	
	}

}
