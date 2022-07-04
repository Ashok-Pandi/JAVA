package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop_frames {

	public static void main(String[] args) throws Throwable {

WebDriver driver = new ChromeDriver();
driver.navigate().to("https://jqueryui.com/droppable/");
//switch to frame
driver.switchTo().frame(0);
Actions ac = new Actions(driver);
WebElement src = driver.findElement(By.id("draggable"));
WebElement dst=driver.findElement(By.id("droppable"));
Thread.sleep(2000);
ac.dragAndDrop(src, dst).build().perform();
Thread.sleep(5000);
driver.close();

	}

}
