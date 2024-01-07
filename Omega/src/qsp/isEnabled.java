package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			boolean logo = driver.findElement(By.name("login")).isEnabled();
			if (logo==true){
				System.out.println("Login button is Enable");
			}
			else {
				System.out.println("Login button is not Enable");
			}
			Thread.sleep(5000);
			driver.close();
		}
	}
}
