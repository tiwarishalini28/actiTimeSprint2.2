package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheDimension {

	public static void main(String[] args) {
		//Launch the browser
    ChromeDriver driver   = new ChromeDriver();
    //fetching the dimension of the browser
    Dimension dimension = driver.manage().window().getSize();
    System.out.println(dimension);
    //fetching the width
    int width = dimension.getWidth();
    //fetching the height
    int height = dimension.getHeight();
    //printing the height
    System.out.println("the height is :"+ height);
    //printing the width
    System.out.println("the width is:"+ width);

	}

}
