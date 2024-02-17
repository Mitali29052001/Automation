//TestNG
//It is a combination of J and N unit
//Unique testing framework tool, which is used by developer
//as well as automation tester
//WBT will done by developer
//BBT will done by Automation Tester
//J-unit used for WBT in java
//N-unit used for BBT for .net code
//It is third party automation tool
//Advantages of TestNG
//1)Batch Execution
//Executing more than one class it is called Batch Execution.
//It create a group and test 
//2)Parallel Execution->Group Execution
//It divide into parallel group and execute so time taken will be less.
//3)Gross Browser Execution
//Compatibility->If we want to test application on different browser then we go with Gross Browser Execution
//4)We can run failed test case
//If 60 test failed then we cannot test one by one test  case so for that here is one file there all failed test cases are present
//so only that failed test cases file will execute.
//5)We can generate report automatically
//6)Additional Annotation
//Annotation->Feature of java which provide additional information during compiled time.
//7)Listener feature:
//It is a part of TestNG which monitor the entire execution of test cases.


//Help->Eclipse Marketplace->Find-TestNG->Click Install->Confirm->Accept->Finish.->after 16 or 53 sec Trust Pop up will come->select all->confirm->again one pop will come->select all trust authe->restart
//Omega->configure->add library->select TestNg->Apply and close


//Rule for using TestNG
//1)We should not create a class in default package.
//2)We should not use main method for execution.((@Test)annotation)
//3)We should not use System.out.println to print on the console( Reporter.log();)

//It is a annotation same work as main method
//we cannot create multiple main method in one class for that we use (@Test)annotation.
//If we want to print on console and also report then we are going to use Reporter.log();
//If we static method the execution will be very slow so for that we use non static method.

//Note:-//If we have multiple test cases it will execute in alphabetical order only.
package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A00_TestNG {
	@Test(invocationCount = 3) //Work as main method
	//If we want to execute specific test script for number of time then there is one concept called (invocation count).
	public void getCustomer() {
		Reporter.log("Customer created", true);
	}
	@Test
	public void Employee() {
		Reporter.log("Employee created", true);
		//why true->To print on both console as well as report
		//If we write false it will not print on console but it will print on the report
		//If we not write both true OR false then by default it will take false . It will not print on console but it will print on the report.
		//Note:
		//System.out.println("Hii"):It will print only on console, It will not print on Report.
		//Reporter.log("Hii", True):It will print on the report and console.
		//Reporter.log("Hii", false):It will print not print on console but it will print on Report.
		//Reporter.log("Hii"):It will not print on console but it will print on Report.
	}
	@Test
	public void modify() {
		Reporter.log("modify", true);
	}
}
//for run->Right Click->Run As->TestNG Test

//How to see the Report:
//Select Project(Omega)->Right Click->Refresh->One Folder will created automatically->Open this folder->In that folder find file emailable-report.html->Double click OR Right click on that file->Open With webBrowser.




