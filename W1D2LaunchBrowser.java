package classroomassignment;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;

public class W1D2LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//add System property -> webdriver.chrome.driver
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
		//Open the Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the Url:: get
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Navigate backwards
		driver.navigate().back();
		
		//Print the Title
		String title = driver.getTitle();
		System.out.println(title);
		
		//Refresh the Screen/page
		driver.navigate().refresh();
		
		//get url using navigate
		//driver.navigate().to("https://google.co.in");
		
		//Find the method -> Print the Full URL
		String browserName = driver.getCapabilities().getBrowserName();
		System.out.println(browserName);
		
		//Get the Version
		String version = driver.getCapabilities().getVersion();
		System.out.println(version);
		
		//Get the Platform
		Platform platform = driver.getCapabilities().getPlatform();
		System.out.println(platform);

		//close the browser
		driver.close();
		
	}
	
}
