

import java.util.Map;
import java.util.*;
import java.io.File;
import java.io.FileOutputStream;

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


public class TestOnlineBatch{
	

public static void main(String[]args) throws Throwable{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Christy Thomas\\Downloads\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://www.flipkart.com/";
	driver.get(url);
	driver.manage().window().maximize();

	driver.findElement(By.xpath("//span[text()='✕']")).click();
	driver.findElement(By.name("q")).sendKeys("Redmi Mobiles",Keys.ENTER);
	
	List<WebElement> mobileName= driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	for(int i=0;i<mobileName.size();i++) {
		WebElement names=mobileName.get(i);
		String name=names.getText();	
		List<WebElement>mobilePrice= driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
			for(int j=i;j<=i;j++) {
				WebElement prices=mobilePrice.get(j);
				String price=prices.getText();
				Map<String,String> mp=new LinkedHashMap<>();
				mp.put(name,price);
				System.out.println(mp);
			
				File f=new File("C:\\Users\\Christy Thomas\\Desktop\\ChristyWrite.xlsx");
				Workbook w=new XSSFWorkbook();
				Sheet s=w.createSheet("FlipKart");
				Row r=s.createRow(24);
				for(i=0;i<=24;i++) {
					Cell cell=r.createCell(24);
					cell.setCellValue(mp.put(name, price));
				}
				
					
				}
				
			}
	
	}
}
