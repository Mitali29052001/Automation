package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class A00_Demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");//set the path
		//system->class(java.lang(java package)) //setproperty->static method //webdriver.chrome.driver->string key //./driver/chromedriver.exe->string value
		ChromeDriver driver=new ChromeDriver();
		//Chromedriver -> class //driver-> Reference Variable //new->keyword //Chromedriver()-> construction calling statement
		//launch browser whichever we want here we use chrome thats why we take chromedrivevr
		Thread.sleep(5000);
		//wait time for 5 sec
		driver.close();	
		//close the browser
	}
}

