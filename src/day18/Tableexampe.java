package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableexampe {

	public static void main(String[] args)throws Throwable {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demo.opencart.com/admin/index.php");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
   driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Orders')])[1]")).click();
    //1. how to find number of rows in table
    int rows=driver.findElements(By.xpath("//*[@id=\"form-order\"]/table/tbody/tr")).size();
    System.out.println("Num of Rows are    "+rows);
     //2. num columns in  a table
   int cols= driver.findElements(By.xpath("//*[@id=\"form-order\"]/table/thead/tr/td")).size();
   System.out.println("Num of columns   "+cols); 
     //3. retrive specific column or row data
 String columnData=  driver.findElement(By.xpath("//*[@id=\"form-order\"]/table/tbody/tr[3]/td[2]")).getText();
 System.out.println("3rd row 2nd column data   "+columnData);
System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"); 
    //4. Retrive all column and rows data

 		for (int r = 1; r < rows; r++) 
 		{
			for(int c=1;c<cols;c++) 
			{
			String TableData=	driver.findElement(By.xpath("//*[@id=\"form-order\"]//tr["+r+"]/td["+c+"]")).getText();
			System.out.print(TableData+"\t"+r+"--------------->");
			
			
		}
			System.out.println( );
			
	}
 		 //5. print customerName, total amount and date added to Durga T
System.out.println("###########################################");
 		String cusna = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr[3]/td[3]")).getText();
 		System.out.println("Customer Name for Durga T  is   "+cusna);
 		String AMOUNT = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr[3]/td[5]")).getText();
 		System.out.println("Total amount to be paid by Durga T is "+AMOUNT);
 		String Date = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr[3]/td[6]")).getText();
 		System.out.println("Date of Order added y Custmer Durga T "+Date);
 	     Thread.sleep(5000);
 	     driver.close();
	}
}
