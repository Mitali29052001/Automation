//Mouse Action
//5)Scroll
//There is action which is coming from selenium Interaction class
//to handle the dropdown or mouse hover then action class come in picture
//syntax
//Initially we use Webdriver driver = new Chromedriver();
//but in scroll we cannot get all scroll in webdriver 
//so we use typecasting because it goes to right side.
//How we do scrolling manually
//in console we type window.scrollBy(x-axis,y-axis)
//because all the webpage is made up of picxel so that if we do window.scrollBy(0,2000) so it is scroll 2000 pixel from y-axis.
//How to do using Automation
//Syntax:
//JavaScriptExecution j = (javaScriptExecution)driver;
//j.executeScript("window.scrollby(0,2000)")
//j.executeScript->webdriver method

package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A53_Mouse_Actions_Scroll {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver =  new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://www.bbc.com/news");
//		JavascriptExecutor j=(JavascriptExecutor) driver;
//		j.executeScript("window.scrollBy(0,2000)");
//		Thread.sleep(2000);
//		driver.close();
		
		
		//If we want to scroll to the perticular element
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.bbc.com/");
		JavascriptExecutor j=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		int yaxis = driver.findElement(By.xpath("//div[@class='reel--reellogo-container']")).getLocation().getY();
		j.executeScript("window.scrollBy(0,"+yaxis+")");
		Thread.sleep(2000);
		driver.close();
	}
}
