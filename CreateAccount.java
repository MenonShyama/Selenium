package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {

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
		// Click on the "Accounts" tab.
		driver.findElement(By.xpath("//div[@class='x-panel-header']/a[contains(text(),'Accounts')]")).click();
		//Click on the "Create Account" button.
		driver.findElement(By.xpath("//div[@class='frameSectionBody']/ul/li/a[contains(text(),'Create Account')]")).click();
		//Enter an account name.
		driver.findElement(By.id("accountName")).sendKeys("shyamaaa");
		//Enter a description as"Selenium Automation Tester."
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		//Enter a Number Of Employees.
		driver.findElement(By.id("numberEmployees")).sendKeys("5");
		//Enter a Site Name as “LeafTaps”
		driver.findElement(By.id("officeSiteName")).sendKeys("Clt");
		//Click the "Create Account" button.
		driver.findElement(By.className("smallSubmit")).click();
		//Verify that the Title is displayed correctly
		Thread.sleep(1000);
		String title = driver.getTitle();
		if(title.equals("Account Details | opentaps CRM")) {
			System.out.println("Title Verified");
		}else {
			System.out.println("Title Mismatch");
		}
		//Close the browser window.
		driver.quit();
		

	}

}
