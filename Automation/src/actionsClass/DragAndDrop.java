package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		//Launch the browser
		WebDriver driver =	 new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
	    WebElement capital1 =	driver.findElement(By.id("box3"));
	    WebElement country1 = driver.findElement(By.id("box103"));
	
        Actions action= new Actions(driver);
         action.dragAndDrop(capital1, country1).perform();

		

	}

}
