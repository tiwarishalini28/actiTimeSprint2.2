package POMRepo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGeneratesStaleRefElements {

	public static void main(String[] args) throws InterruptedException {
		//Launching the browser
				WebDriver driver =	new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				driver.get("http://demo.actitime.com/login.do");
		WebElement username =driver.findElement(By.id("username")); //sendKeys("admin");
			
		username.sendKeys("admin");
		driver.navigate().refresh();
		Thread.sleep(2000);
		username.sendKeys("trainee");
			

	}

}
