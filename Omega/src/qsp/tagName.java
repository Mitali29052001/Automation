package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Mitali/QSpider/Automation/dummypage.html");
		driver.findElement(By.tagName("a")).click();
		//<a href="https://www.youtube.com">Youtube</a>
		// a-> tagName href-> Attribute Name "https://www.youtube.com"-> Attribute Value   Youtube-> text, Visible Text
		//a-> It is also called as link means whenever we want to get tagname we use linktext instead of tagname tagname(a,input,span,link) 
		//a->link  Youtube->text thats why we called linktext
		Thread.sleep(5000);
		driver.close();
		
	}
}
