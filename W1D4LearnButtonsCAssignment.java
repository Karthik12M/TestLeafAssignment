package classroomassignment;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.curve.Point;

public class W1D4LearnButtonsCAssignment {

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
		
		//without clicking, find the Url
		WebElement eleLink = driver.findElementByLinkText("Find where am supposed to go without clicking me");
		String linkWhere = eleLink.getAttribute("href");
		System.out.println(linkWhere);
				
		//verify am I broken?
		WebElement eleVerify = driver.findElementByLinkText("Verify am I broken?");
		eleVerify.click();
		String title = driver.getTitle();
		if (title.contains("404")) {
			System.out.println("Broken");
		}else {
			System.out.println("Looks good");
		}
		}
	}
	

}
