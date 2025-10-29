import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rishikgoswami\\Downloads\\selenium-java-4.28.1\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/dragdrop");

        WebElement image = driver.findElement(By.id("image"));
        WebElement box = driver.findElement(By.id("box"));
        
  try {
			
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
			{e.printStackTrace();
			}


        Actions actions = new Actions(driver);
        actions.dragAndDrop(image, box).build().perform();
        
        try {
			
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
			{e.printStackTrace();
			}

        driver.quit();
		
	}

}
