//Handling Listbox/Dropdown/Combobox
//Two Types
//1)Single Select Listbox-if we are able to select only one context we use single select listbox.
//2)Multi Select Listbox-if we are able to select more than one context we use multi select listbox.
//point to remember
//1)dropdown element should start with select tagname
//2)options of dropdown element should start with option
//The return type of findelement(Single Element) is web element.
//The return type of findelements (Multiple Element) is List<WebElement>//if we want to store more than one element then we use findelements.
//o-selenium.-supportpacakge-qapacakge-select coming from
//Non-Static Method:- Select S = new Select(element);
//Select->Class S->Reference Variable new->keyword Select->Constructor (elements)-> select constructor will take address of elements.
//S.SelectByindex(0)
//S.DeSelectByindex(0)
//S->Reference Variable SelectByindex()->method
//S.SelectByValue()
//S.DeSelectByValue()
//We use this SelectByValue because sometimes if their more option in dropdown so it is difficult to find the index of perticular option so that time we will go for SelectByValue in that we take the attribute value of attribute name value.
//S->Reference Variable SelectByValue()->method
//S.SelectByVisibleText()
//S.DeSelectByVisibleText()
//We use this SelectByVisibleText because same as selectbyvalue for using SelectByVisibleText we take text
//S->Reference Variable SelectByVisibleText()->method
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A32_HandlingListBoxorDropdownorComboBox_SSLB {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		WebElement element = driver.findElement(By.xpath("//select[@id='select3']"));
		//It will store address of dropdown element in element variable for that we need not to write getmethod thats why the type of variable name will be webelement if we take any get method then type of variable will string
		Select S = new Select(element);
		Thread.sleep(5000);
		S.selectByIndex(7);
		Thread.sleep(5000);
//		driver.close();
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		WebElement element2 = driver.findElement(By.xpath("//select[@id='select5']"));
		//It will store address of dropdown element in element variable for that we need not to write getmethod thats why the type of variable name will be webelement if we take any get method then type of variable will string
		Select S1 = new Select(element2);
		Thread.sleep(5000);
		S1.selectByValue("Maharashtra");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		WebElement element1 = driver.findElement(By.xpath("(//select[@class='border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150'])[4]"));
		//It will store address of dropdown element in element variable for that we need not to write getmethod thats why the type of variable name will be webelement if we take any get method then type of variable will string
		Select S2 = new Select(element1);
		Thread.sleep(5000);
		S2.selectByVisibleText("Mumbai City");
		driver.close();
	}
}
