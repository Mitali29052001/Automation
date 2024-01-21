
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A38_CRM_AntiTime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/mkadam");
		driver.findElement(By.id("username")).sendKeys("mitalikadam42@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("BbXTns9b");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("logoutLink")).click();
		driver.close();
	}
}
