package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;
public class ToNavigateToSubURL {

	public static void main(String[] args) throws MalformedURLException {
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Navigate to the main/parent url
		driver.get("https://selenium.dev/");
		
		//Navigate to the sub url
		URL subURL = new URL("https://oracle.com/in/");
         driver.navigate().to(subURL);
	}

}
