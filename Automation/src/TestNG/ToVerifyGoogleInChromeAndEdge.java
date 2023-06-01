package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ToVerifyGoogleInChromeAndEdge {
	
	WebDriver driver;

	@Parameters("browser")
    @Test
	public void toVerifyGoogle(String browser)
	{
		
	    if(browser.equals("chrome")) {
			driver =new ChromeDriver();
		}
	
		if(browser.equals("edge")) {
			driver =new ChromeDriver();
		}
			
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("https://Google.com/");
	  
	  if(driver.getTitle().contains("Google")) {
	  System.out.println("pass: the title is verified");
	  }
	  else
	  {
		  System.out.println("fail: the title is not verified");
	  }
		
	
	}

}
