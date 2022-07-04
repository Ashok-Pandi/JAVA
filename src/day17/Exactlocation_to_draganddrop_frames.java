package day17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exactlocation_to_draganddrop_frames {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		List<WebElement> framescolle=driver.findElements(By.tagName("iframe"));
		System.out.println("No of frames"+framescolle.size());
		Actions ac = new Actions(driver);
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		WebElement src =driver.findElement(By.id("draggable"));
		Thread.sleep(2000);
		WebElement dst = driver.findElement(By.id("droppable"));
		Thread.sleep(1000);
		ac.clickAndHold(src).moveToElement(dst).release().perform();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Checkboxradio")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
