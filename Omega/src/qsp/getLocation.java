package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocation {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://demoapps.qspiders.com/?scenario=1");
		d.manage().window().maximize();
		d.findElement(By.xpath("//section[text()='Image']")).click();
		Thread.sleep(5000);
		int text = d.findElement(By.xpath("//img[@title='Image tooltip']")).getLocation().getX();
		int text1 = d.findElement(By.xpath("//img[@title='Image tooltip']")).getLocation().getY();
		System.out.println(text);
		System.out.println(text1);
		Thread.sleep(4000);
		d.close();
		}
}
