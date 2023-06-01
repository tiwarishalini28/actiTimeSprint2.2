package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ById {

	public static void main(String[] args) {
		//Launch
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	//Navigate to the url
	driver.get("file:///C:/Users/skyab/OneDrive/Desktop/Automation1.html");
	
	//identifying username textfield
	WebElement usernameTextfield = driver.findElement(By.id("123"));
	
	System.out.println(usernameTextfield);
	
	//passing the value in username textfield
	usernameTextfield.sendKeys("Baba Ramdev");
	
	//identifying password textfield
	WebElement passwordTextfield =driver.findElement(By.name("Shalini"));
	
	//passing the value in password textfield
	passwordTextfield.sendKeys("kuch bhi");
	
	

	}

}
