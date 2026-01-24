package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

public class PVR {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.pvrcinemas.com/");
		driver.findElement(By.xpath("(//span[@class='cities-placed'])[2]")).click();
		driver.findElement(By.xpath("//h6[text()='Chennai']")).click();
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		driver.findElement(By.xpath("//div[@id='cinema']//following::span")).click();
		driver.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper']//ancestor::span")).click();

		driver.findElement(By.xpath("//li[@class='p-dropdown-item']//span[contains(text(),'Tomorrow')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='THALAIVAR THAMBI THALAIMAIYIL']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'10:45')]")).click();
		driver.findElement(By.xpath("//div[@class='quick-lefts ']//span[text()='Book']")).click();
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		driver.findElement(By.xpath("//span[@id='SL.SILVER|E:13']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		String seatNumber = driver.findElement(By.xpath("//div[@class='seat-number']")).getText();
		System.out.println("Seat Number is "+seatNumber);
		String total = driver.findElement(By.xpath("//div[@class='grand-prices']//h6")).getText();
		System.out.println("Grand Total is ₹"+total);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[contains(@class,'cross-icon')]//i)[2]")).click();
		String pageTitle = driver.getTitle();
		System.out.println("Page Title is "+pageTitle);
				}

}
