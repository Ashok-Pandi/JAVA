package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableconcept_oangehrm {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		WebElement webtable=driver.findElement(By.tagName("table"));
		List<WebElement> rows = webtable.findElements(By.tagName("tr"));
		System.out.println("No of rows are   "+rows.size());
		Thread.sleep(2000);
		for (WebElement eachrowpostion : rows) 
		{
			List<WebElement> cols = eachrowpostion.findElements(By.tagName("td"));
			
			for (WebElement eachcellposition : cols)
			{
			String celltext = eachcellposition.getText();
			System.out.print(celltext+"\n");
		
		//System.out.println("################################################");
			
			}
			System.out.println();
			
		}
		Thread.sleep(4000);
		//System.out.println();
		
		driver.close();

	}

}
