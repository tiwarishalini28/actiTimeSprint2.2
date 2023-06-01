package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;
public class ToMaximize {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		//Launch the browser
	ChromeDriver driver =	new ChromeDriver();
	driver.get("https://www.google.com/");
	//To maximize the browser
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//To minimize is present only for selenium 4
	URL subURL = new URL("https://www.oracle.com/in/");
	driver.manage().window().minimize();
	driver.navigate().to(subURL);
	Thread.sleep(2000);
	
	

	}

}
