package day20;

import java.io.FileInputStream;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fil {

	public static void main(String[] args)  throws Throwable{
		Properties config = new Properties();
		config.load(new FileInputStream("Repository.properties"));
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get(config.getProperty("Url"));
	driver.findElement(By.xpath(config.getProperty("obicreataccount"))).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(config.getProperty("objfname"))).sendKeys(config.getProperty("Enterfname"));
	driver.findElement(By.xpath(config.getProperty("objsname"))).sendKeys(config.getProperty("EnterSname"));
	driver.findElement(By.xpath(config.getProperty("objemail"))).sendKeys(config.getProperty( "EnterEmail"));
	driver.findElement(By.xpath(config.getProperty("objreenteremail"))).sendKeys(config.getProperty( "EnterREemail"));
	driver.findElement(By.xpath(config.getProperty("objpassword"))).sendKeys( config.getProperty("EnterPassword"));
	new Select(driver.findElement(By.xpath(config.getProperty("objbday")))).selectByVisibleText(config.getProperty("EnterBday"));
	//driver.findElement(By.xpath(config.getProperty("objbday"))).sendKeys( "EnterBday");
	new Select(driver.findElement(By.xpath(config.getProperty("objbmonth")))).selectByVisibleText(config.getProperty("EnterBmonth"));
new Select(driver.findElement(By.xpath(config.getProperty("objbyear")))).selectByVisibleText(config.getProperty("EnterByear"));
	driver.findElement(By.xpath(config.getProperty("objgender"))).click();
	driver.findElement(By.xpath(config.getProperty("objsignup"))).click();
	}

}
