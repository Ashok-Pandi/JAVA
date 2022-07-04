package day13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Yearlistitems {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.get("http://faceboook.com");
		driver.findElement(By.partialLinkText("Create New Accou")).click();
		Thread.sleep(3000);
		Select yearlistbox = new Select(driver.findElement(By.id("year")));

		List<WebElement> yearcollection = yearlistbox.getOptions();
		System.out.println("no of items in year listbox   "+yearcollection.size());
		for (WebElement each : yearcollection)
		{
			String namesinyearlistbox = each.getText();
			Thread.sleep(1000);
			System.out.println(namesinyearlistbox);
			Thread.sleep(2000);

			each.click();		}
		Thread.sleep(5000);
		driver.close();


	}

}
