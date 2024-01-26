//Explicit wait:-
//we use explicit wait to overcome the drawbacks of implicit wait which is only work for findelement and findelements.
//In explicit wait we have to write explicit wait above of every script if we want to give wait time for respective script.
//because explicit wait is only work for only one script where in implicit we write implicit wait for all the script once after launching or maximizing browser.
//syntax:1) webdriverwait wait = new webdriverwait(driver, Duration ofSeconds());
//webdriver->object, wait->Reference Variable, new->keyword, webdriverwait()->constructor
//webdriverwait() constructor contain driver(reference variable) from open browser statement, Duration ofSeconds()->java class coming from java.time package
//2)wait.until(ExpectedConditions.titleContains()) OR wait.until(ExpectedConditions.titleis())
//wait-> Reference Variable, until()->Non-Static Method, ExpectedConditions->class, titleContains() OR titleis()->Methods
//We create webdriverwait (object) to call non static method for that we use wait as (reference variable) using that wait(reference variable) we call until(non static method) with the help of (.).
//until(non static method) contains Expected conditions, titleContains OR titleIs.
//In titleContain() we have to write partial text of title and In titleis() we have to write full text of title.
package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A40_Synchronization_ExplicitWait {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration. ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/mkadam");
		driver.findElement(By.id("username")).sendKeys("mitalikadam42@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("BbXTns9b");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.titleContains("Enter"));
		driver.findElement(By.id("logoutLink")).click();
		driver.close();
}
}
