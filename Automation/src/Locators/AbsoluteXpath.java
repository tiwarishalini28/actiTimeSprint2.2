package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {
		//Launch the browser
		WebDriver driver =	 new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to the url
		driver.get("file:///C:/Users/skyab/OneDrive/Desktop/Xpaths.html");
		
		 WebElement aTextField = driver.findElement(By.xpath("html/body/div[1]/input[1]"));
		 
		 aTextField.sendKeys("kuch bhi");
		 

	}

}
