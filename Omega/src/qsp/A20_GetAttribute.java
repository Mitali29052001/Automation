package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A20_GetAttribute {
	static {
		System.setProperty("webdriver.driver.chrome", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver d= new ChromeDriver();
	d.manage().window().maximize();
	d.navigate().to("https://www.facebook.com/");
	String value = d.findElement(By.xpath("//img[@alt='Facebook']")).getAttribute("src");
	System.out.println(value);
    Thread.sleep(3000);
    d.close();
	}
}
