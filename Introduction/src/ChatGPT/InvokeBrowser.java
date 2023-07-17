package ChatGPT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeBrowser {
  public static void main(String[] args) {
    // Set the path to the chromedriver executable
    System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

    // Create an instance of the ChromeDriver
    WebDriver driver = new ChromeDriver();

    // Open the website
    driver.get("https://www.google.com");

    // Close the browser
    driver.quit();
  }
}


