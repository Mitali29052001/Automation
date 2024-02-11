//If we want to update data
//1)setcellvalue()->It is used when we want to update the data 
//wb.getsheet("sd").getRow(2).getcell(3).setcellvalue('student');
//2)Fileoutputstream file = new Fileoutputstream("./Testdata/TestData.xlsx.xls")
//Fileoutputstream-> java class coming from io package which is used to show output, file->R.V in which we store all string path data 
//new -> keyword, Fileoutputstream()->Constructor which accept one parameter as string path.
//3)wb.write(file)
//wb->R.V, write()->Its a method which is used to replace the old data with new data
package data_driven_testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A03_DDT_CD_UpdateData_Setcellvalue {
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("./Testdata/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		wb.getSheet("SD").getRow(2).getCell(2).setCellValue("Student");
		FileOutputStream file1 = new FileOutputStream("./Testdata/TestData.xlsx");
		wb.write(file1);
	}
}
