package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateBrowserHistory {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
	ChromeDriver driver = new ChromeDriver();
	//Navigate to google
	driver.get("https://www.google.com/");
	//Navigate to facebook 
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	driver.close();
	

	}

}
