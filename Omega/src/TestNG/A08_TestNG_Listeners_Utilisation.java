//How its work:
//It will check from class line by line
//After coming Asser.fail() it will failed and go to the A07_TestNG_Listeners.class and in that go to the onTestFailure method and Inside onTestFailure method written program of Take screenshot will get executed.


//Suppose if we have multiple test script but two test script is failed so we have to get two screenshot but we get only one because in A04_TestNG_BaseClass onTestFailure method program we written destination of string path is direct file name so it will overlap with this file and give only one screenshot.
//so to avoid that we use result.getName() method in A04_TestNG_BaseClass onTestFailure method using that we can get many screenshot of failed test script with their class name automatically. 
package TestNG;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(A07_TestNG_Listeners.class)
//Note: We have to take @Listeners before class because we have to execute all test script line by line from class.
public class A08_TestNG_Listeners_Utilisation extends A04_TestNG_BaseClass {
	@Test
	public void getScreenshot(){
		Reporter.log("take screenshot automatically");
		Assert.fail();
	}
	@Test
	public void getScreenshot1() {
		Assert.fail();
		Reporter.log("take screenshot automatically");
	}

}
