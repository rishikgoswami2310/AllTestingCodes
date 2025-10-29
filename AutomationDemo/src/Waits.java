import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	
public static void main(String args[]) {
		
		implicitWait();
		//explicitWait(); 
		
}

private static void implicitWait() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rishikgoswami\\Downloads\\selenium-java-4.28.1\\chromedriver-win64\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	driver.get("https://formy-project.herokuapp.com/form");
	System.out.println(driver.getPageSource());
}

private static void explicitWait() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rishikgoswami\\Downloads\\selenium-java-4.28.1\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://formy-project.herokuapp.com/");
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofMinutes(10));
    WebElement firstResult = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-lg")));	
	System.out.println(firstResult.getText());
}
}