package NewCollege.copy;

import java.io.File; 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Csc {
public static void main(String[] args) throws Throwable {
	File f=new File("C:\\Users\\Christy Thomas\\Desktop\\ChristyWrite.xlsx");
	//FileInputStream f1=new FileInputStream(f);
	Workbook w= new XSSFWorkbook();
	Sheet s=w.createSheet("Excel");
	Row r=s.createRow(0);
			for (int i = 0; i < 10; i++) {
				Cell cell=r.createCell(i);
				cell.setCellValue("Christy");
			}
			FileOutputStream f2=new FileOutputStream(f);
			w.write(f2);
			f2.close();
			
						}
					}

				

