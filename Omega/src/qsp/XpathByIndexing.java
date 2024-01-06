//syntax: (//tagname[@A.N='A.V'])[Index No]
      //    (//h3[@class='product-brand'])[13])
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndexing {
	static {
		System.setProperty("webdriver.driver.chrome", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.navigate().to("https://www.amazon.in/");
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone15");
//		driver.findElement(By.id("nav-search-submit-button")).click();
//		Thread.sleep(3000);
//		String text = driver.findElement(By.xpath("//span[text()='iPhone 15 (128 GB) - Blue']")).getText();
//		System.out.println(text);
//		Thread.sleep(5000);
//		driver.close();
		
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 15");
		d.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
	    String t = d.findElement(By.xpath("(//span[text()='iPhone 15 (128 GB) - Blue'])[1]")).getText();
	    System.out.println(t);
	    Thread.sleep(3000);
	    d.close();
	}
}
