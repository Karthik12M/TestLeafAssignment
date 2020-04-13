
//Learning on Partial link Text

package classroomassignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W1D3LeafGrdPlaywthHyperlinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//add System property -> webdriver.chrome.driver
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
		//Open the Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		
		//wait (for the element to appear for the max time: 30)
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		
		//Load the Url:: get
		driver.get("http://leafground.com/pages/Link.html");

		//Click on the content that has "am"
		//driver.findElementByPartialLinkText("am").click();
	
		//Click on the link which is not available - you will get NoSuchElementFound Exception, which is a Java class by Selenium
		driver.findElementByPartialLinkText("am - Karthik").click();
					
		/*Verify Title
		String title = driver.getTitle();
		System.out.println(title); */
		
		//leaftaps.com
		WebElement eleH2 = driver.findElementByTagName("h2");
		String text = eleH2.getText();
		System.out.println(text);
		
		
	}
	

}
