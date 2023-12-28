package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class pagesource {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String title = driver.getPageSource();
		//get title using (title variable)
		System.out.println(title);
		//print the title through (title) reference
		Thread.sleep(5000);
		driver.close();
		//getpagesource()
		//getcurrenturl()
	}
}
