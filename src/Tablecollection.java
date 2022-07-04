// Locators Usage in Java 

//TO Print All rows and Columns from a Webpage.




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Tablecollection {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "F:\\TESTING\\Scripts\\Primus_Bank\\chromedriver102.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.w3schools.com/html/html_tables.asp");
	 //  Thread.sleep(3000);
	   //store complete  table into one webelement obj to retrieve collection of rows 
	   // bcz rows are stored in table 
	   WebElement webtable = driver.findElement(By.tagName("table"));
	   //get collection of  rows
	   // all rows are having tagname <tr> so we need use this tagname for locating elements in table 
	   List<WebElement> rows = webtable.findElements(By.tagName("tr"));
	  Thread.sleep(100);
	   //to count no of rows in table
	   System.out.println("No of rows are   "+rows.size());
	   Thread.sleep(1000);
	   //for iterating all rows 
	   for (WebElement eachrow : rows)
	   {
		//get collection of columns from rows 
		 List<WebElement> cols = eachrow.findElements(By.tagName("td"));
		 //iterate eachcell
		 for (WebElement eachcell : cols)
		 {
		String celltext = eachcell.getText();
			 
		System.out.print(celltext+"       |        "+"\t");
		}

		 System.out.println();
	}
	//   System.out.println();
	   Thread.sleep(200);
	   driver.close();


	}

}
