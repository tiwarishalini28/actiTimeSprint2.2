package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByClassName {

	public static void main(String[] args) {
		
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("file:///C:/Users/skyab/OneDrive/Desktop/Automation1.html");
	
	WebElement header = driver.findElement(By.className("Shalini"));
	
	String text =header.getText();
	
	System.out.println(text);
	
	

	}

}
