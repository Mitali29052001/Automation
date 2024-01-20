//Multi Select ListBox 
//Control+K-> use to select multiple option.
//Deselect Method->use to deselect or unselect the selected element.
//1)deselectByIndex();
//2)deselectByValue();
//3)deselectByVisibleText();
//4)deselectAll();
//5)getFirstSelectedOption();->when we want to know which element we select first for that we use getFirstSelectedOption() method.
//6)getAllSelectedOption;->use to get all selected option by using getText() method.
//7)getOptions();->when we want to all the options without selecting we use getOptions() method.
//8)getWrappedElement():- use to wrapped all element which are present in options.

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A33_HandlingListBoxorDropdownorComboBox_MSLB {
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
		s.selectByIndex(4);
		Thread.sleep(2000);
		s.selectByVisibleText("Canada");
		Thread.sleep(2000);
		s.selectByValue("France");
		Thread.sleep(2000);
		s.selectByVisibleText("Australia");
		Thread.sleep(2000);
		//2
//		s.deselectByValue("Australia");
//		Thread.sleep(2000);
//		s.deselectByVisibleText("France");
//		Thread.sleep(2000);
//		s.deselectByVisibleText("Canada");
		//2
		//3
//		s.deselectAll();
		//3
		String option = s.getFirstSelectedOption().getText();
		System.out.println(option);
		//3
		Thread.sleep(2000);
		driver.close();
		
	}
	
}
