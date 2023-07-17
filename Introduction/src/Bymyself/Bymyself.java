package Bymyself;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Bymyself {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		
				System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");		
				WebDriver driver= new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.get("https://rahulshettyacademy.com/locatorspractice/");
				//basically driver is an object of this ChromeDriver class.
		        //in this ChromeDriver class there is a method called findElement 
				//so WebDriver Interface exposed findElement method
				//ChromeDriver class is implementing this WebDriver interface 
				//ChromeDriver class is implementing the body of findElement exposed by the WebDriver interface
				driver.findElement(By.id("inputUsername")).sendKeys("rahul");
				driver.findElement(By.name("inputPassword")).sendKeys("hello123");
				driver.findElement(By.className("signInBtn")).click();	  
				System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
				driver.findElement(By.linkText("Forgot your password?")).click();
				driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
				
				

	}

}
