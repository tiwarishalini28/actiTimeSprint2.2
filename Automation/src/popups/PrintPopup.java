package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class PrintPopup {

	public static void main(String[] args) throws AWTException, FindFailed, InterruptedException {
		//Launching the browser
		WebDriver driver =	new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
      Robot robot =  new Robot();
      robot.keyPress(KeyEvent.VK_CONTROL);
      robot.keyPress(KeyEvent.VK_P);
      
        Thread.sleep(2000);
      
      robot.keyRelease(KeyEvent.VK_CONTROL);
      robot.keyRelease(KeyEvent.VK_P);
      
      robot.keyPress(KeyEvent.VK_ENTER);
      robot.keyRelease(KeyEvent.VK_ENTER);
      
     Pattern filename = new Pattern("C:\\Users\\skyab\\eclipse-workspace_selenium\\Automation\\TestData\\abcde123.PNG");
     Pattern saveButton = new Pattern("C:\\Users\\skyab\\eclipse-workspace_selenium\\Automation\\TestData\\efg234.PNG");
    
     Screen screen =  new Screen();  
     screen.wait(filename,20);
     screen.type(filename,"AutomationClass123");
     screen.click(saveButton);
    
    
      
		

	}

}
