package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAssignment {

	public static void main(String[] args) {
		//Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		//Maximize the browser window
		driver.manage().window().maximize();
		//Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//https://www.leafground.com/alert.xhtml
		driver.navigate().to("https://www.leafground.com/alert.xhtml");
		//Click on the "Prompt Box" button to trigger the alert.
		driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']//following::span")).click();
		//Switch to the alert and type a message in the alert box.
		driver.switchTo().alert().sendKeys("Shyama");
		//Dismiss the alert
		driver.switchTo().alert().dismiss();
		//Retrieve the typed text from the alert and verify it.
		String text = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println(text);
		
	}

}
