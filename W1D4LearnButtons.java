package classroomassignment;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.curve.Point;

public class W1D4LearnButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//add System property -> webdriver.chrome.driver
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
		//Open the Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		
		//Wait (for the element to appear for the max time: 30)
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Load the Url:: get
		driver.get("https://leafground.com/pages/Button.html");
				
		//Click the button to travel to Home page
		WebElement eleButton1 = driver.findElementById("home");
		eleButton1.click();
		
		//come back to the page
		driver.navigate().back();
		
		//Find the position of button (X,Y)
		WebElement elePosition = driver.findElementById("position");
		Point location = (Point) elePosition.getLocation();
		System.out.println(location);
		
		System.out.println(((org.openqa.selenium.Point) location).getY());
		
		//what color am I?
		String color = driver.findElementById("color").getCssValue("background-color");
		System.out.println(color);
		
		//what is my size
		//Dimension dim = driver.findElementById("size").getSize();
		//System.out.println(dim);
	}
	

}
