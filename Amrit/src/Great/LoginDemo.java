package Great;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {
    public static void main(String[] args) {
              
        // Initialize a new instance of the ChromeDriver class
        WebDriver driver = new ChromeDriver();
        
        // Navigate to the login page
        driver.get("https://demo.applitools.com/");
        
        // Find the username and password text fields and the sign in button
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement signInButton = driver.findElement(By.id("log-in"));
        
        // Enter the username and password
        usernameField.sendKeys("your-username");
        passwordField.sendKeys("your-password");
        
        // Click the sign in button
        signInButton.click();
        
        // Find the input field
        WebElement inputField = driver.findElement(By.cssSelector("input[placeholder='Start typing to search...']"));
        
        // Click the input field
        inputField.sendKeys("Home");
        
        
        
        // Close the browser
        //driver.quit();
    }
}
