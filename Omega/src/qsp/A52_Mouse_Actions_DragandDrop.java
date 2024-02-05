//Mouse Action
//4)Drag and Drop
//There is action which is coming from selenium Interaction class
//to handle the dropdown or mouse hover then action class come in picture
//syntax
//locate element
//to perform action we have to call non static method called DragAndDrop() for that we create one object
//this non static click() method is used to move the cursor for that we need to perform() method.
//webelement dest = driver.findelemet(By.id(""));
//webelement src = driver.findelemet(By.id(""));
//Action a=new Action(driver);
//a.DragAndDrop(src,dest).perform();
//src to destination(dest)
//we drag from src to destination(dest)
package qsp;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A52_Mouse_Actions_DragandDrop {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		driver.findElement(By.linkText("Drag Position")).click();
		WebElement src = driver.findElement(By.xpath("//div[.='Mobile Charger']"));
		WebElement dest = driver.findElement(By.xpath("//div[@class='drop-column  min-h-[200px] bg-slate-100']"));
		Actions a = new Actions(driver);
		Thread.sleep(3000);
		a.dragAndDrop(src, dest).perform();
		Thread.sleep(3000);
		driver.close();
	}
}
