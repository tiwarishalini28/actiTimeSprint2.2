package actionsClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoveToElementByAxis {

	public static void main(String[] args) {
		//Launch the browser
		 WebDriver driver =	 new ChromeDriver();
				
		//maximize the browser
		 driver.manage().window().maximize();
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

}
