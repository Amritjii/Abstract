package Great;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class StartFreeTrialButtonClick {
    public static void main(String[] args) {
        // Create a new instance of the ChromeDriver class
        WebDriver driver = new ChromeDriver();

        // Navigate to the mydukaan.io website
        driver.get("https://mydukaan.io/");

        // Use WebDriverWait to wait for the "Start free trial" button to be clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement startFreeTrialButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.download-app-btn.d-inline-flex.btn-0")));

        //<a target="_blank" rel="noopener noreferrer" class="download-app-btn d-inline-flex btn-0">Start free trial</a> this is the element find the unique css selector 
       // The unique CSS selector for the "Start free trial" button is "a.download-app-btn.d-inline-flex.btn-0".
        
        // Click on the "Start free trial" button
        startFreeTrialButton.click();
        
        

         //Close the driver
        //driver.close();
    }
}