//Mouse Action
//3)Double click
//There is action which is coming from selenium Interaction class
//to handle the dropdown or mouse hover then action class come in picture
//syntax
//locate element
//to perform action we have to call non static method called doubleclick() for that we create one object
//this non static click() method is used to move the cursor for that we need to perform() method.
//webelement element = driver.findelemet(By.id(""));
//Action a=new Action(driver);
//a.doubleclick(element).perform();
package qsp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A51_Mouse_Actions_DoubleClick {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement element = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
		Alert a1 = driver.switchTo().alert();
		Thread.sleep(3000);
		a1.accept();
		driver.close();
	}
}
