//File Download PopUp:-We download the file using CRL+S by manually
//but if we want to do it by using automation then there is one concept called (Robot Class) which is class coming from awt(abstract window toolkit)
//for that there is 2 non static method
//1)keypress:
//If we use A-Z, special character(!,@,#), 0-9 then we do only keypress
//2)keyRelease
//If we want to use presskey capslock,alt,numlock,window then we do keyRelease
//characteristics
//1)It is movable
//2)It is not inspectable
//3)This popup will be having open and cancel button
//4)The title of this popups is always save 
//Runtime.getRuntime().exec("Notepad");
//Runtime->java class which is coming from lang package, getRuntime()->Static Method, exec("Notepad")->Execution method which accept one parameter, Notepad->parameter which we want to open application
//To call this non static method we have to create object
//Robot r = new Robot();
//Robot->java class coming from awt package, r->variable, new->keyword(awt exception), Robot()-constructor
//Scenario
//open notepad
//enter QSP in notepad
//r.keypress(KeyEvent.Vk_Shift);
//r->reference variable, keypress(KeyEvent.Vk_Shift)->non static method which contain parameter, KeyEvent.Vk_Shift->virtual key 
//r.keypress(KeyEvent.Vk_Q);
//r.keyRelease(keyEvent.VK_Shift);
//r.keypress(KeyEvent.Vk_s);
//r.keypress(KeyEvent.Vk_p);

package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A47_PopUps6_FileDownload {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
//		Runtime.getRuntime().exec("Notepad");
//		Thread.sleep(2000);
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_SHIFT);
//		r.keyPress(KeyEvent.VK_Q);
//		r.keyRelease(KeyEvent.VK_SHIFT);
//		r.keyPress(KeyEvent.VK_S);
//		r.keyPress(KeyEvent.VK_P);
		
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		driver.close();
		
	}
}
