package Simple;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class GoogleActions {
    public static void main(String[] args) {
       

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to Google
        driver.get("https://www.google.com");

        // Find the search box element by its name
        WebElement searchBox = driver.findElement(By.name("q"));

        // Type the query into the search box
        searchBox.sendKeys("Selenium WebDriver");

        // Submit the search query
        searchBox.submit();

        // Wait for the search results to load
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Click on the second search result
        WebElement secondResult = driver.findElement(By.xpath("(//h3)[2]"));
        secondResult.click();

        // Wait for the page to load
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Click on the "Download" link in the navigation bar
        WebElement downloadLink = driver.findElement(By.linkText("Download"));
        downloadLink.click();

        // Wait for the page to load
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Click on the "Javadoc" link in the "Downloads" section
        WebElement javadocLink = driver.findElement(By.xpath("//a[contains(@href,'docs/api')]"));
        javadocLink.click();

        // Wait for the page to load
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Click on the "Frames" link in the left-hand menu
        WebElement framesLink = driver.findElement(By.linkText("Frames"));
        framesLink.click();

        // Wait for the page to load
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Switch to the "Package" frame
        driver.switchTo().frame("packageListFrame");

        // Click on the "org.openqa.selenium" package link
        WebElement packageLink = driver.findElement(By.linkText("org.openqa.selenium"));
        packageLink.click();

        // Switch to the "Class" frame
        driver.switchTo().defaultContent();
        driver.switchTo().frame("packageFrame");
        WebElement classLink = driver.findElement(By.linkText("WebDriver"));
        classLink.click();

        // Switch to the "Class" frame
        driver.switchTo().defaultContent();
        driver.switchTo().frame("classFrame");

      
        // Click on the Google logo to go back to the homepage
        WebElement googleLogo = driver.findElement(By.id("hplogo"));
        googleLogo.click();

        // Wait for the page to load
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Enter a new search query
        searchBox = driver.findElement(By.name("q"));
        // Clear the search box
        searchBox.clear();

        // Type a new query into the search box
        searchBox.sendKeys("Java programming");

        // Submit the search query
        searchBox.submit();

        // Wait for the search results to load
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Click on the "Images" link at the top of the page
        WebElement imagesLink = driver.findElement(By.linkText("Images"));
        imagesLink.click();

        // Wait for the page to load
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Click on the first image result
        WebElement firstImage = driver.findElement(By.xpath("//img[@class='rg_i']"));
        firstImage.click();

        // Wait for the page to load
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Click on the "Visit page" button to view the image source
        WebElement visitPageButton = driver.findElement(By.xpath("//a[text()='Visit page']"));
        visitPageButton.click();

        // Wait for the page to load
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Close the current tab
        driver.close();

        // Switch to the previous tab
        String previousTab = driver.getWindowHandles().toArray()[0].toString();
        driver.switchTo().window(previousTab);

        // Click on the "Gmail" link in the top navigation bar
        WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
        gmailLink.click();

        // Wait for the page to load
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Click on the "Create account" button
        WebElement createAccountButton = driver.findElement(By.xpath("//a[contains(@href,'CreateAccount')]"));
        createAccountButton.click();

        // Wait for the page to load
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Fill out the registration form
        WebElement firstNameField = driver.findElement(By.name("firstName"));
        WebElement lastNameField = driver.findElement(By.name("lastName"));
        WebElement usernameField = driver.findElement(By.name("Username"));
        WebElement passwordField = driver.findElement(By.name("Passwd"));
        WebElement confirmPasswordField = driver.findElement(By.name("ConfirmPasswd"));

        firstNameField.sendKeys("John");
        lastNameField.sendKeys("Doe");
        usernameField.sendKeys("johndoe");
        passwordField.sendKeys("password");
        confirmPasswordField.sendKeys("password");

        // Submit the registration form
        WebElement submitButton = driver.findElement(By.id("accountDetailsNext"));
        submitButton.click();

        // Close the browser
        driver.quit();
    }
}
