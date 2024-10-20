package Auto2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.InterruptedException;
public class Locator2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		 driver.findElement(By.id("Email")).sendKeys("20kt1a0586@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("Dongli123");
		Thread.sleep(2000);
		driver.findElement(By.id("RememberMe")).click();
		Thread.sleep(2000);
		 driver.findElement(By.cssSelector("input[value='Log in']")).click();

		if(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/login")) {
			System.out.println("Test Case Pass");
			driver.close();
		}
		else {
			System.out.println("Test Case Fail");
			driver.close();
		}

	}

}
