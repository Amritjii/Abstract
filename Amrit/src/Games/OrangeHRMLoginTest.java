

package Games;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMLoginTest {
	public void TestGoogle() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement usernameField = driver.findElement(By.name("username"));
		WebElement passwordField = driver.findElement(By.name("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
        usernameField.sendKeys("Admin");
        passwordField.sendKeys("admin123");
        loginButton.click();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		 
    }
}
