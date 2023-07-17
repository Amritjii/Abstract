package ChatGPT;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AccordingyoutubeFlipkartSuggestion {
	public static void main(String[] args)  throws InterruptedException{

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		
		WebElement closeButton = driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z"));
		closeButton.click();


		driver.findElement(By.name("q")).sendKeys( "st");

		Thread.sleep(5000);


		List<WebElement> search_suggestion= driver.findElements (By.xpath( "//li[@class='Y5N33s']"));

		for (int i=0;i<search_suggestion.size();i++)
		{

		System.out.println(search_suggestion.get(i).getText());
		
		}

	}
}
