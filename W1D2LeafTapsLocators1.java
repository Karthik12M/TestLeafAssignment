package classroomassignment;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W1D2LeafTapsLocators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//add System property -> webdriver.chrome.driver
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
		//Open the Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the Url:: get
		driver.get("https://leaftaps.com/opentaps/control/main");
				
		//Find the User name
		WebElement eleUserName = driver.findElementById("username");
		eleUserName.clear();
		eleUserName.sendKeys("DemoSalesManager");

		//Or Another way to Find the User Name
		//driver.findElementById("username").sendKeys("DemoSalesManager");
		
		//Find the Password and interact
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
		//Click the Login
		driver.findElementByClassName("decorativesubmit").click();
		
		//Click on CRM SFA
		driver.findElementByLinkText("CRM/SFA").click();

	}
	

}
