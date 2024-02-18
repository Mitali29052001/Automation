//TakeScreenShot:
//When we do upcasting then webdriver will enable but j.se and Tss will be hidden
//But we have TSS(Take  for that we do typecasting
//For TakeScreenShot We use one method i.e getScreenshotAs();
//It is a non static method 
//1)TakeScreenshot t = (TakesScreenshot)driver
//driver->come from web class
//2)File src = t.getScreenShotAs(outputType.File);
//File ->Return Type of src. src->Variable name where Sreenshot file is saved. t->R.V getScreenShotAs(outputType.File)->It is abstract method. (outputType.File)->It is Interface and It is used to convert the image screenshot into file.
//3)File dist = new File("./Screenshot/ss.png");
//File-> java class coming from io package, dist->R.V in which we store all string path data 
//new -> keyword, File()->Constructor which accept one parameter as string path.
//4)File.copy(src,dest)->It is static method which accept parameter as source and destination.
//5)Create ScreenShot Folder
//So taken screenshot will store in that ScreenShot Folder
//If after execution if it is not store then do Refresh using Right Click on Screenshot folder.
//Note: SElenium will take only PNG extension for Image.

package TestNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class A06_TakeScreenShotAs {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
@Test
public void getSs() throws IOException, InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/login/");
TakesScreenshot t=(TakesScreenshot) driver;
File src = t.getScreenshotAs(OutputType.FILE);
File dest=new File("./Screenshot/ss.png");
Files.copy(src, dest);
Thread.sleep(4000);
driver.close();

}
}
