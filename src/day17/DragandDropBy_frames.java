package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropBy_frames {

	public static void main(String[] args) throws Throwable {

WebDriver driver = new ChromeDriver();
driver.navigate().to("https://jqueryui.com/droppable/");
//switch to frame
driver.switchTo().frame(0);
//by defining action class obj we can access muose and keyboard methods
Actions ac = new Actions(driver);
//by storing element into one variable we can easy to access get methods 
WebElement src = driver.findElement(By.id("draggable"));
WebElement dst = driver.findElement(By.id("droppable"));
int x =dst.getLocation().getX();
int y = dst.getLocation().getY();
System.out.println(x+"     "+y);
ac.dragAndDropBy(src, x, y);
Thread.sleep(2000);
driver.close();

	}

}
