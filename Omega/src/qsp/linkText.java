package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(10000);
		driver.findElement(By.name("firstname")).sendKeys("Mitali");
		driver.findElement(By.name("lastname")).sendKeys("Kadam");
		driver.findElement(By.name("reg_email__")).sendKeys("9834549528");
		Thread.sleep(5000);
		driver.close();
	}
	
	

}
