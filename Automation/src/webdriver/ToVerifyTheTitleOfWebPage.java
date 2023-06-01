package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheTitleOfWebPage {
	public static void main(String[] args) {
		//Launch the browser
    ChromeDriver driver=new ChromeDriver();
    //Navigate to facebook
    driver.get("http://facebook.com/");
    //Verify the title 
    String titleoffacebook = driver.getTitle(); //return type String    //String do not take any argument
    System.out.println(titleoffacebook);
    if(titleoffacebook.contains("Facebook"))
    {
    	System.out.println("pass: the title is verified");
    }
    else
    System.out.println("fail: the title is not verified");	
    	
	}

}
