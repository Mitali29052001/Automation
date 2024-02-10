
package data_driven_testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01_DDT_CD_Actitime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		FileInputStream file = new FileInputStream("./Testdata/commondata.property.txt");
		Properties p = new Properties();
		p.load(file);
		String data = p.getProperty("url");
		driver.get(data);
		String un = p.getProperty("username");
		driver.findElement(By.id("username")).sendKeys(un);
		Thread.sleep(5000);
		String pwd = p.getProperty("password");
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(5000);
		driver.close();
	}
}
