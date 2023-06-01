package actionsClass;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToSearchAndPressEnter {

	public static void main(String[] args) {
		//Launch the browser
		 WebDriver driver =	 new ChromeDriver();
				
		//maximize the browser
		 driver.manage().window().maximize();
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Navigate to the url
       driver.get("https://www.google.com/");
       
      WebElement textField= driver.findElement(By.name("q"));
       
       Actions action =  new Actions(driver);
       action.sendKeys(textField, "Pen Testing").sendKeys(Keys.ENTER).perform();
       


	}

}
