package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		//Launch the browser
		 WebDriver driver =	 new ChromeDriver();
				
		//maximize the browser
		 driver.manage().window().maximize();
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Navigate to the url
         driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

          WebElement context =   driver.findElement(By.xpath("context-menu-one btn btn-neutral"));
          
          
          Actions action =    new Actions(driver);
            
          action.contextClick(context).perform();
                
	}

}
