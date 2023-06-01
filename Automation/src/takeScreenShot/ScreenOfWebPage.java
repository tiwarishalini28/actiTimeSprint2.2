package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenOfWebPage {

	public static void main(String[] args) throws IOException {
		//Launch the browser
		 WebDriver driver =	 new ChromeDriver();
		//maximize the browser
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Navigate to the url
        driver.get("//https://https://www.selenium.dev/");
        
      File source =  driver.findElement(By.id("login")).getScreenshotAs(OutputType.FILE);
      File destination = new File("./ScreenShots/seleniumHomePage.png");
      Files.copy(source, destination);
	}

}

