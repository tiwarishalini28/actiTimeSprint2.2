package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollByAxis {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		 WebDriver driver =	 new ChromeDriver();
		//maximize the browser
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Navigate to the url
        driver.get("https://www.selenium.dev/");
         JavascriptExecutor js = (JavascriptExecutor)driver;
         js.executeAsyncScript("window.scrollBy(0, 500)");
         Thread.sleep(2000);
         js.executeAsyncScript("window.scrollBy(0, 400)");
         Thread.sleep(2000);
         js.executeAsyncScript("window.scrollBy(0, -200)");
        	

	}

	
}
