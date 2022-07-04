// Write a script to print no of items and name of each an every item in List box of amazon web applcation


package day13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_numofitems_and_Nameofeachitem_by_boolean_type {
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(" https://www.amazon.in/");
		Thread.sleep(2000);

		Select listofitems = new Select(driver.findElement(By.id("searchDropdownBox")));
		// get collection of items in list box
		List<WebElement>  olist = listofitems.getOptions();
		System.out.println("NO. of items in listbox    "+olist.size());

		// print each and every name of items
		for (WebElement each : olist)
		{
			String eachitemname = each.getText();
			//Click each and every item before printing 
			each.click();
			Thread.sleep(2000);
			System.out.println(eachitemname);	
		}

driver.quit();
 
	}

}
