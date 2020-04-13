package homeworkassignment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class W1D2HFaceBook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();

		//To disable notification in Facebook homepage
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver =new ChromeDriver(options);
		
		//to launch url
		driver.get("https://www.facebook.com/");
		
		//to maximize the browser window
		driver.manage().window().maximize();
		
		//to find username field and give input
		driver.findElementById("email").sendKeys("XXXX@gmail.com");
		driver.findElementById("pass").sendKeys("XXXX");
		driver.findElementById("u_0_b").click();
		
		Thread.sleep(3000);
		
		//to logout
		//driver.findElementByClassName("u_1b_3").click();
		//driver.findElementByXPath("//span[contains(text(),'Log Out')]").click();
		
		//click logout
		driver.findElementById("userNavigationLabel").click();
		Thread.sleep(2000);
		driver.findElementByPartialLinkText("Log Out").click();
		
		
		//to close browser
		
	}

}
