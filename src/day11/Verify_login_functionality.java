//write a script to verify login functionality of OrangeHRM Webpage


package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.yaml.snakeyaml.tokens.DirectiveToken;

public class Verify_login_functionality {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		Thread.sleep(2000);
		// to clear data already stored in Username textbox and to send value of a property named username
		WebElement username= driver.findElement(By.name("txtUsername"));
	username.clear();
	username.sendKeys("Admin");
	Thread.sleep(2000);
	// to clear data already stored  in password textbox and to send value of a property named password
	WebElement password = driver.findElement(By.name("txtPassword"));
	password.clear();
	password.sendKeys("Qedge123!@#");
	Thread.sleep(2000);
	driver.findElement(By.name("Submit")).submit();
	
	String expected= "dashboard";
	String actual= driver.getCurrentUrl();
	if(actual.contains(expected))
	{
		System.out.println("Login success  "+expected+"      "+actual);
	}
	else
	{
		System.out.println("login Fail "+expected+"         "+actual);
	}
	driver.close();
	}

}
