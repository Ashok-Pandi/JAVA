package day10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcommands {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://ibomma.com");
		Thread.sleep(5000);
		
		String pagetitle= driver.getTitle();
		System.out.println(pagetitle);
		System.out.println("number characters in title is  "+pagetitle.length());
		
		String strurl= driver.getCurrentUrl();
		System.out.println(strurl);
		System.out.println("no. of characters in URL is   "+strurl.length());
		driver.quit();

	}

}
