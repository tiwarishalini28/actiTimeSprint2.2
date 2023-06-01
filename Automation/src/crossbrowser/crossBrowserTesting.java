package crossbrowser;

import org.openqa.selenium.WebDriver;

public class crossBrowserTesting {

	public static void test(WebDriver driver) 
	{
		driver.get("https://www.google.co.in/");
		
		String title = driver.getTitle();
		
		if(title.contains("Google"))
		{
		
		System.out.println("Pass : the title is verified");
		}
		else
		{
			System.out.println("fail : the title is not verified");
		}
		

	}

	
		
	}


