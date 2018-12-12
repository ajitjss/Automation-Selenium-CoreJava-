package poi2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
XSSFWorkbook workbook = new XSSFWorkbook();
XSSFSheet sheet1= workbook.createSheet("QAtraining1");
XSSFSheet sheet2= workbook.createSheet("QAtraining2");
XSSFSheet sheet3= workbook.createSheet("QAtraining3");
XSSFSheet sheet4= workbook.createSheet("QAtraining4");

Row row0= sheet1.createRow(0);
Cell cellA = row0.createCell(0);
cellA.setCellValue("QA");

Row rowB0= sheet2.createRow(0);
Cell cellBA = rowB0.createCell(0);
cellBA.setCellValue("QA");
File file = new File("C:\\Users\\ajit\\Desktop\\test\\QA_test.xlsx");
FileOutputStream op= new FileOutputStream(file);
workbook.write(op);
op.close();
	}

}
