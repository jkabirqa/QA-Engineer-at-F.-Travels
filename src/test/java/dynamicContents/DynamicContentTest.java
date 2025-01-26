package dynamicContents;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicContentTest extends BaseTest {

    @Test
    public void testDynamicContent() {
        driver.get("https://the-internet.herokuapp.com/dynamic_content");
        // Refresh the page multiple times to capture dynamic content
        for (int i = 0; i < 10; i++) {
            String content = driver.findElement(By.id("content")).getText();
            contentSet.add(content);
            driver.navigate().refresh();
        
        }
    
    
        // Assert that we have captured unique content
        Assert.assertTrue(contentSet.size() > 1, "Dynamic content is not changing.");
    }
    }
