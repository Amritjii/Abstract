// Import the required libraries
package April23;
import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Confusedlogin {
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.confused.com/");
       
        driver.findElement(By.id("button-save-all")).click();
        driver.findElement(By.className("arrow-link__title")).click();
        driver.findElement(By.id("EmailAddress")).sendKeys("sinha.vaishali5@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("amrishali0520");
        driver.findElement(By.id("login")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//span[contains(text(),'Van')]")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//b[contains(text(),'Get a quote')]")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("AboutTheVan_RegistrationNumber")).click();
        driver.findElement(By.xpath("//input[@placeholder='Enter registration']")).sendKeys("YY08EDF");
        driver.findElement(By.xpath("//*[contains(text(),'Find van')]")).click();
        WebElement labelElement = driver.findElement(By.xpath("//label[@for='AboutTheVan_InformationCorrect_No' and contains(@class, 'btn') and contains(@class, 'btn--grey')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(labelElement).click().perform();

       /* WebElement dropdown = driver.findElement(By.id("AboutTheVan_BodyType"));

     // Select the 4th option from the drop-down
     Select select = new Select(dropdown);
     select.selectByIndex(3); */

       
        
        
    }
}
