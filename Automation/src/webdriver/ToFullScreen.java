package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToFullScreen {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get(");https://www.udemy.com/");
		driver.manage().window().maximize();
		
	}

}
