//Hidden Divizion/Calender popup's
//Characteristics
//It is not movable
//It is inceptable. 
//If it is inceptable then we can locate this by using findelemnt method.
package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A43_PopUps2_HiddenDivizion_OR_Calender {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s =new Select(month);
		s.selectByValue("2");
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s1 =new Select(year);
		s1.selectByValue("2001");
		driver.findElement(By.linkText("29")).click();	
		Thread.sleep(3000);
		driver.findElement(By.id("alternative_number")).sendKeys("9834549528");
		driver.close();
	}
}
