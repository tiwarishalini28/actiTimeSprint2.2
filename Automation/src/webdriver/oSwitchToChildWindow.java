package webdriver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class oSwitchToChildWindow {

	public static void main(String[] args) {
		
	ChromeDriver driver =	new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.demo.actiTime.com/login.do");
	
	String ParentId = driver.getWindowHandle();
	
	driver.findElement(By.linkText("actiTime Inc."));
	Set<String> allIDs = driver.getWindowHandles();
	
	for(String id : allIDs)
	{
		driver.switchTo().window(id);
		if(!id.equals(ParentId))
		{
			driver.close();
	}
	
	
	

	}

}
