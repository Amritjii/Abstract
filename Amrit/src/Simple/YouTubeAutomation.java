package Simple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubeAutomation {

    public static void main(String[] args) throws InterruptedException {

        
        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to YouTube
        driver.get("https://www.youtube.com/");

        // Wait for the page to load
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        // Find the search box and type "racing cars"
        WebElement searchBox = driver.findElement(By.name("search_query"));
        searchBox.sendKeys("NAGIN honey singh");

        // Submit the search query
        WebElement searchButton = driver.findElement(By.id("search-icon-legacy"));
        searchButton.click();

        // Wait for the search results to load
        Thread.sleep(5000);

        // Click on the third search result
        WebElement thirdResult = driver.findElement(By.xpath("//div[@id='contents']//ytd-video-renderer[1]"));
        thirdResult.click();

        // Wait for the video to load
        Thread.sleep(5000);

        // Maximize the video player
        WebElement videoPlayer = driver.findElement(By.tagName("video"));
        videoPlayer.sendKeys("f");

        // Wait for the video player to maximize
        Thread.sleep(5000);

        // Set the volume to 40
        WebElement volumeSlider = driver.findElement(By.xpath("//div[@class='ytp-volume-panel']//button[@aria-label='Mute (m)']"));
        volumeSlider.click();

        WebElement volumeSliderLevel = driver.findElement(By.xpath("//div[@class='ytp-volume-panel']//input[@class='ytp-volume-slider']"));
        volumeSliderLevel.sendKeys("40");

        // Wait for the volume to set
        Thread.sleep(5000);

        // Close the browser
        driver.quit();
    }
}

