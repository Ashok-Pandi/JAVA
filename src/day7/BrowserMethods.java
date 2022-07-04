package day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
		System.setProperty("webdirver.geeko.driver", "F:\\geeckodriver.exe");
		WebDriver dr= new FirefoxDriver();

	}

}
