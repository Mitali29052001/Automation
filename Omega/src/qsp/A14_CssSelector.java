//cssSelector is used when there is no tagname or linkText 
//syntax for cssSelector-> tagname[Attribute Name = 'Attribute Value']
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A14_CssSelector {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().refresh();
		driver.findElement(By.cssSelector("span[role='button']")).click();
		//span->Tag Name //role->Attribute Name //button->Attribute Value
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("shoes");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(5000);
		driver.close();
		
	}

}
