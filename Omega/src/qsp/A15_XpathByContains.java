//xpath by Contains is used when large text are there
//syntax for xpath by contains-> //tagname[contains(text(), 'partial text')]
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A15_XpathByContains {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Hp Laptop");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		String title = driver.findElement(By.xpath("//span[contains(text(), 'Lenovo ThinkPad E14 AMD Ryzen 3 7330U 14\" (35.56 cm)')]")).getText();
		// //span->Tag Name contains->xpath method //text()-x-path method(text function) //Lenovo ThinkPad E14 AMD Ryzen 3 7330U 14\" (35.56 cm)->partial text
		System.out.println(title);
		Thread.sleep(5000);
		driver.close();
	
	}
}
