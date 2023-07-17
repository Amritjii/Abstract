package ChatGPT;

	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class SeleniumExample {
	  public static void main(String[] args) {
	    // Set up the ChromeDriver
	    System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
	    WebDriver driver = new ChromeDriver();

	    // Navigate to the URL
	    driver.get("https://www.w3schools.com");

	    // Find the button using its title attribute and click it
	    driver.findElement(By.cssSelector("a[title='CSS Tutorial']")).click();

	    // Close the browser
	    driver.quit();
	  }
	}



