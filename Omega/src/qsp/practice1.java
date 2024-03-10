package qsp;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice1{
	static {
		System.setProperty("webdriver.driver.chrome", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.zomato.com/india");
		
		
	driver.findElement(By.linkText("Log in")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//span[.='Create account']")).click();
//		 driver.findElement(By.id("auth-login-ui"));
//		 String iframeid = iframe.getAttribute("id");
//		 System.out.println(iframeid);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		WebElement singlelink = driver.findElement(By.linkText("Log in"));
//		js.executeScript("arguments[0].click();", singlelink);
//		WebElement loginButton = driver.findElement(By.linkText("Log in"));
//		loginButton.click();
//		String mainWindowHandle = driver.getWindowHandle();
//		for (String popupHandle:driver.getWindowHandles()) {
//			if(!popupHandle.equals(mainWindowHandle)) {
//				driver.switchTo().window(popupHandle);
//				break;
//			}
//		}
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//	    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("ssIFrame_google")));

//		WebElement iframe = driver.findElement(By.id("auth-login-ui"));
//		driver.switchTo().frame(iframe);

		// Now interact with elements inside the iframe
		
//		driver.findElement(By.xpath("//input[@type='number']")).click();
//		driver.findElement(By.xpath("//div[@aria-label='Continue with Email']")).click();
//		Actions a = new Actions(driver);
//		a.doubleClick(element).perform();
//		driver.getWindowHandles();
//		Set<String> window = driver.getWindowHandles();
//		System.out.println(window);
//;		driver.findElement(By.xpath("(//div[@class='sc-re4bd0-8 huFQYv'])/section[2]/section/div/div/input")).click();
//		driver.findElement(By.xpath("//div[@aria-label='Continue with Email']")).click();
//		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9834549528");
//		driver.get("https://9834549528@www.zomato.com/");
//		driver.findElement(By.xpath("//div[@aria-label='Continue with Email']")).click();
//		driver.findElement(By.xpath("//span[.='Create account']")).click();
//		JavascriptExecutor j=(JavascriptExecutor) driver;
//		Thread.sleep(2000);
//		int yaxis = driver.findElement(By.xpath("")).getLocation().getY();
//		j.executeScript("window.scrollBy(0,"+yaxis+")");
//		Thread.sleep(3000);
		
		Thread.sleep(5000);
		driver.close();
	}
}