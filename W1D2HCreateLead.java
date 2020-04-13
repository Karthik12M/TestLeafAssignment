package homeworkassignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W1D2HCreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		
		//loading url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//find user name
		WebElement eleusername = driver.findElementById("username");
		eleusername.sendKeys("DemoSalesManager");
		
		//find & type password
		//WebElement elepassword = driver.findElementById("password");
		//elepassword.sendKeys("crmsfa");
		
		//find & type password in single line
		driver.findElementById("password").sendKeys("crmsfa");
		
		//find & click Login button (Click)
		//driver.findElementByClassName("decorativeSubmit").click();
		
		//find & click Login button (Submit)
		driver.findElementByClassName("decorativeSubmit").submit();
		
		//find & click CRM/SFA (hyperlink) - text in black color
		driver.findElementByLinkText("CRM/SFA").click();
		
		//to maximize the browser window
		driver.manage().window().maximize();
				
		//find & click Create Lead in the left side menu
		//driver.findElementById("ext-gen41").click();
		driver.findElementByLinkText("Create Lead").click();
		
		
		//enter mandatory fields - Company Name, First Name & Last Name
		//driver.findElementByClassName("companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		//driver.findElementByClassName("firstName").sendKeys("Karthikkumar");
		driver.findElementById("createLeadForm_firstName").sendKeys("Karthikkumar");
		//driver.findElementByClassName("lastName").sendKeys("Premchandran");
		driver.findElementById("createLeadForm_lastName").sendKeys("Premchandran");
	
		//find & click Create Lead command button at bottom of the screen
		//driver.findElementById("ext-gen41").click();
		driver.findElementByName("submitButton").click();
		
		//refresh page
		//driver.navigate().refresh();
		
		//Find and Click Logout
		driver.findElementByLinkText("Logout").click();
		
		//close browser
		driver.close();
	}

}
