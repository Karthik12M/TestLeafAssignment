/*
 1. Create a New Class
 2. Launch Chrome
 3. Load Gmail Link
 4. Print the Title
 5. Refresh the Page
 6. Close the Browser
 */

package classroomassignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class W1D2LoadGmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//Launch the Url - Get
		driver.get("https://google.co.in");
		
		//Print the title
		String title = driver.getTitle();
		System.out.println(title);
		
		//Refresh the Page
		driver.navigate().refresh();
		
		//Close the Browser
		driver.close();
		
	}

}
