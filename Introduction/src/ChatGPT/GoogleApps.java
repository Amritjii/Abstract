package ChatGPT;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleApps {
  public static void main(String[] args) {
    // Set the path to the Chrome driver
    System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");

    // Initialize a web driver
    WebDriver driver = new ChromeDriver();

    // Navigate to the Google apps page
    driver.get("https://www.google.com/intl/en/about/products/");

    // Find all the app elements
    List<WebElement> apps = driver.findElements(By.cssSelector(".KDSgVe div a"));

    // Print the names of all the apps
    for (WebElement app : apps) {
      System.out.println(app.getAttribute("title"));
    }

 // Locate the film using its text
    WebElement film = driver.findElement(By.xpath("//*[@id='youtube-player-492619']/div[2]"));
    film.click();
  }
}
