import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class ScrollToElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rishikgoswami\\Downloads\\selenium-java-4.28.1\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        
        name.click();
        
    	try {
			
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
			{e.printStackTrace();
			}
		
        
        name.sendKeys("Rishik Goswami");

        WebElement date = driver.findElement(By.id("date"));
        
       name.click();
        
    	try {
			
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
			{e.printStackTrace();
			}
		
        
        date.sendKeys("16/02/2025");
        
        try {
			
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
			{e.printStackTrace();
			}
		

        driver.quit();
	}

}
