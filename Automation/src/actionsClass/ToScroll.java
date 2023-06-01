package actionsClass;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToScroll {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		 WebDriver driver =	 new ChromeDriver();
				
		//maximize the browser
		 driver.manage().window().maximize();
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Navigate to the url
        driver.get("https://www.selenium.dev/");
        
       Actions action= new Actions(driver);
      action.sendKeys(Keys.PAGE_DOWN).perform();
      Thread.sleep(2000);
       action.sendKeys(Keys.PAGE_DOWN).perform();
       Thread.sleep(2000);
       action.sendKeys(Keys.PAGE_UP).perform();  
       Thread.sleep(2000);
       action.sendKeys(Keys.PAGE_UP).perform();

	}

}
