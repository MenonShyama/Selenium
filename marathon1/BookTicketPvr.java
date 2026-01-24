package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookTicketPvr {

	public static void main(String[] args) throws InterruptedException {
		//1. Launch the browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//2. Load the application URL
		driver.get("https://www.pvrcinemas.com/");
		//3. Select location as Chennai if not auto-detected
		driver.findElement(By.xpath("(//span[@class='cities-placed'])[2]")).click();
		driver.findElement(By.xpath("//h6[text()='Chennai']")).click();
		//4. Click on Cinema under Quick Book
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		//5. Select a cinema
		driver.findElement(By.xpath("//div[@id='cinema']//following::span")).click();
		//7. Select a movie
		driver.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper']//ancestor::span")).click();
		//6. Select date as Tomorrow
		driver.findElement(By.xpath("//li[@class='p-dropdown-item']//span[contains(text(),'Tomorrow')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='THALAIVAR THAMBI THALAIMAIYIL']")).click();
		//8. Select show time
		driver.findElement(By.xpath("//span[contains(text(),'10:45')]")).click();
		//9. Click on Book button
		driver.findElement(By.xpath("//div[@class='quick-lefts ']//span[text()='Book']")).click();
		//10. Accept Terms and Conditions
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		//11. Select any one available seat
		driver.findElement(By.xpath("//span[@id='SL.SILVER|E:15']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		//13. Capture and print Seat info from Booking Summary
		String seatNumber = driver.findElement(By.xpath("//div[@class='seat-number']")).getText();
		System.out.println("Seat Number is "+seatNumber);
		//14. Capture and print Grand Total from Booking Summary 12. Click on Proceed button
		String total = driver.findElement(By.xpath("//div[@class='grand-prices']//h6")).getText();
		System.out.println("Grand Total is ₹"+total);
		//15. Click on Continue button
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(5000);
		//16. Close the popup if displayed
		driver.findElement(By.xpath("(//div[contains(@class,'cross-icon')]//i)[2]")).click();
		//17. Capture and print current page title
		String pageTitle = driver.getTitle();
		System.out.println("Page Title is "+pageTitle);
		//18. Close the browser
		driver.quit();
				}

}
