package dynamicContents;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

	static WebDriver driver;
	static Set<String> contentSet;
	
	@BeforeSuite
	public void setUp() {
		driver=new ChromeDriver();
        contentSet = new HashSet<>();

	}
	
	@AfterSuite
	public void tearDown() {
		
		if(driver!=null) {
		driver.close();
	}
}
}