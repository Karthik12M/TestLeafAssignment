
/*Classroom Assignment
http://www.leafground.com/pages/Edit.html
1. Enter a value - sendkeys
2. Append & Tab - sendkeys("Babu",Keys.TAB)
3. get the text - getAttribute("Value")
4. Clear
5. confirm enabled
*/

package classroomassignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W1D3LeafGrdEditFields {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//add System property -> webdriver.chrome.driver
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
		//Open the Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		
		//wait (for the element to appear for the max time: 30)
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		
		//Load the Url:: get
		driver.get("http://leafground.com/pages/Edit.html");

		driver.manage().window().maximize();
		
		driver.findElementById("email").sendKeys("karthik1205@gmail.com");
		
		driver.findElementByXPath("//input[@value='Append ']").sendKeys("karthik1205@gmail.com",Keys.TAB);
		
		String attribute = driver.findElementByName("username").getAttribute("value");
		System.out.println(attribute);
		
		driver.findElementByXPath("(//input[@name='username'])[2]").clear();
		
		boolean enabled = driver.findElementByXPath("//input[@disabled='true']").isEnabled();
		System.out.println(enabled);
		
		Thread.sleep(6000);
		
		driver.close();
		
		
	}
	

}
