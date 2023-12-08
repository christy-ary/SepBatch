package College;

import java.util.Map;
import java.util.*;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TestOnlineBatch1{
	

public static void main(String[]args) throws Throwable{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Christy Thomas\\Downloads\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
	driver.get(url);
	driver.manage().window().maximize();
	
		      WebElement tableElement = driver.findElement(By.tagName("table"));
		      List<WebElement> rows = tableElement.findElements(By.tagName("tr"));

		      for (WebElement rowElement : rows) {
		         List<WebElement> cells = rowElement.findElements(By.tagName("td"));

		         
		         for (WebElement cellElement : cells) {
		            String cellData = cellElement.getText();
		            
		            System.out.print(cellData + "\t");
		         }

		         
		         System.out.println();
		      }

		     
		      driver.quit();
		   }
		
}
			
		
	
	

