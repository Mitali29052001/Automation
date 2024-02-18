//Note: extend should written after class not after interface.
package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A05_TestNG_BaseClass_Utilization extends A04_TestNG_BaseClass {
	@Test
	public void createCustomer(){
		Reporter.log("Created Customer", true);
	}
	@Test
	public void modifyCustomer(){
		Reporter.log("Customer Modified Successfully", true);
	}
	
}
