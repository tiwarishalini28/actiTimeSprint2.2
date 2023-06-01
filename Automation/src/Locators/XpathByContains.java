package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains {

	public static void main(String[] args) {
		//Launch the browser
		WebDriver driver =	 new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to the url
		driver.get("https://www.selenium.dev/");
		
	WebElement para	=driver.findElement(By.xpath("//p[contains(text()]"));
	String text = para.getText();
	System.out.println();
	
	if(text.contains("browser"))
	{
		System.out.println("pass : the text is present in the paragraph");
		

	}
	else
	{	
		System.out.println("pass : the text is not present in the paragraph");
	
	}
	
	}

}
