import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class KeyboardAndMouseInput {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\rishikgoswami\\\\Downloads\\\\selenium-java-4.28.1\\\\chromedriver-win64\\\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();

	        driver.get("https://formy-project.herokuapp.com/keypress");

	        WebElement name = driver.findElement(By.id("name"));
	        name.click();
	        name.sendKeys("Rishik Goswami");

	        WebElement button = driver.findElement(By.id("button"));
	        button.click();

	        
	try {
				
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
				{e.printStackTrace();
				}
			
	        driver.quit();

	}

}
