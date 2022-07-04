// to login primus bank Admin user
package day8;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
public class primusBanklogin {

	public static void main(String[] args) throws Throwable {
	//System.setProperty("webdriver.chrome.driver", "F:\\geeckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	//to maximize the chrome
	driver.manage().window().maximize();
	//to delete all cookies in a browser 
	driver.manage().deleteAllCookies();
	// to launch primus bank 
	driver.get("http://primusbank.qedgetech.com/");
	//  to give username for Admin login
driver.findElement(By.name("txtuId")).sendKeys("Admin");
// to give password for admin login
driver.findElement(By.name("txtPword")).sendKeys("Admin");
// To click on login button
driver.findElement(By.name("login")).click();
// To open branches module
driver.findElement(By.xpath("//a[@href='admin_banker_master.aspx']//img")).click();
// to suspect for 10sec
Thread.sleep(10000);
//to quit the chrome
driver.quit();
}
}
