//Mouse Action
//2)Right click
//There is action which is coming from selenium Interaction class
//to handle the dropdown or mouse hover then action class come in picture
//syntax
//locate element
//to perform action we have to call non static method called contextclick() for that we create one object
//this non static contextclick() method is used to move the cursor for that we need to perform() method.
//webelement element = driver.findelemet(By.id(""));
//Action a=new Action(driver);
//a.contextclick(element).perform();
package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A50_Mouse_Actions_RightClick {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver =  new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	WebElement element = driver.findElement(By.linkText("Forgotten password?"));
	Actions a = new Actions(driver);
	a.contextClick(element).perform();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_T);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_W);
	driver.quit();
}
}
