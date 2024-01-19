package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A07_Navigate1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Hp Laptops");
		// enter product name as hp laptop
		driver.findElement(By.id("nav-search-submit-button")).click();
		//click on search item
		Thread.sleep(5000);
		driver.close();
	}

}
