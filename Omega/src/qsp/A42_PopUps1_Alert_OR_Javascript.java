//PopUp's:- It is an additional window which will be coming on the webpage.
//In popup's there are 7 types:
//1)Alert/JavaScript popup
//characteristics of Alert/Javascript Popup's
//1)We cannot move this popup's
//2)We cannot inspect this popup's
//3)This popup's will be having ok and cancel button and sometime we will be having only ok button
//4)This popup's will be present below the address bar and the center of the page
//2)Hidden Division/calender pop-up
//3)Notification popup's
//4)Authentication popup's
//5)File upload popup's
//6)File download popup's
//7)child window popup's
//steps:
//1)Initially the control is on webpage 
//2)for that we have to switch control to Alert
//3)for that we use switchto() method.
//4)Alert a = driver.switchto().Alert();
//Alert->Return type, a,driver->Reference variable, switchto()->webdriver method, Alert()->Popup's method
//Return type of Popup's method is itself popup's type
//In Alert popup's there is another 3 method
//1)accept(); a.accept()->we call this method using reference variable a//It is used to accept popup's, it click on ok option.
//2)dismiss(); a.dismiss()->we call this method using reference variable a// It is used to dismiss the popup's, it click on cancel button.
//3)getText();a.getText()-> we call this method using reference variable a//It is used to get text which are present in popup's
//Write a script to handle popup's
package qsp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A42_PopUps1_Alert_OR_Javascript {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[.='Popups']")).click();
		driver.findElement(By.xpath("//section[.='Javascript']")).click();
//		driver.findElement(By.xpath("//button[.='Alert Box']")).click();
//		Alert a = driver.switchTo().alert();
//		a.accept();
//		
//		
//		driver.findElement(By.linkText("Confirm")).click();
//		driver.findElement(By.xpath("//button[.='Confirm Box']")).click();
//		 Alert b = driver.switchTo().alert();
//		 b.dismiss();
		
		
		driver.findElement(By.linkText("Prompt")).click();
		driver.findElement(By.xpath("//button[.='Prompt Alert Box']")).click();
		Alert c = driver.switchTo().alert();
		String text = c.getText();
		System.out.println(text);
		c.dismiss();
		driver.close();
	}
}
