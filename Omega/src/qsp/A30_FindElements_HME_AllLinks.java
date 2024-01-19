package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A30_FindElements_HME_AllLinks {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));//it will take all the elements address for that we use findelements and it will store in the list.
		 int count = allLinks.size();//for count all the address of all the elements we use size method and we store it in count variable
		 System.out.println(count);//we print count
		 for(int i=0; i<count; i++) {//we use for loop where i=0 and i should i<count and i++
			 String title = allLinks.get(i).getText(); //we start take address of first index of for loop using get method and gettext of that address and store that address in title variable
			 System.out.println(title); //we print that title variable in which we store address of total webelements.
		 }
		 Thread.sleep(5000);
		 driver.close();
		
	}
}
