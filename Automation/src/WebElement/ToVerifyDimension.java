package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyDimension {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demo.actitime.com/login.do");
	
	WebElement usernameTextField = driver.findElement(By.id("username"));
	WebElement passwordTextField = driver.findElement(By.name("pwd"));
	
	Dimension usernameDimension = usernameTextField.getSize();
	Dimension passwordDimension = usernameTextField.getSize();
	
	int usernameHeight = usernameDimension.getHeight();
	int usernameWidth = usernameDimension.getWidth();
	
	System.out.println("The width of username text field is :"+ usernameWidth);
	System.out.println("The height of username text field is :"+ usernameHeight);
	
	int passwordHeight = usernameDimension.getHeight();
	int passwordWidth = usernameDimension.getWidth();
	
	System.out.println("The width of password text field is :"+ usernameWidth);
	System.out.println("The height of password text field is :"+ usernameHeight);
	
	if(usernameHeight == passwordHeight && usernameWidth == passwordWidth)
	{
	   System.out.println("pass : the dimension has been verified");
	}
	else
	
		System.out.println("fail : the dimension has not been verified");
	   driver.quit();
	}
	
}
	
	
	
	
		
		
		
		
		
	
	
	

	


