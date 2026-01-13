package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLeadAssignment {

	public static void main(String[] args) {

		ChromeOptions option=new ChromeOptions();
		option.addArguments("guest");
		//Initialize the WebDriver (ChromeDriver).
		ChromeDriver driver=new ChromeDriver(option);
		//Load the URL http://leaftaps.com/opentaps/.
		driver.get("http://leaftaps.com/opentaps/");
		//Maximize the browser window.
		driver.manage().window().maximize();
		//Enter a username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//Enter a password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click the "Login" button.
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on the"CRM/SFA" link.
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		//Click on the "Leads" tab. 
		driver.findElement(By.xpath("//div[@class='x-panel-header']/a[contains(text(),'Leads')]")).click();
		//Click on the "Create Lead" button.
		driver.findElement(By.xpath("//div[@class='frameSectionBody']/ul/li/a[contains(text(),'Create Lead')]")).click();
		//Enter a FirstName.
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("shyama");
		//Enter a LastName.
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("menon");
		//Enter a CompanyName.
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		//Enter a Title .
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Test");
		//Click the "Create Lead" button.
		driver.findElement(By.className("smallSubmit")).click();
		// Verify that the Title is displayed correctly.
		String title = driver.getTitle();
		if(title.equals("View Lead | opentaps CRM")) {
			System.out.println("Title Verified");
		}else {
			System.out.println("Title Mismatch");
		}
		//Close the browser window.
		driver.quit();
		
		
		
	}

}
