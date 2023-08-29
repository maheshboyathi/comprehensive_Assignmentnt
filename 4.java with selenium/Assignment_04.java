package SDET_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_04 {

	public static void main(String[] args) {

		// Create a new instance of ChromeDriver

				WebDriverManager.chromedriver().setup();
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        // Navigate to Google
		        driver.get("https://www.google.com/");

		        // Find the search text box and enter "W3Schools"
		        WebElement searchTextBox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		        searchTextBox.sendKeys("W3Schools");
		        searchTextBox.submit();
		        
		        // Find and click on the first search link
		        WebElement firstSearchLink = driver.findElement(By.xpath("(//div[@class='g']//a)[1]"));
		        firstSearchLink.click();
		        // Verify if it navigates to the W3Schools URL
		        String expectedURL = "https://www.w3schools.com/";
		        String actualURL = driver.getCurrentUrl();
		        boolean isNavigatedToW3Schools = actualURL.equals(expectedURL);
		        System.out.println("It is navigated to W3Schools URL: " + isNavigatedToW3Schools);

		        // Close the browser
		        driver.quit();
	}

}
