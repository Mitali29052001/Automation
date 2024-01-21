//To overcome the drawbacks of thread wait we use synchronization
//In thread we give time to wait because selenium is so fast 
//but suppose if there are 1000 test script then there so many time will get waste because of thread wait
//to overcome that we use selenium
//Synchronization:1)Implicit Wait 2)Explicit Wait 3)Custom Wait
//1)Implicit work until the element will get located.
//Disadvantage of implicit wait is its only work for findelement and findelement's.
//Syntax of Implicit Wait:- driver.manage().timeouts().implicitlywait(Duration.ofSeconds(5));
//driver->Reference Variable,  manage().timeouts().implicitlywait()->methods, Duration->class which is coming from java.time, .->use to call static method, of Seconds(5)(most usable in market), of minutes(), of millis(), of nanos(), of hours(), of days()->static method 
//we have to write implicit wait after maximizing or launching browser because it is applicable for below scripts only.
package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A39_Synchronization_ImplicitWait {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration. ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/mkadam");
		driver.findElement(By.id("username")).sendKeys("mitalikadam42@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("BbXTns9b");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("logoutLink")).click();
		driver.close();
}
}
