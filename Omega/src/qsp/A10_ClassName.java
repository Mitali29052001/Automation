package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A10_ClassName {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Mitali/QSpider/Automation/dummypage.html");
		driver.findElement(By.className("link1")).click();
		Thread.sleep(5000);
		driver.close();
	}

}

