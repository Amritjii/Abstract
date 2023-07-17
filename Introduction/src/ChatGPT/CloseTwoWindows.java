package ChatGPT;
	
	import java.util.concurrent.TimeUnit;
    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class CloseTwoWindows {
	    public static void main(String[] args) {
	        // Set the path to the Chrome driver executable
	        System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");

	        // Initialize the Chrome driver
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


	        // Open two windows to Google.com
	        driver.get("https://www.google.com");
	         driver.get("https://www.aktu.ac.in");
	        
	            

	        // Get a reference to the remaining window and close it
	        driver.close();
	    }
	}



