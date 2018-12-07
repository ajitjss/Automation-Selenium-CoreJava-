package poi;

import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class createexcel {

	public static void main(String[] args) {
			Workbook wb = new HSSFWorkBook();
			try {
				OutputStream fileOut = new FileOutStream("javatpoint.xls");
				wb.write(fileOut);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		
		
}
}