package day11;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Navigation_commands {
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		System.out.println("Pagetitle[1]  "+driver.getTitle());
		Thread.sleep(4000);
	driver.findElement(By.linkText("Gmail")).click();
	System.out.println("Pagetitle[2]"+driver.getTitle());
	Thread.sleep(2000);
driver.navigate().back();
System.out.println("PageTitle[3]  "+driver.getTitle());
Thread.sleep(2000);
driver.navigate().forward();
System.out.println("PageTitle[4]  "+driver.getTitle());
Thread.sleep(2000);
driver.navigate().refresh();
System.out.println("pageTitle[5]   "+driver.getTitle());
Thread.sleep(2000);
driver.close();
	}
}
