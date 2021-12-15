package data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Particular_data {

	public static void read_Data() throws IOException {
		
		File f = new File("C:\\Users\\Guru\\eclipse-workspace\\JavaCourse\\src\\com\\Data_Driven\\Data sheet.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		
		Row row = sheetAt.getRow(3);
		
		Cell cell = row.getCell(1);
		
		
		
		CellType cellType = cell.getCellType();
		
		System.out.println("Particular data");
		
		System.out.println("                   ");
		
		if(cellType.equals(CellType.STRING)){
			
		   String value = cell.getStringCellValue();
		   
		   System.out.println(value);
		}
		
		else if (cellType.equals(CellType.NUMERIC)) {
			 double cellValue = cell.getNumericCellValue();
			 
			 int value = (int) cellValue;
			 
			 System.out.println(value);
			
		}
      }
	public static void main(String[] args) throws Exception {
		read_Data();
	}
}
