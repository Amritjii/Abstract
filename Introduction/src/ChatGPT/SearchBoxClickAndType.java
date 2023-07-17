package ChatGPT;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchBoxClickAndType {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com/");
		
		WebElement closeButton = driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z"));
		closeButton.click();

		// Find the search box element
		WebElement searchBox = driver.findElement(By.className("_3704LK"));

		// Click on the search box element
		searchBox.click();

		// Type "BBA" in the search box
		searchBox.sendKeys("p");
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//li[@class='Y5N33s']")));
		
		List<WebElement> search_suggestion = driver.findElements(By.xpath("//li[@class='Y5N33s']"));
		WebElement third_suggestion = search_suggestion.get(8);
		System.out.println(third_suggestion.getText());
		third_suggestion.click();


		
		
	}

}



