package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class webpage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Mitali/QSpider/Automation/dummypage.html");
		Thread.sleep(5000);
//		driver.findElement(By.id("youtubelink")).click();
//		//click on youtube link by using id
		driver.findElement(By.name("Youtube")).click();
		//click on youtube link by using name
		
//		driver.get("file:///C:/Mitali/QSpider/Automation/dummypage.html");
//		Thread.sleep(5000);
//		driver.findElement(By.id("instalink")).click();
		//click on instagram link
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		
	}

}
