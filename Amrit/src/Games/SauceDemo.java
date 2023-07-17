package Games;



		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class SauceDemo {
		  public static void main(String[] args) {
		    
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.saucedemo.com/");

		    // Login
		    driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
		    driver.findElement(By.id("password")).sendKeys("secret_sauce");
		    driver.findElement(By.className("btn_action")).click();

		    // Add product to cart
		  driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();



		    //driver.quit();
		  }
		}


	


