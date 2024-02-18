//If we are having many test cases then for every test case we have to write all code for launching browser to closing so it take 20 lines of code
// so if we have 1000 test cases then 20000 line of code will be wasted so to avoid that we use annotation
//means we write this annotation code in one file i.e base file and use this base file by using inheritance(extend-use this in another class)
//Note:In base file we not write @test because it is written in every class file to start execution and every class file name is different.
package TestNG;

import java.time.Duration;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class A04_TestNG_BaseClass {
	WebDriver driver;
//While launching browser we create R.V driver but if we try to use this R.V(driver) we not able to use because we create multiple method in one class so this R.V(driver) become Local Variable thats why we not able to use this
//because of this we make this R.V(driver) as global variable by declaring outside the method or block and inside class.
	@BeforeSuite 
	public void databaseConnection() {
		Reporter.log("Database Connected Successfully", true);
	}
	@BeforeTest 
	public void browserLaunched() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Reporter.log("Browser Launched Successfully", true);
		//We use this statement because If the statement get as output at last after execution then we will get to know that all upside statements are executed without any error. because interpreter execute line by line.
	}
	@BeforeMethod 
	public void login() {
		driver.get("https://online.actitime.com/mkadam/login.do");
		driver.findElement(By.id("username")).sendKeys("mitalikadam42@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("BbXTns9b");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Reporter.log("Login Successfully",true);
	}
	@AfterMethod
	public void logout() {
		driver.findElement(By.id("logoutLink")).click();
		Reporter.log("Logout Successfully",true);
	}
	@AfterTest
	public void CloseBrowser() {
		driver.close();
		Reporter.log("Browser Closed Successfully",true);
	}
	@AfterSuite
	public void DisconnectDB() {
		Reporter.log("Database Disconnect Successfully",true);
	}
}
