package day19;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
	driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
 int rows= driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
System.out.println("Number of Rows are   "+rows);
int cols =driver.findElements(By.xpath("//table[@id='resultTable']/thead/tr/th")).size();
System.out.println("Number of  columns are   "+cols);
for (int i = 1; i <rows; i++)//1
{
for (int j = 1; j < cols; j++)//1 2
{
String tabledata = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td["+j+"]")).getText();
System.out.print(tabledata+"\t"+i+"     ");

}	
System.out.println();
}
System.out.println("------------------------------------------------------------------------------");
	driver.close();
	}
	
	}
//the 
