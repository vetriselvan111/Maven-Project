package data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_Write {

	public static void data_Write() throws IOException {
		
		File f = new File("C:\\Users\\Guru\\Desktop\\DataDriven\\Data write.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		wb.createSheet("data").createRow(0).createCell(0).setCellValue("username");
		
	    wb.getSheet("data").getRow(0).createCell(1).setCellValue("password");
	    
	    wb.getSheet("data").createRow(1).createCell(0).setCellValue("Mithun");
	    
	    wb.getSheet("data").getRow(1).createCell(1).setCellValue("Mithun@123");
	    
	    FileOutputStream fos = new FileOutputStream(f);
	    
	    wb.write(fos);
	    
	    wb.close();
	    
	    System.out.println("Data Written in succefully");

}
	public static void main(String[] args) throws Throwable {
		data_Write();
	}
}
