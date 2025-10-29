package TestInputfromExcel.ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class TestInputfromExcel {
	
	
	Workbook workbook;
    Sheet sheet;
	        
	        @Test
	        public void TestGoogle() throws Exception {
	        	
	        	try{
	        		File file = new File("TestData.xlsx");
	        		 FileInputStream fis = new FileInputStream(file);
	                 workbook = new XSSFWorkbook(fis);	                 
	                 org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet("Sheet1");
	                 
//	                 Cell cell = sheet.getRow(1).getCell(0);
//	                 
//	        		FileInputStream fis = new FileInputStream("./src/test/java/TestData.xlsx");
//	    		
//	    			XSSFWorkbook workbook = new XSSFWorkbook(fis);
	    		
	                 Row row = sheet.getRow(1);  // Second row (index 1)
	                 Cell cell = row.getCell(0);
			       
			       
			        
			        String expectedTitle = cell.getStringCellValue();  
			        
			  	  WebDriverManager.edgedriver().setup();
		  			WebDriver driver = new EdgeDriver();
		  	       
		  	        driver.get("https://www.google.co.in/");
		  	        
		  	      String actualTitle = driver.getTitle();
		  	    System.out.println("Actual title: " + actualTitle);
		  	  Assert.assertEquals(actualTitle, expectedTitle, "Title is mismatched");
		  	  
		  	Thread.sleep(5000);
    		driver.quit();
	    		}
	        	catch(Exception e)
	        	{
	        		e.printStackTrace();
	        	}
	        	    		
	    	}
}
//	    	@Test
//	    	public void TestAmazon() throws Exception {
//	    		
//	    		try{
//	    			FileInputStream fis = new FileInputStream("./src/test/java/TestData.xlsx");
//	    		
//	    		XSSFWorkbook workbook = new XSSFWorkbook(fis);
//	    		 
//			        XSSFSheet sheet = workbook.getSheetAt(0);
//			        XSSFRow row = sheet.getRow(2); 
//			        XSSFCell cell = row.getCell(0);
//			               
//					String expectedTitle = cell.getStringCellValue();
//					WebDriverManager.edgedriver().setup();
//		  			WebDriver driver = new EdgeDriver();
//		  	       
//		  			driver.get("https://www.amazon.in/");
//		  			driver.manage().window().maximize();
//
//		  			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPad" + Keys.RETURN);
//		  	        
//		  	      String actualTitle = driver.getTitle();
//			        System.out.println("Actual title: " + actualTitle);
//
//			    
//		    		  Assert.assertEquals(actualTitle, expectedTitle, "Title is mismatched");
//		    		  Thread.sleep(5000);
//			    		driver.quit();
//	    		}
//	    		catch(Exception e)
//	    		{
//	    			e.printStackTrace();
//	    			
//	    		}
//					
//	    		 
//		    		
//		    		
//	    	}
//	    }
//
//
//
//
