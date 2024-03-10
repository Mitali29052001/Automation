package pom_Page_Object_Model;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pom_Page_Object_Model.A00_POM_Page_Object_Model;

public class A01_POM_Stale {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		A00_POM_Page_Object_Model p = new A00_POM_Page_Object_Model(driver);
		p.getotherlink().click();
		Thread.sleep(2000);
		p.getstalelink().click();
		Thread.sleep(2000);
		p.getclicktextbox().click();
		Thread.sleep(2000);
		WebElement element = p.getentertexthere();
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		element.sendKeys("hi");
		Thread.sleep(2000);
		driver.close();
	}

}