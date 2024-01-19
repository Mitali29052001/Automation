//xpath by attributes is used when cssSelector not used 
// Syntax For Xpath by attributes -> //tagName [@Attribute Name ='Attribute Value']
//xpath by attributes and cssselector work same 
//most of time we used xpath because cssSelector not work all time
//demoapps.qspiders.com

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A16_XpathByAttribute {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Moye Moye");
		driver.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@title='Moye Moye - #1 Trending Song - Teya Dora - Džanum (Juzni Vetar - Na Granici)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@title='Full screen (f)']")).click();
		//->//button->tagName //@title->Attribute Name // Full screen (f)-> attribute Value
//		Thread.sleep(3000);
//		driver.close();
	
	}
}
