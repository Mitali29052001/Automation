package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyindep {
	static {
		System.setProperty("webdriver.driver.chrome", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver d= new ChromeDriver();
	d.manage().window().maximize();
	d.navigate().to("https://www.amazon.in/");
	d.navigate().refresh();
	d.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 15");
	d.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(3000);
    String t = d.findElement(By.xpath("(//span[text()='iPhone 15 (128 GB) - Blue'])[1]/../../../../../../../../div[1]/div[2]/div/div/div[3]/div/div/div/div[2]/div/a/span/span[2]")).getText();
    System.out.println(t);
    Thread.sleep(3000);
    d.close();
//		WebDriver d=new ChromeDriver();
//		d.manage().window().maximize();
//		d.get("https://www.amazon.in/");
//		d.navigate().refresh();
//		d.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 15");
//		d.findElement(By.id("nav-search-submit-button")).click();
//		Thread.sleep(3000);
//		String text = d.findElement(By.xpath("(//span[text()='Apple iPhone 15 (128 GB) - Blue'])[1]/../../../../../../../div[2]/div/div/div[3]/div[1]/div/div[1]/div[2]/div[1]/a/span/span[2]")).getText();
//		System.out.println(text);
//		Thread.sleep(3000);
//		d.close();
//		
}
}
