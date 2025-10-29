package TestSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objects.GoogleSearch;

public class TestMethodGoogleSearch {
	
WebDriver driver;
    
    @BeforeTest
    public void beforetest() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
    }
    
    @Test
    public void SearchOperation() {
        GoogleSearch page = new GoogleSearch(driver);
        page.searchGoogle("Facebook");
    }
    
    @AfterTest
    public void aftertest() {
        driver.quit();
    }

}
