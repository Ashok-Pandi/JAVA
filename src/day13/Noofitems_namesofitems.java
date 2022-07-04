package day13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Noofitems_namesofitems {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Create New Accou")).click();
		Thread.sleep(5000);
		Select listofitems = new Select(driver.findElement(By.name("birthday_day")));
		List<WebElement> daylistitems = listofitems.getOptions();
		System.out.println("No of items in day listbox    "+daylistitems.size());
		
for (WebElement each : daylistitems)
{
	String eachitemname= each.getText();
	System.out.println(eachitemname);
}
		
	
		driver.close();
		}
		
	
		

	}

