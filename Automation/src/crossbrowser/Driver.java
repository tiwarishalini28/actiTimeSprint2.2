package crossbrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Driver {

	public static void main(String[] args) {
		crossBrowserTesting.test(new ChromeDriver());
		System.out.println("the application has been tested on chrome");
		
		crossBrowserTesting.test(new EdgeDriver());
		System.out.println("the application has been tested on edge");

	}

}
