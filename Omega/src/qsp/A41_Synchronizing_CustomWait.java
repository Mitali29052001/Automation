//Custom Wait:
//In order to synchronise the automation script by using custom wait we have to write our java code.
//syntax:- 
//int i = 0;
//while(i<500){
//try{   //we will write the risky programe in try block
//driver.findElement(By.id('LogoutLink')).click();
//break;
//}
//catch(Expection e) {
//	i++;
//}
//}
// It will work like if i=0 then it will go in while condition and check for it is true or not if it is true then try block will get executed or if it is false then catch block will get executed and it is increase by 1 beacause of i++ statement then it will continue same as this till 500 time because of while condition which is (i<500).
package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A41_Synchronizing_CustomWait {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration. ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/mkadam");
		driver.findElement(By.id("username")).sendKeys("mitalikadam42@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("BbXTns9b");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.titleContains("Enter"));
		
		int i=0;
		while(i<500){
			try {
				driver.findElement(By.id("logoutLink")).click();
				break;
			} catch (Exception e) {
				i++;
			}
		}
		driver.close();
}
}
