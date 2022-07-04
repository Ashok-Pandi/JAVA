package day10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class comparingtitles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\TESTING\\chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		
		String expectedtitle= "gogle";
		String actualtitle = driver.getTitle();
		if(expectedtitle.equalsIgnoreCase(actualtitle))
		{
			System.out.println("Title is matching  "+expectedtitle+"    "+actualtitle);
			
		}
		else
		{
			System.out.println("Title is not matching   "+expectedtitle+"    "+actualtitle);
			
		}
		driver.close();
			

	}

}
