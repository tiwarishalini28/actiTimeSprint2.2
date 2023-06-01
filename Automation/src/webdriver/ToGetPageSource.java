package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPageSource {

	public static void main(String[] args) {
	//Launch the browser	
	ChromeDriver driver =	new ChromeDriver();
	
	driver.manage().window().maximize();
	
	//Navigate to the url
	driver.get("https://www.demo.actiTime.com/login.do");
	
	String pageSource = driver.getPageSource();
	//printing the source code of web page
	System.out.println(pageSource);
	
	if(pageSource.contains("actiTime"))
	{
		System.out.println("pass : the page contain the information");
	}
	else
		System.out.println("fail : the page contains the information");
	  driver.quit();	
		

	}

}
