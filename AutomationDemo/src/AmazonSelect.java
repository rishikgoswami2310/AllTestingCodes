import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonSelect {
	public static void main(String args[]) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rishikgoswami\\Downloads\\selenium-java-4.28.1\\chromedriver-win64\\chromedriver.exe");
	
	WebDriver driver1 = new ChromeDriver();

	
	WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(10));
	driver1.get("https://www.amazon.in/");
	driver1.manage().window().maximize();

	driver1.findElement(By.id("twotabsearchtextbox")).sendKeys("iPad" + Keys.RETURN);
	 WebElement sortDropdown = driver1.findElement(By.id("s-result-sort-select"));

     
     Select select = new Select(sortDropdown);
     
     
  
     List<WebElement> allOptions = select.getOptions();
     
   
     for (int i = 0; i < allOptions.size(); i++) {
        
          select.selectByIndex(i);
         
        
         System.out.println("Selected option: " + allOptions.get(i).getText());
         
         Thread.sleep(5000);
     }

     
     
     Thread.sleep(5000);

     driver1.quit();

}}