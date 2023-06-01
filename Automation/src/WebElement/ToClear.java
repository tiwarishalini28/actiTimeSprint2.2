package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClear {

	public static void main(String[] args) {
	  
       WebDriver driver =new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("file:///C:/Users/skyab/OneDrive/Desktop/Xpaths.html");
       WebElement zTextfield =driver.findElement(By.xpath("//input[@value='Z']"));
       zTextfield.clear();
       zTextfield.sendKeys("kuch bhi");
       
		
		
		
		
		
	}

}
