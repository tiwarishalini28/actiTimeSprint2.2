package webdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPosition {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	Point pos= driver.manage().window().getPosition();
	
	System.out.println();
	int xCoordinate= pos.getX();
	int yCoordinate= pos.getY();
	
	System.out.println("the X Coordinate is :"+ xCoordinate);
	System.out.println("the Y Coordinate is :"+ yCoordinate);
	
	

	}

}
