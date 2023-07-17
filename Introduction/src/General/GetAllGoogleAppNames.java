package General;
 
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test; 

 
public class GetAllGoogleAppNames {
	
	@Test
	public void navigateThroughTabsAndGetTitle()
	{
		// Launching browser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();		
		
		
		// Google Apps is a SVG element. There are multiple svg element so I used multiple attributes.
		driver.findElement(By.xpath("//*[name()='svg' and @class='gb_We']")).click();
		
		// App names are shown in under an IFrame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@role='presentation']")));
		
		// Locating all app names. XPath is tricky as we can not use their values as they are dynamic
		List<WebElement> allMenus = driver.findElements(By.xpath("//div[@jsname and @jsaction]//li/a/span"));
		
		// Printing all app names Without stream
		for(WebElement menu : allMenus)
		{
			System.out.println(menu.getText());
		}
		
		System.out.println("====================================================");
		// With stream apis
		allMenus.stream().map(WebElement::getText).forEach(System.out::println);
		
		//quitting driver
		//driver.quit();
		
	}
 
}