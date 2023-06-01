package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentAndDependent {

	public static void main(String[] args) {
		//Launch the browser
		WebDriver driver =	 new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to the url
		driver.get("https://www.flipkart.com/search?q=iphone%2013&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		
	WebElement Starlightprice =driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Starlight, 128 GB)']/ ../..//div[text()='₹61,999']"));
	String price = Starlightprice.getText();
	System.out.println(price);
	


	}

}
