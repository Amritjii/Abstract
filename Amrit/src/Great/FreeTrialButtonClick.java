package Great;
import java.time.Duration;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FreeTrialButtonClick {
    public static void main(String[] args) throws InterruptedException {
        // Create a new instance of the ChromeDriver class
        WebDriver driver = new ChromeDriver();

        // Navigate to the BrowserStack website
        driver.get("https://www.browserstack.com/");
        
      //Maximize current window
        driver.manage().window().maximize();

        //Delay execution for 2 seconds to view the maximize operation
        Thread.sleep(2000);     

        // Locate the "Accept Cookies" button using a CSS selector
        WebElement acceptCookiesButton = driver.findElement(By.cssSelector("button[id=accept-cookie-notification]"));

        // Wait for the "Accept Cookies" button to become clickable
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(100));		
        wait.until(ExpectedConditions.elementToBeClickable(acceptCookiesButton));

        // Click on the "Accept Cookies" button
        acceptCookiesButton.click();

        // Locate the "Free Trial" button using a CSS selector
       // WebElement freeTrialButton = driver.findElement(By.cssSelector("a.btn-secondary-white btn-md"));
        
        // Find the "Free Trial" button using its ID
        WebElement freeTrialButton1 = driver.findElement(By.id("free-trial-link-anchor"));
        
        // Click on the "Free Trial" button
        freeTrialButton1.click();
        
        WebElement fullname= driver.findElement(By.id("user_full_name"));
        fullname.click();
        fullname.sendKeys("Vaishali");
        
        WebElement email_login= driver.findElement(By.id("user_email_login"));
        email_login.click();
        email_login.sendKeys("amrit.prabhat@rvu.in");
        
        WebElement password= driver.findElement(By.id("user_password"));
        password.click();
        password.sendKeys("Amrishali@0520");
        
        WebElement tickbox= driver.findElement(By.id("tnc_checkbox"));
        tickbox.click();
        
        WebElement signmeup =driver.findElement(By.id("user_submit"));
        signmeup.click();
        
        WebElement signin =driver.findElement(By.id("user_submit"));
        signin.click();
        
        WebElement Justme =driver.findElement(By.className("choose-intent__container__options__blocks__individual-icon"));
        Justme.click();
        
        WebElement searchbroweserstack= driver.findElement(By.cssSelector("img.Search.logo"));
        searchbroweserstack.click();
        
        WebElement Instabutton = driver.findElement(By.cssSelector("path.url(#insta)"));
        Instabutton.click();
      
        
        // Close the driver
        //driver.quit();
    }
}



