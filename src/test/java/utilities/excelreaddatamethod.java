package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class excelreaddatamethod {


		public static String[][] getData(String fileName,String sheetName) throws IOException{
			File file = new File(fileName);
			FileInputStream ips = new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook(ips);
			XSSFSheet sh = wb.getSheet(sheetName);
			int rowNumber = sh.getLastRowNum()+1;
			int colNumber = sh.getRow(0).getLastCellNum();
			String[][] data = new String[rowNumber][colNumber];

			for(int i = 0;i<rowNumber;i++) {
				XSSFRow row = sh.getRow(i);
				for(int j=0;j<colNumber;j++) {
					XSSFCell cell = row.getCell(j);
					String value = new DataFormatter().formatCellValue(cell);
					data[i][j] = value;

				}
			}
			
			return data;
		}

	}

