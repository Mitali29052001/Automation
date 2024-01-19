package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A29_Submit {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.xpath("//a[text()='Submit Click']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("satisfaction")).click();
		driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).submit();
		Thread.sleep(5000);
		driver.close();
	}
}
