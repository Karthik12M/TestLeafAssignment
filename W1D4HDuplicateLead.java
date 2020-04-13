/*
* Duplicate Lead
http://leaftaps.com/opentaps/control/main
 
1	Launch the browser
2	Enter the username
3	Enter the password
4	Click Login
5	Click crm/sfa link
6	Click Leads link
7	Click Find leads
8	Click on Email
9	Enter Email
10	Click find leads button
11	Capture name of First Resulting lead
12	Click First Resulting lead
13	Click Duplicate Lead
14	Verify the title as 'Duplicate Lead'
15	Click Create Lead
16	Confirm the duplicated lead name is same as captured name
17	Close the browser (Do not log out)
 */

package homeworkassignment;

		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class W1D4HDuplicateLead {

			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub

				System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.get("http://leaftaps.com/opentaps/control/main");
				
				driver.manage().window().maximize();
				
				driver.findElementById("username").sendKeys("DemoSalesManager");
				driver.findElementById("password").sendKeys("crmsfa");
				driver.findElementByClassName("decorativeSubmit").click();
				driver.findElementByLinkText("CRM/SFA").click();
				driver.findElementByXPath("//a[@href='/crmsfa/control/leadsMain']").click();
				driver.findElementByLinkText("Find Leads").click();
				driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[3]").click();
				driver.findElementById("ext-gen282").sendKeys("babu@testleaf.com");
				driver.findElementByClassName("x-btn-text").click();
				
				//11. Capture name of First Resulting lead
				WebElement capturefirstlead = driver.findElementByXPath("//table[@class='x-grid3-row-table']");
				String fleadid = capturefirstlead.getText();
				System.out.println(fleadid);
				capturefirstlead.click();
						
				//12. Click First Resulting Lead
				driver.findElementByLinkText("Babu").click();
				
				//13.Click Duplicate Lead
				driver.findElementByLinkText("Duplicate Lead").click();
				
				//14. Verify the title as 'Duplicate Lead'
				String title = driver.getTitle();
				
				if (driver.getTitle().equalsIgnoreCase("Duplicate Lead | opentaps CRM")) {

					System.out.println("lead created successfully");
				}
				else {
					System.out.println("duplicate lead name is not same");
				}
				
				//15. Click Create Lead
				driver.findElementByClassName("smallSubmit").click();
				
				//16. Confirm the duplicate lead name is same as the captured name
				WebElement firstname = driver.findElementById("viewLead_firstName_sp");
				String text = firstname.getText();
				String fname="Babu";
				if (text.equalsIgnoreCase(fname)) {
					System.out.println("verified");
				}
				else {
					System.out.println("not verified");
				}
							
				Thread.sleep(6000);
			
				//17. Close Browser (Do not log out)
				driver.close();
			}
			
			

		}
