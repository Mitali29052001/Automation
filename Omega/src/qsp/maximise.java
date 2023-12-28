package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class maximise {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//chaining //maximize window
		Thread.sleep(5000);
		driver.get("https://www.flipkart.com/");
		//navigate to facebook using get()
		Thread.sleep(5000);
		driver.close();
	}
	

}