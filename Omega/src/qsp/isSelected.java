package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {
	static {
		System.setProperty("driver.chrome.webdriver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		driver.findElement(By.xpath("//section[text()='Check Box']")).click();
		boolean select = driver.findElement(By.id("domain1")).isSelected();
		if(select==true) {
			System.out.println("check box is selected");
		}
		else {
			System.err.println("Checkbox is not selected");
		}
		Thread.sleep(5000);
		driver.close();
	}
}
