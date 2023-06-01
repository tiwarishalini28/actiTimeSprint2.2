package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheURL
{
      public static void main(String[] args)
	{
		 //Launching the empty chrome browser
		ChromeDriver driver =new ChromeDriver();
		//Navigating to the selenium.dev
		driver.get("https://www.selenium.der/");
		//fetching the url
		String url = driver.getCurrentUrl();// return type string   // String do net take any argument
		//Printing the url on console
		System.out.println(url);
		//Verifying whether the url is proper or not
        if(url.contains("selenium"))
        {
        	System.out.println("pass : the url is verified");
        }
        else
        	System.out.println("fail: the url is not verified");
     driver.close();//close= only parent browser close //or driver.quit(); // quit=both parent and child browser close
	}

}
