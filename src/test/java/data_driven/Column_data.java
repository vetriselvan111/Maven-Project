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

public class Column_data {
    
	public static void read_ColumnData() throws IOException {
		
File f = new File ("C:\\Users\\Guru\\eclipse-workspace\\JavaCourse\\src\\com\\Data_Driven\\Data sheet.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		
		System.out.println("COLUMN DATA");
		
		System.out.println("                   ");
		
		for (int i = 0; i < numberOfRows; i++) {
			
			Row row = sheetAt.getRow(i);
			
			Cell cell = row.getCell(0);
				
				CellType cellType = cell.getCellType();
				
				if (cellType.equals(CellType.STRING)) {
					
					String cellvalue = cell.getStringCellValue();
					
					System.out.println(cellvalue);
					
				}
				
				else if (cellType.equals(cell.getNumericCellValue())) {
					
					double cellValue = cell.getNumericCellValue();
					
					int value =  (int) cellValue;
					
					System.out.println(value);
					
				}
			}
			
		}
	
	public static void main(String[] args) throws Throwable {
		read_ColumnData();
	}
		
}

