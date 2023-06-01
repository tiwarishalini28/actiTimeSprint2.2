package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyDisplayedOrNot {

	ta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		Thread.sleep(2000);
		WebElement emailTextBox = driver.findElement(By.id("email"));
		boolean displayed = emailTextBox.isDisplayed();public static void main(String[] args) throws InterruptedException {
		WebDriver driver =	new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://github.com/signup?ref_c
		
		if(displayed)
		{
			emailTextBox.sendKeys("shalini@gmail.com");
			System.out.println("the value has been passed");
		}
		else
		{
			System.out.println("the text box is not displayed");
		}
		

	}

}
