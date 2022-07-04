//write a script to select items in Listbox of facebook web  application by using Select class methods 


package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Selectclassmethods {
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.findElement(By.partialLinkText("Create New Accou")).click();
		Thread.sleep(2000);
		 // to select items in list box , we should  use Select class syntax 
		Select DayListBox =new Select(driver.findElement(By.id("day")));
		DayListBox.selectByVisibleText("22");
		Thread.sleep(2000);
		Select MonthListBox = new Select(driver.findElement(By.id("month")));
		MonthListBox.selectByVisibleText("May");
		Thread.sleep(2000);
		Select YearListBox =  new Select(driver.findElement(By.id("year")));
		YearListBox.selectByIndex(12);
		System.out.println(YearListBox.getFirstSelectedOption().getText());
		//Thread.sleep(2000);
		//verify day list box is single or multi selection
		boolean value = DayListBox.isMultiple();
		System.out.println(value);
		//verify month list box is single or multi selection
		boolean monthvalue = MonthListBox.isMultiple();
		System.out.println(monthvalue);
		//verify year list box is single or multi selection
		boolean yearvalue = YearListBox.isMultiple();
		System.out.println(yearvalue);
		// i want to print what type if textbox is
		/*if (value==true) 
		{
			System.out.println(value+"    "+"Type of textbox is multi selection");
		}
		else
		{
			System.out.println(value+"    "+"Type of textbox is single selection");
		}
		System.out.println(value);
		Thread.sleep(3000);*/

		driver.quit();

	}

}
