package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeftClick {

	public static void main(String[] args) {
		//Launch the browser
		WebDriver driver =	 new ChromeDriver();
				
	    //maximize the browser
		driver.manage().window().maximize();
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demo.actitime.com/login.do");
                  
        WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
              
        Actions action =    new Actions(driver);
          
        action.click(checkbox).perform();
              
              
	}

}
