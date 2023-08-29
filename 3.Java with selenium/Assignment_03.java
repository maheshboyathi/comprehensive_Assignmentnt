package SDET_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_03 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Navigate to Google
		driver.get("https://www.google.com/");

		// Verify Google logo presence
		WebElement googleLogo = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		boolean isGoogleLogoPresent = googleLogo.isDisplayed();
		System.out.println("Google logo is present: " + isGoogleLogoPresent);

		// Verify Search Text box presence
		WebElement searchTextBox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		boolean isSearchTextBoxPresent = searchTextBox.isDisplayed();
		System.out.println("Search Text box is present: " + isSearchTextBoxPresent);

		// Verify "Google Search" button name
		WebElement googleSearchButton = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']"));
		boolean isGoogleSearchButtonCorrect = googleSearchButton.isDisplayed();
		System.out.println("Google Search button name is correct: " + isGoogleSearchButtonCorrect);

		// Verify "I'm Feeling Lucky" button name
		WebElement luckyButton = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnI']"));
		boolean isLuckyButtonCorrect = luckyButton.isDisplayed();
		System.out.println("I'm Feeling Lucky button name is correct: " + isLuckyButtonCorrect);

		// Close the browser
		driver.quit();
	}
}