//Authentication Popups:To give security to the application.
//characteristics
//1)We cannot move this popups
//2)we cannot inspect this popups
//3)This popups will be having username and password textfield along with signup and cancel 
//4)This popups is present below the addressbar in the center
//we have to handle this popup in url
//for that the syntax is:
//url->basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/
//Syntax->https://(username):(password)@url
//https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/
package qsp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A45_PopUps4_Authentication {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
		Thread.sleep(2000);
		driver.close();
	}
}
