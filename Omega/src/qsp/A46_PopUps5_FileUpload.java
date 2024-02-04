//File Upload PopUps:The popup which will come when we choose upload file. ex.drive will open, file manager will open
//characteristics
//1)It is movable
//2)It is not inspectable
//3)This popup will be having open and cancel button
//4)The title of this popups is always open 
//syntax:
//File f= new File("./Testdata/Resume.pdf")
//string path = f.getabsolutepath()
//create object to call non static method
//File->java class which is come from io package, f->variable, new->keyword, File()->Constructor which accept one parameter i.e string(double quotes)pathname, 
//("./Testdata/Resume.pdf")->Raw Path which is store in (f variable).
//To convert raw path to string we use getabsolutepath() which is (non static method)
//string-> return type of path, path->variable(all the path will store in path variable), f->reference variable, getabsolutepath()->non static method.
package qsp;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A46_PopUps5_FileUpload {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.foundit.in/");
		driver.findElement(By.xpath("(//div[contains(.,'Upload Resume')])[5]")).click();
		File f = new File("./Testdata/Mitali_Kadam_Resume.pdf");
		 String path = f.getAbsolutePath();
		 Thread.sleep(2000);
		 driver.findElement(By.id("file-upload")).sendKeys(path);
		 Thread.sleep(2000);
		 driver.close();
		
	}
}
