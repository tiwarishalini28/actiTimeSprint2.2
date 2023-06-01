package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadPopup {

	public static void main(String[] args) throws AWTException  {
		//Launching the browser
				WebDriver driver =	new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				driver.get("https://demo.imacros.net/automate/Download");
				
				driver.findElement(By.linkText("Download")).click();
			//if the file download pop up comes then use this
			//Robot robot =	new Robot();
			//robot.keyPress(KeyEvent.VK_ENTER);
			//robot.keyRelease(KeyEvent.VK_ENTER);
			
				
				

	}

}
