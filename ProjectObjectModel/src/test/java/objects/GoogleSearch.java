package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearch {
WebDriver driver;
    
    public GoogleSearch(WebDriver driver) {
        this.driver = driver;
    }
    
    By searchbox = By.xpath("//input[@name='q']");
    
    public void searchGoogle(String searchInput) {
        driver.findElement(searchbox).sendKeys(searchInput);
    }

}
