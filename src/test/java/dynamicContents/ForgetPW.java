package dynamicContents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgetPW extends BaseTest{
	
	@Test
	public void testwithvalidemailformat() {

		
		driver.get("https://the-internet.herokuapp.com/forgot_password");
		WebElement we = driver.findElement(By.id("email"));
		we.sendKeys("ft@gmail.com");
		we.click();
				
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement resultMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("content")));
		
       // WebElement successMessage = driver.findElement(By.id("content"));
       try {
        String actualmsg=resultMsg.getText();
        Assert.assertTrue(actualmsg.contains("Your e-mail's been sent!"), "Success message is displayed");
       }catch(AssertionError e) {
    	   e.printStackTrace();
       }
	}
	
	@Test
	public void testwithinvalidemailformat() {

		
		driver.get("https://the-internet.herokuapp.com/forgot_password");
		WebElement we = driver.findElement(By.id("email"));
		we.sendKeys("ft@democom");
		we.click();
				
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement resultMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("content")));
		
       // WebElement successMessage = driver.findElement(By.id("content"));
        try {
        String actualmsg=resultMsg.getText();
        Assert.assertTrue(actualmsg.contains("Your e-mail's been sent!"), "Success message is not displayed");
        }catch(AssertionError e) {
        	e.printStackTrace();
        }
	}

	@Test
	public void testwithEmptyemail() {

		
		driver.get("https://the-internet.herokuapp.com/forgot_password");
		WebElement we = driver.findElement(By.id("email"));
		we.sendKeys("");
		we.click();
				
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement resultMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("content")));
		
       // verifying forget pw with empty email.
        try {
        String actualmsg=resultMsg.getText();
        Assert.assertTrue(actualmsg.contains("email not available"), "error msg not displayed");
        }catch(AssertionError e) {
        	e.printStackTrace();
        }
	}

}
