package Great;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample {
    public static void main(String[] args) {
        // Set the path of the ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create an instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to blazemeter.com
        driver.get("https://www.blazemeter.com/");

        // Find the "Login" button and click on it
        WebElement loginButton = driver.findElement(By.linkText("Log in"));
        loginButton.click();

        // Fill in the login form and submit it
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("your_email@example.com");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("your_password");

        WebElement submitButton = driver.findElement(By.tagName("button"));
        submitButton.submit();

        // Wait for the dashboard page to load and print the page title
        System.out.println(driver.getTitle());

        
    }
}
