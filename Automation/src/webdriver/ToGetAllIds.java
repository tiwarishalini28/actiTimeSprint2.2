package webdriver;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetAllIds {

	public static void main(String[] args) {
		
	ChromeDriver driver =	new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com/");
	
	driver.switchTo().newWindow(WindowType.TAB);
	
	driver.navigate().to("https://www.facebook.com/");
	
	String allIds = driver.getWindowHandle();
	
	System.out.println(allIds);
	
	}
}

