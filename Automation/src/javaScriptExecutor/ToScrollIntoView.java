package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollIntoView {

	public static void main(String[] args) {
		//Launch the browser
		 WebDriver driver =	 new ChromeDriver();
		//maximize the browser
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Navigate to the url
         driver.get("https://www.selenium.dev/");
         WebElement newsHeading =   driver.findElement(By.xpath("//h2[text()='News']"));
      
       JavascriptExecutor js = (JavascriptExecutor)driver;
       js.executeScript("argument[0].scrollIntoView(true)", newsHeading);
	}

}
