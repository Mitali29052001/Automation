//Priority: We can give priority to test script for execution in order whichever we want
//If we want to skip one script to execute then we use the concept of enable=false.
package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A01_TestNG {
	@Test(invocationCount = 3, priority=3)	
	public void getCustomer() {
		Reporter.log("Customer created", true);
	}
	@Test(priority=1, enabled=false)
	public void Employee() {
		Reporter.log("Employee created", true);
	}
	@Test(priority=2)
	public void modify() {
		Reporter.log("modify", true);
	}
}
