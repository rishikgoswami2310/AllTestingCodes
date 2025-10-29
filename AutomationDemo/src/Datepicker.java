

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class Datepicker {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\rishikgoswami\\Downloads\\selenium-java-4.28.1\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.sendKeys("03/03/2020");
        
        
 try {
			
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
			{e.printStackTrace();
			}

 
        dateField.sendKeys(Keys.RETURN);
        
 try {
			
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
			{e.printStackTrace();
			}


        driver.quit();
    }
}