package autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSelectSuggestion {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		WebDriver driver =	 new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to the url
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		Thread.sleep(2000);
		List<WebElement> allSuggestions = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
				
	int noOfSuggestions = allSuggestions.size();
     System.out.println("The no of suggestions are :"+noOfSuggestions);
     
     for(WebElement suggestion:allSuggestions)
     {
    if(suggestion.getText().equals("selenium 3x")); {
    	suggestion.click();
    	break;
    }
     }

	}
}


