package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToDeSelect {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		 WebDriver driver =	 new ChromeDriver();
				
		//maximize the browser
		 driver.manage().window().maximize();
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Navigate to the url
      driver.get("https://demoqa.com/select-menu");
      // clicking create new account button
      WebElement carDropdown = driver.findElement(By.id("cars"));
      Select select = new Select(carDropdown);
      select.selectByVisibleText("Volvo");
      
      Thread.sleep(2000);
      select.selectByVisibleText("Saab");
      
      Thread.sleep(2000);
      select.selectByVisibleText("Audi");
      
     // select.deselectByIndex(3);
     // Thread.sleep(2000);
     // select.deselectByValue("volvo");
      
     // Thread.sleep(2000);
     // select.deselectByValue("saab");
      
      select.deselectAll();
      

	}

}
