package classroomassignment;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.curve.Point;

public class W1D4LearnCheckBox {

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
				
		// Find the selenium checkbox
				WebElement eleCheckBox = driver.findElementByXPath("(//label[text()='Confirm Selenium is checked']/following::input)[1]");
				boolean checked = eleCheckBox.isSelected();
				System.out.println(checked);
				
				if(!checked) {
					eleCheckBox.click();
				}
				
				// isSelected -> radio button, checkbox and select.
				
				// isDisplayed -> Visible (true) 

	
		
	}
	

}
