//Mouse Action
//1)Mouse Hover
//2)Right click
//3)Double Click
//4)Drag and Drop
//5)Scroll
//There is action which is coming from selenium Interaction class
//to handle the dropdown or mouse hover then action class come in picture
//syntax
//locate element
//to perform action we have to call non static method called moveToElement() for that we create one object
//this non static moveToElement() method is used to move the cursor for that we need to perform() method.
//webelement element = driver.findelemet(By.id(""));
//Action a=new Action(driver);
//a.moveToElement(element).perform();

package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A49_Mouse_Actions_MouseHover {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.vtiger.com/");
		WebElement element = driver.findElement(By.partialLinkText("Resources"));
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
		driver.findElement(By.partialLinkText("Contact Us")).click();
	    String mobile = driver.findElement(By.xpath("//p[contains(text(),'+91 9243602352')]")).getText();
	    System.out.println(mobile);
	    Thread.sleep(3000);
	    driver.close();
		
		
	}
}
