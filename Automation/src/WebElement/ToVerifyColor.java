package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyColor{
	
		public static void main(String[] args) {
			WebDriver driver =	new ChromeDriver();
					
					driver.manage().window().maximize();
					
					driver.get("https://www.facebook.com/");
					
	String color = driver.findElement(By.name("login")).getCssValue("background-color");
	
	System.out.println(color);
					

	}

}
