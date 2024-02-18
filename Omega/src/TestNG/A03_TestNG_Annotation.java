//Annotation->Feature of java which provide additional information during compiled time.
//@BeforeSuite->Database Connection
//@BeforeTest-------Launch Browser----Parallel Execution
//                           Both is used for Launch Browser but @BeforeTest is used for Parallel Execution
//@BeforeClass------Launch Browser
//@BeforeMethod->Login
//@Test->Test Script
//@AfterMethod->Logout
//@AfterClass-------Close Browser
//                       Both is used for Close Browser
//@AfterTest--------Close Browser
//@AfterSuite->Disconnect Database
//It will Execute in this order only 
//If we write this any Annotation anywhere it will execute in given order only.
//Note:@Test should call from annotation.test

package TestNG;

import org.junit.AfterClass;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A03_TestNG_Annotation {
	@BeforeSuite 
	public void databaseConnection() {
		Reporter.log("Database Connected Successfully", true);
	}
	@BeforeTest 
	public void browserLaunched() {
		Reporter.log("Browser Launched Successfully", true);
	}
	@BeforeMethod 
	public void login() {
		Reporter.log("Login Successfully",true);
	}
	@Test
	public void createCustomer() {
		Reporter.log("Customer Created Successfully",true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("Logout Successfully",true);
	}
	@AfterClass
	public void CloseBrowser() {
		Reporter.log("Browser Closed Successfully",true);
	}
	@AfterSuite
	public void DisconnectDB() {
		Reporter.log("Database Disconnect Successfully",true);
	}
}
