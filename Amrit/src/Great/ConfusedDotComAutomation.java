package Great;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfusedDotComAutomation {
    public static void main(String[] args) {
     

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to Confused.com
        driver.get("https://www.confused.com/");
        
        driver.findElement(By.id("button-save-all")).click();

        // Find the car insurance button and click on it
        WebElement carInsuranceButton = driver.findElement(By.xpath("//a[@class='navigation__link--motor']"));
        carInsuranceButton.click();

        // Fill in the postcode field with a valid postcode
        WebElement postcodeField = driver.findElement(By.id("motorQuestions_my-car_0_registrationNumber"));
        postcodeField.sendKeys("AB12 3CD");

        // Find the find my car button and click on it
        WebElement findMyCarButton = driver.findElement(By.xpath("//button[@data-locator='vehicle-search-submit']"));
        findMyCarButton.click();

        // Wait for the results to load
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}
