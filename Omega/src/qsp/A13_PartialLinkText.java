package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A13_PartialLinkText {
	static {System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//We take webdriver instead of chromedriver because security purpose because chromedriver is class so class can be changed by anyone but if take interface instead of class it is not possible to changed.
		//It is upcasting because we are going upside from chromedriver to webdriver 
		//if we go downside from webdriver to chromedriver then it is downcasting
		//if we want to remove side driver method then we do typecasting.
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.partialLinkText("Create")).click();
		//we use or take partialLinkText when text is big we take partial text
		Thread.sleep(5000);
		driver.close();
	}

}