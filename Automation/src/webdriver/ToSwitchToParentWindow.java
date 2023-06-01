package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToParentWindow {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch the browser
	ChromeDriver driver =	new ChromeDriver();
	
	driver.manage().window().maximize();
	//Navigate
	driver.get("https://www.demo.actitime.com/login.do");
	
	//fetching the id of the parent browser
	String parentId = driver.getWindowHandle(); 
	
	driver.findElement(By.linkText("actiTime Inc.") );
	//fetching all window  ids
	Set<String> allIds = driver.getWindowHandles();
	
	//iterating through collection
	for(String id : allIds)
	{
		//switching the driver control
		driver.switchTo().window(id); // ask in interview
		
		//checking if it is not parent id
		if(!id.equals(parentId));
		{
			//fetching the title of child
			String titleofChild = driver.getTitle();
			Thread.sleep(2000);
			driver.close();
			
			//printing the title of child on the console
			System.out.println(titleofChild);
			
		}
		
	}
 
	}

}
