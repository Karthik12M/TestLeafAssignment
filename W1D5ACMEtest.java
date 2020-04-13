/*
 * ACME - Test APP
 * 
 * 1) Launch URL: https://acme-test.uipath.com/account/login
2) Enter UserName (kumar.testleaf@gmail.com) and TAB
3) Enter Password (leaf@12)
4) Click Login
5) Mouse Over on Vendors
6) Click Search Vendor
7) Enter Vendor Name (Blue Lagoon)
8) Click Search
9) Find the Country Name based on the Vendor
10) Click Log Out
11) Close browser
 */

package classroomassignment;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class W1D5ACMEtest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Launch the browser
		driver.get("https://acme-test.uipath.com/account/login");

		// Maximize the browser
		driver.manage().window().maximize();

		// Enter the username & password
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com", Keys.TAB);
		driver.findElementById("password").sendKeys("leaf@12");

		// Click the Login Button
		driver.findElementById("buttonLogin").click();
			
		Thread.sleep(5000);
		
		WebElement ele = driver.findElementByXPath("//button[text()[normalize-space()='Vendors']]");
        Actions builder = new Actions(driver);
        builder.moveToElement(ele).perform();
        
        //click search vendor
        driver.findElementByLinkText("Search for Vendor").click();
        //enter vendor id
        driver.findElementById("vendorName").sendKeys("Blue Lagoon");
	    //click search
        driver.findElementById("buttonSearch").click();
	    
        String Ctryname = driver.findElementByXPath("//td[text()='France']").getText();
	    System.out.println(Ctryname);
        
	    Thread.sleep (3000);
	    
	    driver.findElementByLinkText("Log Out").click();
        
        Thread.sleep (6000);
        
        driver.close();
        
        
	}

}
