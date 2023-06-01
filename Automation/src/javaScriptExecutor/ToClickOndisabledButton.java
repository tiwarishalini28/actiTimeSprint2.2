package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOndisabledButton {

	public static void main(String[] args) {
			//Launch the browser
			 WebDriver driver =	 new ChromeDriver();
			//maximize the browser
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			//Navigate to the url
	          driver.get("https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html");
	          
	          driver.findElement(By.xpath("//a[text()=' jdk-8u202-linux-arm32-vfp-hflt.tar.gz']")).click();
	       WebElement disabledButton = driver.findElement(By.xpath("//a[text()=' Download jdk-8u202-linux-arm32-vfp-hflt.tar.gz']"));
	       JavascriptExecutor js = (JavascriptExecutor)driver;
	       js.executeScript("argument[0].click", disabledButton);

	}

}
