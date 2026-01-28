package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MergeContacts {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		//Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver(options);
		//Maximize the browser window
		driver.manage().window().maximize();
		//Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Load the URL (http://leaftaps.com/opentaps/control/login)
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Enter the username and password.
		WebElement usernameField = driver.findElement(By.id("username"));
		usernameField.sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//Click on the Login button.
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on the CRM/SFA link.
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		//Click on the Contacts button.
		driver.findElement(By.linkText("Contacts")).click();
		//Click on Merge Contacts.
		driver.findElement(By.linkText("Merge Contacts")).click();
		//Click on the widget of the "From Contact".
		driver.findElement(By.xpath("//input[@id='partyIdFrom']//following::img")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listOfWindows=new ArrayList<String>(windowHandles);
		driver.switchTo().window(listOfWindows.get(listOfWindows.size()-1));
		//Click on the first resulting contact.
		driver.findElement(By.xpath("//div[@class='x-grid3-row   ']//tr//td//a")).click();
		driver.switchTo().window(listOfWindows.get(0));
		//Click on the widget of the "To Contact".
		driver.findElement(By.xpath("//input[@id='partyIdTo']//following::img")).click();
		Set<String> windowHandless = driver.getWindowHandles();
		List<String> listOfWindowss=new ArrayList<String>(windowHandless);
		driver.switchTo().window(listOfWindowss.get(listOfWindowss.size()-1));
		//Click on the second resulting contact.
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//tr//td//a)[6]")).click();
		driver.switchTo().window(listOfWindowss.get(0));
		//Click on the Merge button.
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		//Accept the alert.
		driver.switchTo().alert().accept();
		//Verify the title of the page.
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println("Page Title "+title);
		if(title.equals("View Contacts | opentaps CRM")) {
			System.out.println("Title Verified");
		}else {
			System.out.println("Title Verification failed");
		}
		
		


	}

}
