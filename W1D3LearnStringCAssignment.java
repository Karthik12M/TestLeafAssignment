
//Learn String

package classroomassignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class W1D3LearnStringCAssignment {
	
	public static void main(String[] args){

		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		
		
		//wait (for the element to appear for the max time: 30)
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
				
		//Load the Url:: get
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Find the User Name
		driver.findElementById("username").sendKeys("DemoSalesManager");
				
		//Find the Password and interact
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
				
		//Click the Login
		driver.findElementByClassName("decorativesubmit").click();
		
		
		
			}
	
	

}
