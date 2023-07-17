package Great;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selectSuggestions {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com/");
		
		// Maximize the window
        driver.manage().window().maximize();

		WebElement closeButton = driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z"));
		closeButton.click();

		// Find the search box element
		WebElement searchBox = driver.findElement(By.className("_3704LK"));

		// Click on the search box element
		searchBox.click();

		// Type "BBA" in the search box
		searchBox.sendKeys("chair");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(100));		
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//li[@class='Y5N33s']")));

		List<WebElement> suggestion = driver.findElements(By.xpath("//li[@class='Y5N33s']"));

		for (int i = 0; i < suggestion.size(); i++) {
			System.out.println(suggestion.get(i).getText());

		}

	}
}

