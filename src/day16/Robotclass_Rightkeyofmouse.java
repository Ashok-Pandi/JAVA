package day16;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotclass_Rightkeyofmouse {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		Actions ac = new Actions(driver);
		// Right click on gmail link
		ac.moveToElement(driver.findElement(By.linkText("Gmail"))).contextClick().perform();
		// here we need to do action on widow related application so we need to create a class for window app is Robot
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(7000);
		// to access all windows that means both child and parrent 
		ArrayList<String> brw = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(brw.get(0));
		Thread.sleep(6000);
		driver.quit();

	}

}
