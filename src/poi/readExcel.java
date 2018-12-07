package poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readExcel {

	public static void main(String[] args) throws RuntimeException, Exception, IOException {
	
		// input read stream 
		File f = new File("C:\\\\Users\\\\ajit\\\\Desktop\\\\Automation\\\\poiA.xlsx");
		
		// connecting workbook to input stream
		FileInputStream fi = new FileInputStream(f);
		
		Workbook workbook = WorkbookFactory.create(fi);  // just to a make a connection
		
		
		Sheet sheet0= workbook.getSheetAt(0);
	/*	Row row0= sheet0.getRow(0);
		Cell cellA= row0.getCell(0);
		System.out.println(cellA);*/
		
		for(Row row: sheet0)
		{
			for(Cell cell: row) {
				switch(cell.getCellType())
				{
				case Cell.CELL_TYPE_STRING:
				System.out.println(cell.getStringCellValue()+"\t");
				case Cell.CELL_TYPE_NUMERIC:
					System.out.println(cell.getNumericCellValue()+"\t");
				case Cell.CELL_TYPE_BLANK:
					System.out.println("Blank cell");
				}
			}
		}
		fi.close();
		

	}

}
