package popups;

import java.time.Duration;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.tigervnc.rfb.Screen;

public class FileUploadUsingSikuli {

	public static void main(String[] args) {
		//Launching the browser
				WebDriver driver =	new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
				driver.findElement(By.xpath("//button[text()=\"Upload Resume\"]")).click();
				
			Pattern filename= new Pattern("");
			Pattern openButton = new Pattern("");
			
		Screen screen=	new Screen();
		
			
				

	}

}
