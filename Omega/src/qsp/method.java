package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class method {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.flipkart.com/");
		//navigate to facebook using get()
		Thread.sleep(5000);
		driver.close();
	}
	

}
