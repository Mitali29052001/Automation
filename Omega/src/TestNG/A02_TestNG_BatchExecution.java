//1)Batch Execution:
//Executing more than one class it is called Batch Execution.
//We create multiple class in TestNG package.
//Select multiple classes which you want in TestNG package by Shift+Down Arrow->Right Click->TestNG->Convert To TestNG->pop up will come->Change location name which you want(omega/batchExecution.xml)->Finish
//batchExecution.xml file will be visible in omega project.
//This file called as suits because combination of multiple class
//After execution of this file It will execute in alphabetical order.
package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class A02_TestNG_BatchExecution {
	@Test(invocationCount = 3, priority=3)	
	public void getCustomer() {
		Assert.fail();
		//If we want to intentionally failed one test script then there is one class coming from org.TestNG that we have to use i.e Asser.fail().
		Reporter.log("Customer created", true);
	}
	@Test(priority=1)
	public void Employee() {
		Assert.fail();
		Reporter.log("Employee created", true);
	}
	@Test(priority=2)
	public void modify() {
		Reporter.log("modify", true);
	}
}
