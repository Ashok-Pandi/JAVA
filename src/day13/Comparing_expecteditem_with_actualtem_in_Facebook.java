package day13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Comparing_expecteditem_with_actualtem_in_Facebook {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.partialLinkText("Create New Accou")).click();
		Thread.sleep(2000);
		Select monthlistbox = new Select(driver.findElement(By.id("month")));
		List<WebElement> collectionofmonth= monthlistbox.getOptions();
		String expecteditem = "ashok";
		boolean itemexist = false;
		for (WebElement each : collectionofmonth)
		{
		String actualitem = each.getText();
		each.click();
		System.out.println(actualitem);
		if(expecteditem.equalsIgnoreCase(actualitem))
		{
			itemexist = true;
			break;
			
		}
		
		}
		if (itemexist)
{
System.out.println("Item is existed  "+expecteditem);			
		}
		else
		{
			System.out.println("Item is not existed  "+expecteditem);
			Thread.sleep(3000);
			driver.close();
		}
	}
	

}
