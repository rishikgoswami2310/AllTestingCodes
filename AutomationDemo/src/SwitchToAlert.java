import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
public class SwitchToAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\rishikgoswami\\Downloads\\selenium-java-4.28.1\\chromedriver-win64\\chromedriver.exe");

	        // Initialize WebDriver
	        WebDriver driver = new ChromeDriver();

	        // Open the target website
	        driver.get("https://formy-project.herokuapp.com/switch-window");

	        // Find and click the alert button
	        WebElement alertButton = driver.findElement(By.id("alert-button"));
	        alertButton.click();
	        
	        try {
				
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
				{e.printStackTrace();
				}
			

	        // Switch to alert and accept it
	        Alert alert = driver.switchTo().alert();
	        alert.accept();

	        
	        try {
				
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
				{e.printStackTrace();
				}
			
	        
	        // Close the browser
	        driver.quit();

	}

}
