//getWrappedElement():- use to wrapped all element which are present in options.
package qsp;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A37_GetWrappedElement {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		driver.findElement(By.linkText("Multi Select")).click();
		WebElement country = driver.findElement(By.id("select-multiple-native"));
		Select s = new Select(country);
	    String options = s.getWrappedElement().getText();
	    System.err.println(options);
		Thread.sleep(2000);
		driver.close();
		
	}
	
}

