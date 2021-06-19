package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.IllegalFormatException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.commons.io.FileUtils;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Base.Basecl;



public class TestUtil extends Basecl {
	public static long PAGE_LOAD_TIME = 10;
	public static long IMPLICIT_WAIT= 10;
	static Workbook book;
	static Sheet sheet;
	public static String TEST_DATA_SHEETPATH =".\\DataFiles\\Cart.xlsx";
	
	
//	 public void switchToFrame()
//	 {
//		 driver.switchTo().frame("");
//		 
//	 }	
		 
		 public static Object[][] getTestData(String sheetName) throws IOException
		 {
			FileInputStream file = null;
			 
			 try
			 {
				 file  = new FileInputStream(TEST_DATA_SHEETPATH);
			 }
			 catch(FileNotFoundException e)
			 {
				 e.printStackTrace();
			 }
			 try
			 {
				
				book = WorkbookFactory.create(file);
			 }
			 catch(IllegalFormatException e)
			 {
				 e.printStackTrace();
			 }
			 catch(IOException e)
			 {
				 e.printStackTrace();
			 }
//		 catch(NullPointerException NPE)
//			 
//		    {
//			 System.out.println("nn");
//		    }
		   
			 
			 
			 sheet=book.getSheet(sheetName);
			 Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			 // i was 0 and k was0 and data[i][k]
			 for(int i=0; i<sheet.getLastRowNum();i++) 
			 {
				 for(int k=0; k<sheet.getRow(0).getLastCellNum();k++)
				 {
					 data[i][k] = sheet.getRow(i+1).getCell(k).toString();
					 System.out.println(data[i][k]);
				 } 
				  
			 }
			
			 return data;
		 }
		 
		 
		 public static void scrollpage()
		 {
			 JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			 jsExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		 }

		 public static void getscreenshot() throws Exception 
	     {
	             File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	          //The below method will save the screen shot in d drive with name "screenshot.png"
	             FileUtils.copyFile(scrFile, new File("D:\\Users\\priya.saxena\\eclipse-workspace\\Rev_SC\\Screenshot"));
	     }
		 
		 public static void entertext()
		 {
			 JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		 }
		 
		 public static void switchingtab()
		 {
			    ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
			    driver.switchTo().window(tabs2.get(1));
			  //  driver.close();
			  //  driver.switchTo().window(tabs2.get(0));
		 }

			 


//			
//			 
			 
			 }
			 

			

			
			 

			 



