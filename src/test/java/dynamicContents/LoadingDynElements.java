package dynamicContents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoadingDynElements {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.dirver", "C:\\Users\\jkabi\\eclipse-workspace\\com.theInternet\\src\\test\\resources\\execute files\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();

        // Navigate to the dynamic loading page
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

        // Click the "Start" button to load the element
        WebElement startButton = driver.findElement(By.xpath("//div[@id='start']/button"));
        startButton.click();

        // Wait for the loading to complete and the element to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loadedElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));


        // Verify that the loaded element is displayed
        if (loadedElement.isDisplayed()) {
            System.out.println("Test Passed: The element is displayed.");
        } else {
            System.out.println("Test Failed: The element is not displayed.");
        }
    
        // Close the browser
        driver.quit();
    }
}

