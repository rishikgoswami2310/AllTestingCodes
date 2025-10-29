package SeleniumTest.TestingDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class KeyboardInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\rishikgoswami\\Downloads\\selenium-java-4.28.1");
				WebDriver driver = new ChromeDriver();
				
				driver.get("http://formy-project.herokuapp.com/keypress");
				
				WebElement name= driver.findElement(By.id("name"));
				name.click();
				name.sendKeys("RRisihsihk");
				
				WebElement button = driver.findElement(By.id("button"));
				button.click();
				
				driver.quit();
			}
		











	}


