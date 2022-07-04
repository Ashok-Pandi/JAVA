package day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods1 {

	public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//to maximize the chrome browser
	driver.manage().window().maximize();
	// to delete all cookies in chromebrowser
	driver.manage().deleteAllCookies();
	//to launch url in browser
	driver.get("http://google.com");
	Thread.sleep(6000);
	// to close single window in browser
	driver.close();
	// to close multiple windows in browser
	driver.quit();
	//suspend tool for 6 seconds
	Thread.sleep(6000);
	

	}

}
