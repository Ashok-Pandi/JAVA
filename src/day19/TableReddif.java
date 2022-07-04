package day19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableReddif {

	public static void main(String[] args) throws Throwable {

String expected ="Canada ";
		WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.w3schools.com/html/html_tables.asp");
Thread.sleep(2000);
WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
List<WebElement> rows = table.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
rows.size();
for (int i = 1; i < rows.size(); i++)//1
{
	List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
	for (int j = 0; j < cols.size(); j++)//0 1 
	{
		String celltext = cols.get(j).getText();
		System.out.print(celltext+"\t");
		//System.out.println( );
	if (celltext.equalsIgnoreCase(expected)) 
		{
			System.out.println(" Expected is present in the TABLE  "+expected);
		}
	else
	{
		System.out.println(" Not found expected");
	}
	}
	System.out.println();
}
driver.close();
	}

}
