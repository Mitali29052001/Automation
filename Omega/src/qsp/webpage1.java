package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class webpage1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("file:///C:/Mitali/QSpider/Automation/dummypage.html");
	//there are two method using this we goes to webpage 1)driver.get() 2) driver.navigate()
	//we use driver.navigate() using this we can also do back, forward, refresh
	Thread.sleep(5000);
	driver.findElement(By.id("youtubelink")).click();
	Thread.sleep(5000);
	driver.navigate().back();
	//navigate to back
	Thread.sleep(5000);
	driver.findElement(By.id("instalink")).click();
	Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(5000);
	driver.navigate().forward();
	//navigate to forward
	Thread.sleep(5000);
	driver.navigate().refresh();
	//use to refresh
	Thread.sleep(5000);
	driver.close();
	
}
}
