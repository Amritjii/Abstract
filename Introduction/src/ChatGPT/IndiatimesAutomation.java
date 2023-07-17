package ChatGPT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndiatimesAutomation {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
    	System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to the website
        driver.get("https://www.indiatimes.com/");

        // Find the entertainment section link and click on it
        WebElement entertainmentLink = driver.findElement(By.linkText("Entertainment"));
        entertainmentLink.click();

     // Wait for the page to load
        WebDriverWait wait = new WebDriverWait(driver, 100);
        wait.until(ExpectedConditions.titleContains("Entertainment"));

        // Perform further actions on the entertainment section if needed

        // Close the browser
        driver.quit();
    }
}

