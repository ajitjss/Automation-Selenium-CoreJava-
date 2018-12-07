package poi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcel {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet1= workbook.createSheet("QASheet");
		
		for(int rows=0; rows<10;rows++) {
			Row row= sheet1.createRow(rows);
				for(int cols=0; cols<10;cols++) {
			Cell cell =row.createCell(cols);
			cell.setCellValue((int)(Math.random()*100));
				}
		}
		
		/*Row row= sheet1.createRow(0);
		Cell cellA= row.createCell(0);
		cellA.setCellValue("QA EduPoint");*/
		File f= new File("C:\\Users\\ajit\\Desktop\\Automation\\poiA.xlsx");
		FileOutputStream fo= new FileOutputStream(f);
		workbook.write(fo);
		fo.close();
		System.out.println("Excel writing donm");
		
		
		

	}

}
