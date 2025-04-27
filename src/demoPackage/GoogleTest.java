package demoPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTest {

	@Test   // TestNG will detect and run this method
    public void openGoogle() {

        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "path\\chromedriver_win32\\chromedriver.exe"); 
        
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://www.google.com");   // Optional: Open Google to test

        // Close the browser
        driver.quit();
    }
}
