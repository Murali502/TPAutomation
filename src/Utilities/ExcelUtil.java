package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil {

	static Workbook ExcelWBook;
	static Sheet ExcelSheet;
	public static Object[][] getTestData(String sn)
	{
		System.out.println("Reading Data from Excel");
		FileInputStream file=null;
		try {
			file =new FileInputStream("./TestData.xlsx");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		try
		{
			ExcelWBook =WorkbookFactory.create(file);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}catch(InvalidFormatException e)
		{
			e.printStackTrace();
		}
		
		ExcelSheet =ExcelWBook.getSheet(sn);
		int totalRows=ExcelSheet.getLastRowNum();
		int totalCols=ExcelSheet.getRow(0).getLastCellNum();
		System.out.println(totalRows +" | "+ totalCols);
		Object[][] data =new Object[totalRows][totalCols];
		for (int i = 0; i <totalRows ; i++) {
		
			for (int j = 0; j < totalCols; j++) {
				data[i][j]=ExcelSheet.getRow(i+1).getCell(j).toString();
			}
		}
		
		return data;
	}
	
}
