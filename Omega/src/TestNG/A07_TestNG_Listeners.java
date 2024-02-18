//@Listeners:
//Basically it is used to automatically take Screenshot of error which are occur during execution of test script to get know failed test script.
//It is a feature of TestNG
//It is monitoring all the test script executed or not.
//ITestListeners: It is a Interface.(In that Interface override methods are present)
//To call this Interface, we use Implements Keyword.
//To call all the hidden override method  which are present in Interface we have to go source->Override/implement method->Select the ITestListener box->OK


//Note:In base class we make driver static in A04_TestNG_BaseClass file because it execute for screenshot script.
package TestNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class A07_TestNG_Listeners extends A04_TestNG_BaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {//onTestStart:-If the test script is start then the program inside this will be executed.
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result); 
	}

	@Override
	public void onTestSuccess(ITestResult result) {//onTestSuccess: If the test script is successfully executed then whatever code write here will be executed.
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
	}

	@Override
	public void onTestFailure(ITestResult result) { //onTestFailure: If any test script is failed then the whatever program written over here will get executed.
		                                            //So here we write screenshot program so if any test script is failed it will take screen shot automatically.
		TakesScreenshot t=(TakesScreenshot) driver;
		//To use driver we have to extend BaseClass(A04_TestNG_BaseClass) after Class
		String name = result.getName();
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/"+name+".png");
		//To get the class name for file we use concatenation(+)
		try { //Note: If we are using Override method we cannot use throw exception, we use Try Catch instead of throw
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();     
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {//used when if we want to skipped any test script
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {//use when we want to get percentage of success test script till last execution
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {//use when we want to get know if test script is failed due to timeout.
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

}
