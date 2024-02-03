package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A22_GetCssValue {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
    public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		String text = d.findElement(By.xpath("//img[@alt='Facebook']")).getCssValue("font-weight");
		Thread.sleep(4000);
		System.out.println(text);
		d.close();
		
	}
}
