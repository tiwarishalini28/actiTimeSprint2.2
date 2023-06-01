package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseAllBrowser {

		public static void main(String[] args) throws InterruptedException {
			//Launch the browser
			ChromeDriver driver	=new ChromeDriver();
			
			//Navigate to the url
			driver.get("https://demo.actitime.com/login.do");//always parent url in get
			
			//click on the link
			driver.findElement(By.linkText("actiTime Inc.")).click();
			
			//waiting for the browser
			 Thread.sleep(5000);
			 
			 //close the all the browsers
			 driver.quit();
			 }
		


	}


