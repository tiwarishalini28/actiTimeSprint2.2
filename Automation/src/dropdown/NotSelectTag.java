package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NotSelectTag {

	public static void main(String[] args) {
		//Launch the browser
		 WebDriver driver =	 new ChromeDriver();
		//maximize the browser
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Navigate to the url
          driver.get("https://demoqa.com/select-menu");
        
               WebElement dropDown =  driver.findElement(By.xpath("//div[text()='Select Option']"));
               
              Actions action = new Actions(driver);
              action.sendKeys(dropDown, "A root").sendKeys(Keys.ENTER).perform();
	}

}
