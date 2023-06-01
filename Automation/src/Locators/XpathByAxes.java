package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes {

	public static void main(String[] args) {
       String productPrice="₹71,999";
      
		//Launch the browser
		WebDriver driver =	 new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to the url
		driver.get("https://www.amazon.in/s?k=iphone14&ref=nb_sb_noss");
		
		
		//Dynamic xpath : changing the xpath according to the requirement dynamically is called as Dynamic xpath
	WebElement price =driver.findElement(By.xpath("//span[text()='Apple iPhone 14 (128 GB) - Yellow']/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::span[text()='"+productPrice+"']"));
	String iphoneprice = price.getText();
	System.out.println(iphoneprice);

	}

}
