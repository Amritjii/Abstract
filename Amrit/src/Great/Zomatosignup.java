package Great;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zomatosignup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com");
		
		Thread.sleep(5000000);
		
		WebElement element = driver.findElement(By.cssSelector("a[id=free-trial-link-anchor-mobile]"));
		element.click();
		
	}
}
		