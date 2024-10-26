package Auto2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.InterruptedException;
public class Locator3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement Register = driver.findElement(By.linkText("Register"));
		Register.click();
		if(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/register")) {
			System.out.println("Clicked on Register");
		}
		else {
			System.out.println("Failed to click on Register");
		}
		
		  Thread.sleep(2000);
		  driver.findElement(By.id("gender-male")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("FirstName")).sendKeys("Mart");
		  Thread.sleep(1000);
		  driver.findElement( By.id("LastName")).sendKeys("Cooper");
		  Thread.sleep(1000);
		   driver.findElement(By.id("Email")).sendKeys("Samplewww@gmail.com");
		   Thread.sleep(2000);
		   driver.findElement(By.id("Password")).sendKeys("Password12");
		   Thread.sleep(2000);
		   driver.findElement(By.id("ConfirmPassword")).sendKeys("Password12");
		   Thread.sleep(2000);
		   driver.findElement(By.name("register-button")).click();
		   Thread.sleep(2000); 
		   WebElement Logout = driver.findElement(By.linkText("Log out"));
			Logout.click();
			if(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/")) {
				System.out.println("Logged Out");
			}
			else {
				System.out.println("Failed To log Out");
			}
			

	}

}
