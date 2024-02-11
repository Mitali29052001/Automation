//Data Driven Testing:
//Testing the application with multiple set of data which is kept in external resource file like property file, excel file is called data driven testing.
//Data:
//There are two types:
//1)Common data: the data which is common for all the test cases/test script.
//2)Test Data: The data which specific for one test case.
//1)Common Data: common data should be in key-value pair. and Key-value pair should divided by space.(browser chrome, username mitali)
//IQ: How to read the data from your property file
//Q: Write a script to read the data from property file and print on the console.
//object create
//1)FileinputStream file = new Fileinputstream("./TestData/commondata.property")
//FileinputStream->java class which is coming from io package. file->R.V, = -> Assignment Operator which used to switch the right side data to the left side R.V. new->keyword. Fileinputstream("./testdata/commonproperty)->Constructor which accept one parameter as string path. "./TestData/commondata.property"-> string path
//to load the commonproperty file we use load (non static) method
//to call this non static method we create one object:
//2)properties p = new Properties();
//properties->java class coming from util class. p->R.V. new->keyword, properties()->constructor
//3)p.load(file)
//p->R.V load->Non-static method which helps to load data from file(R.V)
//4)String data = p.getproperty("username")
//to print username in console we use getproperty("username") (non static) method
//p->R.V, getproperty("username")->Non static method which accept one parameter as string key. "username"->string key(it is string key so we write in double quotes).

package data_driven_testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class A00_DDT_CommonData_Notepad {
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("./Testdata/commondata.property.txt");
		Properties p = new Properties();
		p.load(file);
		String data = p.getProperty("username");
		System.out.println(data);
	}
	
}
