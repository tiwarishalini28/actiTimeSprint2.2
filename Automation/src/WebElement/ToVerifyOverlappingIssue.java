package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyOverlappingIssue {

	public static void main(String[] args) {
	WebDriver driver =	new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("file:///C:/Users/skyab/OneDrive/Desktop/Automation1.html");
	
	Rectangle usernameRect =   driver.findElement(By.id("123")).getRect();
	
	Rectangle passwordRect =   driver.findElement(By.name("Shalini")).getRect();
	
	int usernameYCordinate = usernameRect.getY();
    int usernameHeight = passwordRect.getHeight();
   
    int usernameEndY =usernameYCordinate + usernameHeight;
    int passwordStartY = passwordRect.getY();
    
	   int Space = passwordStartY - usernameEndY;
	   System.out.println("the space is :"+ Space);

	   if (passwordStartY>=usernameEndY)
	   {
		   System.out.println("pass : there is no overlapping");
	   }
	   else
	   {
		   System.out.println("fail : there is overlapping");
	   }
	}



}
