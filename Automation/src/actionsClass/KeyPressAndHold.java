package actionsClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyPressAndHold {

	public static void main(String[] args) {
		//Launch the browser
		 WebDriver driver =	 new ChromeDriver();
				
		//maximize the browser
		 driver.manage().window().maximize();
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Navigate to the url
       driver.get("https://www.kirupa.com/html5/press_and_hold.htm");
               
         Actions action =  new Actions(driver);
         action.keyDown(Keys.CONTROL).perform();
         
     List<WebElement> allLinks =   driver.findElements(By.xpath("//a[@class=\"nav-link\"]"));
     
           for(WebElement link:allLinks) {
    	   link.click();
    	 
    	 action.keyUp(Keys.CONTROL).perform();
     }
     

	}

}
