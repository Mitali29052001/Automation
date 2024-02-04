//Child Window Popup's
//In that there is one window under that one more small window is present
//The main window is parent and the one more window inside parent window is child window
//and main window is having one id 
//to get that id we use one method called as getWindowHandle() which is webdriver method.
//this method is used to get id of only one parent window
//and that id is always in Alphanumerical value and the return type of this alphanumerical value is string.
//if we want id of more window then we use one method called as getWindowHandles() which is webdriver method.
//and the return type of this getWindowHandles() method is Set<string>.
//why set why not list?
//because address id of windows is always unique and list can have duplicate values where set don't have duplicate values.
//If we use driver.close() wedriver method then only parent window will get close. and all the child window will always open.
//for that we use quit() webdriver method to close all parent and childs window.
//whenever we run program again and again we get new id of windows all the time.

package qsp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A48_PopUps7_ChildWindow {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://www.facebook.com/");
//		String window = driver.getWindowHandle();
//		System.out.println(window);
//		driver.close();
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		String pwinid = driver.getWindowHandle();
		driver.findElement(By.xpath("//section[.='Popups']")).click();
		driver.findElement(By.xpath("//section[.='Browser Windows']")).click();
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.xpath("//button[.='Click to open multiple popup windows']")).click();
		Set<String> allWinid = driver.getWindowHandles();
//		System.out.println(allWinid);
		
		
//		for(String win:allWinid) {//if we want to print allwinid line by line then we use for each loop. In that all id of window store into allwinid then allwinid give id to left side win and the return type is string
//			driver.switchTo().window(win);//to close all the window without using quit method we used switchto method and add driver.close() so first it swith to parent window because all id store in allwinid and it give first id to win then it close this window then foreach loop take 2nd window and close this window after taking its id and continue is going same
//			driver.close();
//		}
		
		//parent window will be open and child windows has to be close
		for(String win:allWinid) {
			if(!pwinid.equals(win)) {//difference between == and .equals, == is compare address and java create different address for different variable values and .equals to compare values which are store in variable.
				driver.switchTo().window(win);
				driver.close();
			}
		}
//		Thread.sleep(2000);
//		driver.quit();
		
	}

}
