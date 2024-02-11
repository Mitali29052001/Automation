//To use excel we need to download jar file
//1)tinyurl.com/aliselnium-sir url
//2)a)https://archive.apache.org/dist/poi/release/bin/ then go to 
//2)b)poi-bin-5.2.3-20220909.zip 
//after downloading zip file extract it
//go to extracted folder copy all jar file except licence and notice file, auxilary, lib, ooxml-lib folder
//paste it in eclipse omega projects->jar folder.
//again go to the auxilary, lib, ooxml-lib folder one by one and paste the all jar file into the eclispe omega project->jar folder.
//go to the jar folder and copy jar file by doing shift+down key from  first jar file till before name like selenium jar file and right click and select build path then click on add build path all jar file will go to the reference libraries.
// again go to the jar file and copy jar file by doing shift+down key from after name like selenium jar file to last file and click right click and select build path then click on add build path all jar file will go to the reference libraries.
////object create
//1)FileinputStream file = new Fileinputstream("./TestData/commondata.property")
//FileinputStream->java class which is coming from io package. file->R.V, = -> Assignment Operator which used to switch the right side data to the left side R.V. new->keyword. Fileinputstream("./testdata/commonproperty)->Constructor which accept one parameter as string path. "./TestData/commondata.property"-> string path
//2)workBook wb = workbookfactory.create(file);
//WorkBook->Return type of wb, wb->R.V,To get data we use reference variable, workbookfactory->java class come from jar, create(file)->static method present in workbookfactory which accept one parameter to load excel data
//Workbookfactory->java class come from jar, it take complete control of file data and switch to wb
//3)wb.getsheet("studentdata").getRow(2).getcell(1).getStringcellvalue();
//wb->R.V, getsheet("studentdata")->This getsheet() method is used to get the control to specified sheet in excel which accept one parameter as sheet string name
//getRow(2)->This getRow() method is used to get the control to specified Row in excel data which accept one parameter as row number
//getcell(1)->This getcell() method is used to get the control to specified cell in excel data which accept one parameter as cell number
//getStringcellvalue()->This getStringcellvalue() method picked the value from cell.
//getNumericcellvalue()->It work same as getStringcellvalue, but this getNumericcellvalue() method is used when we want picked number from cell then we use getNumbercellvalue() method, It picked the value from the cell which is in double datatype because excel consider number as 1.0 means if number is 1 then it will consider as 1.0 (double datatype) if we dont use this and used getStringcellvalue we get error.
package data_driven_testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A02_DDT_CommonData_Excel {
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("./Testdata/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		String data = wb.getSheet("SD").getRow(2).getCell(1).getStringCellValue();
		System.out.println(data);
		
	}
}
