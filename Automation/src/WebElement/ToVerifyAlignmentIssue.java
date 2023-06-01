package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAlignmentIssue {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("file:///C:/Users/skyab/OneDrive/Desktop/Automation1.html");
	       
	      Point usernameLocation = driver.findElement(By.id("123")).getLocation();
	      Point passwordLocation = driver.findElement(By.name("Shalini")).getLocation();
	     
	       System.out.println(usernameLocation);
	       System.out.println(passwordLocation);
	       
	     int usernameXCoordinate =  usernameLocation.getX();
	     int passwordXCoordinate =  passwordLocation.getX();
	     
	     if(usernameXCoordinate == passwordXCoordinate)
	     {
	    	 System.out.println("pass : the allignment is proper ");
	     }
	     else
	    	 System.out.println("pass : the allignment is not proper ");
	     

	}

}
