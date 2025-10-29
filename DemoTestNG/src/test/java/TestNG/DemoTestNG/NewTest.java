package TestNG.DemoTestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class NewTest {

	@Test
	public void TestGoogle() throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium Automation", Keys.ENTER);
		System.out.println(driver.getTitle());
		/*
		 * String expectedTitle = "Selenium Automation - Google Search"; String actualTitle =
		 * driver.getTitle();
		 * 
		 * Assert.assertEquals(actualTitle, expectedTitle, "Title is mismatched");
		 */
		Thread.sleep(5000);
		driver.quit();
	}

	@Test
	public void TestFacebook() throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("rishikgoswami", Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
	}
}