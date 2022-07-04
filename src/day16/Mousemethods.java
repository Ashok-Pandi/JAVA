package day16;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousemethods {

	public static void main(String[] args) throws Throwable {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.com/");
    Actions ac= new Actions(driver);
    Thread.sleep(3000);
   // ac.moveToElement(driver.findElement(By.linkText("Gmail"))).click().build().perform();
    ac.contextClick(driver.findElement(By.linkText("Gmail"))).build().perform();
    Robot rb = new Robot();
    rb.keyPress(KeyEvent.VK_DOWN);
    rb.keyRelease(KeyEvent.VK_DOWN);
    Thread.sleep(3000);
    rb.keyPress(KeyEvent.VK_DOWN);
    rb.keyRelease(KeyEvent.VK_DOWN);
    Thread.sleep(3000);
    rb.keyPress(KeyEvent.VK_ENTER);
    Thread.sleep(3000);
    ArrayList<String> arrayobj = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(arrayobj.get(1));
    Thread.sleep(2000);
    driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
    Thread.sleep(4000);
    driver.switchTo().window(arrayobj.get(0));
    driver.findElement(By.xpath("//a[normalize-space()='Images']")).click();
    Thread.sleep(5000);
    driver.quit();

	}

}
