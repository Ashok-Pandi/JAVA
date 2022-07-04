package day11;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_login_functionality_error_message {

	public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
	Thread.sleep(2000);
	WebElement Username= driver.findElement(By.name("txtUsername"));
	Username.clear();
	Username.sendKeys("Admin23");
	Thread.sleep(2000);
	WebElement Password = driver.findElement(By.name("txtPassword"));
	Password.clear();
	Password.sendKeys("Qedge123!@#");
	Thread.sleep(2000);
			driver.findElement(By.name("Submit")).click();
			String expected= "dashboard";
			String actual= driver.getCurrentUrl();
			if (actual.contains(expected))
			{
				System.out.println("Login success  "+expected+"      "+actual);
				
			}
			else
			{
				// to print Error message
				String errormessage= driver.findElement(By.id("spanMessage")).getText();
				System.out.println("Login Failed    "+errormessage+"         "+expected+"         "+actual);
				Thread.sleep(5000);
				
			}
			driver.close();
			
				

	}

}
