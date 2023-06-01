package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollAndClick {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		driver.findElement(By.linkText("About Selenium")).click();
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		
		
	}

}
