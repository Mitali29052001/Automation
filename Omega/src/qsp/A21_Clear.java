package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A21_Clear {
	static {
		System.setProperty("webdriver.driver.chrome", "./driver/chromedriver.exe");
}
     public static void main(String[] args) throws InterruptedException {
	WebDriver d= new ChromeDriver();
	d.manage().window().maximize();
	d.navigate().to("https://www.facebook.com/");
	 Thread.sleep(3000);
	d.findElement(By.id("email")).sendKeys("JOJO");
	Thread.sleep(5000);
	d.findElement(By.id("email")).clear();
    Thread.sleep(3000);
    d.close();
      
    	 	 

 
}
}