
//Learning on Partial link Text

package classroomassignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W1D3LeafTapsLocators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//add System property -> webdriver.chrome.driver
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
		//Open the Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		
		//wait (for the element to appear for the max time: 30)
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		
		//Load the Url:: get
		driver.get("http://leaftaps.com/opentaps/control/main");

		
		WebElement eleH2 = driver.findElementByTagName("h2");
		String text = eleH2.getText();
		System.out.println(text);
		
		
	}
	

}
