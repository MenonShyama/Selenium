package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonProductSearch {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 *    10. Capture and print the page
		 * title 11. Close the browser
		 */
		//1. Launch the browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//3. Add implicit wait using driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30))
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//2. Load the application URL
		driver.get("https://www.amazon.in/");
		//4. Enter "Bags for boys" in the search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		//5. Select the searched suggestion or result for "bags for boys"
		driver.findElement(By.id("nav-search-submit-button")).click();
		// 6. Capture and print the total number of search results displayed 
		String totalCount = driver.findElement(By.xpath("//h2/span")).getText();
		System.out.println(totalCount+" Bags for boys");
		//7. Select the first two brands from the left-side filter menu
		driver.findElement(By.xpath("//span[text()='Skybags']//preceding-sibling::div//i")).click();
		driver.findElement(By.xpath("//span[text()='Gear']//preceding-sibling::div//i")).click();
		Thread.sleep(3000);
		//8. Apply sorting by selecting "New Arrivals"
		//driver.findElement(By.xpath("//i[@class='a-icon a-icon-dropdown']")).click();
		WebElement sortDropDown = driver.findElement(By.id("s-result-sort-select"));
		Select dropdown=new Select(sortDropDown);
		dropdown.selectByVisibleText("Newest Arrivals");
		//9. Capture and print the first product details (name and discounted price)
		String name=driver.findElement(By.xpath("//div[contains(@class,'a-row a-size-base a-color-secondary')]//following-sibling::a")).getText();
		System.out.println("Name of the product is ");
		System.out.println(name); 
		String price = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("Discounted price of the product is "+price);
		driver.quit();
	}

}
