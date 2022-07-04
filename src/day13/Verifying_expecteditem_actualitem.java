package day13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verifying_expecteditem_actualitem {

	public static void main(String[] args) throws Throwable {
		 String expecteditem = "baby";
		 boolean itemexist = false;
		WebDriver driver = new ChromeDriver();
		driver.get("http://amazon.in");
		Thread.sleep(2000);
 Select listbox = new Select(driver.findElement(By.id("searchDropdownBox")));
	 List<WebElement> collection = listbox.getOptions();

	 for (WebElement each : collection)
	 {
	String actualitem = each.getText();
	System.out.println(actualitem);
	if (expecteditem.equalsIgnoreCase(actualitem))
	{
	itemexist = true;
	break;
	}
	}
	 if(itemexist)
			
		{
			System.out.println("Item is existed  "+expecteditem);
		}
		else
		{
			System.out.println("Item is not existed   "+expecteditem);
			
		}
	 Thread.sleep(5000);
	 driver.close();
	 

	}

}
