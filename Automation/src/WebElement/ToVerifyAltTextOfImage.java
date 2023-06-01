package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAltTextOfImage {

	public static void main(String[] args) {
WebDriver driver =	new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/search?q=selenium&rlz=1C1EJFC_enIN914IN914&sxsrf=APwXEddA3P2VsNDfzAf_3eC5U4AadsqbWw:1683102856791&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjU0Jjf3tj-AhVWcGwGHR5xD4wQ_AUoAXoECAEQAw&biw=1536&bih=754&dpr=1.25");
    WebElement secondImageOfSelenium =driver.findElement(By.xpath("//img[@class=\"rg_i Q4LuWd\"])[2]"));
   String altTextOfImage = secondImageOfSelenium.getAttribute("alt");
   
    if(altTextOfImage.contains("Selenium"))
    {
    	System.out.println("pass : the alt text has been verified");
    }
    else
    {
    	System.out.println("pass : the alt text hasnot been verified");
    }
	}

}
