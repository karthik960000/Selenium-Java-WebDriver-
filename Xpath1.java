package Auto2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.InterruptedException;
public class Xpath1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		if(driver.getCurrentUrl().equals("https://www.facebook.com/")) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("cooper4martin@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("Martinlutherking3");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@value,'1')]")).click();
		Thread.sleep(2000);
		if(driver.getCurrentUrl().equals("https://www.facebook.com/?sk=welcome")) {
			System.out.println("Testcase pass");
		}
		else {
			System.out.println("Test case fail");
		}
	}
}
