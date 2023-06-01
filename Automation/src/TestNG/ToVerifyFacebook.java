package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToVerifyFacebook {

	@Test
	public void toVerifyFacebook()
	{
	 WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("https://facebook.com/");
	  
	  if(driver.getTitle().equals("facebook")) {
		  System.out.println("pass: the title is verified");
		  }
		  else
		  {
			  System.out.println("fail: the title is not verified");
		  }
	  
	  
	
		
		
}
}