package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPassValueTodisabledTextField {

	public static void main(String[] args) {
		//Launch the browser
		 WebDriver driver =	 new ChromeDriver();
		//maximize the browser
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Navigate to the url
          driver.get("https://demoapp.skillrary.com/");
        WebElement disabledTextField =  driver.findElement(By.xpath("//input[@class='form-control']"));
        
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("argument[0].value='shalini', disabledTextField");

	}

}
