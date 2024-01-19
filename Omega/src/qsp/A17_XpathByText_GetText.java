//Xpath by text is used when only text is present 

//Syntax for Xpath by text is-> //tagname[text()='text']
                                //tagneme[.='text']
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A17_XpathByText_GetText {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().refresh();
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		// //span->Tag Name //text()-webelement method(text function) //X->text
		driver.findElement(By.name("q")).sendKeys("iphone 15");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//div[text()='APPLE iPhone 15 (Blue, 128 GB)']")).getText();
		System.out.println(text);
		Thread.sleep(5000);
		driver.close();
	
	}
}

