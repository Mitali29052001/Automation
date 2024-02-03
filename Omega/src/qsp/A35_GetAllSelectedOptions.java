//6)getAllSelectedOption;->use to get all selected option by using getText() method.
package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A35_GetAllSelectedOptions {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		driver.findElement(By.linkText("Multi Select")).click();
		WebElement country = driver.findElement(By.id("select-multiple-native"));
		Select s = new Select(country);
		Thread.sleep(2000);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByIndex(6);
		Thread.sleep(2000);
		s.selectByIndex(4);
		Thread.sleep(2000);
		List<WebElement> option = s.getAllSelectedOptions();
		int count = option.size();
		System.out.println(count);
		for(int i=0; i<count; i++) {//we use for loop where i=0 and i should i<count and i++
			 String text = option.get(i).getText(); //we start take address of first index of for loop using get method and gettext of that address and store that address in title variable
			 System.out.println(text); //we print that title variable in which we store address of total webelements.
		 }
		 Thread.sleep(5000);
		 driver.close();
		
	}
}
