package day13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class monthlistitems {

	public static void main(String[] args) throws Throwable {
WebDriver driver= new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.partialLinkText("Create New Accou")).click();
Thread.sleep(2000);
Select monthlistbox = new Select(driver.findElement(By.name("birthday_month")));
List<WebElement> monthcollection = monthlistbox.getOptions();
System.out.println("No of items in monthlistbox    "+monthcollection.size());
for (WebElement each : monthcollection)
{
String itemname = each.getText();
System.out.println(itemname);
}
Thread.sleep(5000);
driver.close();

	}

}
