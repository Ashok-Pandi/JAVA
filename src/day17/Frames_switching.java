package day17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_switching {

	public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://the-internet.herokuapp.com/iframe");
	Thread.sleep(5000);
	//get how many no of  collection of frames
	List<WebElement> framecollection =driver.findElements(By.tagName("iframe"));
	System.out.println("No of frames are   "+framecollection.size());
	//by default selenium is on main html page for accessing from selenium is to go for frames
	driver.switchTo().frame(0);
	Thread.sleep(3000);
	//capture text in frame
	String frametxt=driver.findElement(By.xpath("//p[normalize-space()='Your content goes here.']")).getText();
	System.out.println(frametxt);
	Thread.sleep(3000);
	
	//write some text in a frame
	driver.findElement(By.id("tinymce")).clear();
	driver.findElement(By.id("tinymce")).sendKeys("Hii");
	Thread.sleep(6000);
driver.close();
	}

}
