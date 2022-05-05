package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {
	static HSSFWorkbook wb;
	static HSSFSheet sheet;
	static FileInputStream fis;
	
	public static void getRowCount() throws IOException {
		fis=new FileInputStream("./Excel/tajhotels.xls");
		wb= new HSSFWorkbook(fis);
		sheet=wb.getSheetAt(0);
	}
	public static String getCellDataString(int rowNum,int colNum) throws IOException {
		fis=new FileInputStream("./Excel/tajhotels.xls");
		wb= new HSSFWorkbook(fis);
		sheet=wb.getSheetAt(0);
		String cellData=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		return cellData;
	}
	
	public static double getCellDataNumeric(int rowNum,int colNum) throws IOException {
		fis=new FileInputStream("./Excel/tajhotels.xls");
		wb=new HSSFWorkbook(fis);
		sheet=wb.getSheetAt(0);
		double cellData=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		return cellData;
	}
}
