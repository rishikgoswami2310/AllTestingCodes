import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SwitchToActiveWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Set path for ChromeDriver (Update path as per your system)
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rishikgoswami\\Downloads\\selenium-java-4.28.1\\chromedriver-win64\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open the target website
        driver.get("https://formy-project.herokuapp.com/switch-window");

        // Find and click the "New Tab" button
        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();

        // Store the original window handle
        String originalHandle = driver.getWindowHandle();
        
 try {
			
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
			{e.printStackTrace();
			}
		

        // Switch to the new window
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        // Switch back to the original window
        driver.switchTo().window(originalHandle);
        
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
