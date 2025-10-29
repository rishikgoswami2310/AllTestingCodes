import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class AutoComplete {
    public static void main(String[] args) throws InterruptedException {
       
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\rishikgoswami\\\\Downloads\\\\selenium-java-4.28.1\\\\chromedriver-win64\\\\chromedriver.exe");

       
        WebDriver driver = new ChromeDriver();

      
        driver.get("https://formy-project.herokuapp.com/autocomplete");

       
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.click();
try {
			
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
			{e.printStackTrace();
			}
		
        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
        
    	try {
			
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
			{e.printStackTrace();
			}
		

       
        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        autocompleteResult.click();

     
        driver.quit();
    }
}