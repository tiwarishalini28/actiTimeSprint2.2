package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTagname {
public static void main(String[] args) {
			WebDriver driver =	new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://demo.actitime.com/login.do");
		WebElement checkbox =driver.findElement(By.id("keepLoggedInCheckBox"));
		String checkboxTagname = checkbox.getTagName();
		System.out.println(checkboxTagname);
		
		if(checkboxTagname.equals("input")){
		checkbox.click();
		}
		else
		
			System.out.println("the tag name is not proper");
		
		

	}

}

