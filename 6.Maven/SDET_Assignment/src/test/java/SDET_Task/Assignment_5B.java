package SDET_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_5B {
@Test
	public void testcase() {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        WebElement searchTextBox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        searchTextBox.sendKeys("W3Schools");
        searchTextBox.submit();
        WebElement firstSearchLink = driver.findElement(By.xpath("(//div[@class='g']//a)[1]"));
        firstSearchLink.click();
        String expectedURL = "https://www.w3schools.com/";
        String actualURL = driver.getCurrentUrl();
        boolean isNavigatedToW3Schools = actualURL.equals(expectedURL);
        System.out.println("It is navigated to W3Schools URL: " + isNavigatedToW3Schools);
        driver.quit();
	}
}
