package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationsPopup {

	public static void main(String[] args) {
		
	     String username = "admin";
	     String password ="admin";
		//Launching the browser
		WebDriver driver =	new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");

	}

}
