
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class SearchAutomation {

	public static void main(String[] args) throws InterruptedException{
		
		
		
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rishikgoswami\\Downloads\\selenium-java-4.28.1\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://google.com");
			
			WebElement searchBox = driver.findElement(By.name("q"));
			
			searchBox.click();
			
			searchBox.sendKeys("Selenium Automation");
			searchBox.submit();
			
			try {
				
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
				{e.printStackTrace();
				}
			
			
		driver.quit();
	}
	}
	


