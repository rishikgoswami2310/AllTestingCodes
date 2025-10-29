import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTripTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rishikgoswami\\Downloads\\selenium-java-4.28.1\\chromedriver-win64\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();

	      try {
	    	  driver.get("https://www.makemytrip.com/");	      
	   
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        
	        WebDriverWait wait = new WebDriverWait(driver,Duration.ofMinutes(10));
	       // WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Make My Trip']")));
	        
	           WebElement logo1= driver.findElement(By.xpath("//img[@alt='Make My Trip']"));
  	        String text= logo1.getAttribute("alt");
	        
	    	System.out.println(text);
	    	
	    	System.out.println("Successfully Tested");
	    	
	    	
	    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	    	
	      }
	      catch(Exception e)
	      {
	    	  
	    	  System.out.println("Logo Not Found: "+ e);
	      }
      finally {
	        driver.quit();
      }
		
	}

}
