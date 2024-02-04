//Notification popups
//characteristics
//1)we cannot move this popup's
//2)we cannot inpect this popup's
//3)In that we will be having Allow and Block option
//4)This is present on the below of addressbar on the left side
//In this we cannot able to switch to popups because this popups is not coming from webelement, It is coming from chrome.
//so that we have to call non static method for that we create object as chromeoption
//we have to initially handle this notification popups so that we have to declare all below statement before opening website using get. 
//chromeoption option = new chromeoptions();
//chromeoption->class coming from org.selenium, option->reference variable, new->keyword, chromeoptions()->method.
//call non static method using reference variable option
//option.addarguments("--disable-notifications");
//option->reference variable, addagguments()->Non static method, --disable-notification->parameter, it is used to click on block button for popups.
//option->reference variable, addagguments()->Non static method, --unable-notification->parameter, it is used to click on allow button for popups.
//webdriver driver = new chromedriver(option)

package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A44_PopUps3_Notification {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions Option=new ChromeOptions();
		Option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(Option);
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		Thread.sleep(3000);
		driver.close();
	}

}
