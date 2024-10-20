package Auto2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.InterruptedException;
public class Locator1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement phone= driver.findElement(By.id("email"));
		phone.sendKeys("9985347888"); 
		Thread.sleep(2000);
		WebElement password =driver.findElement(By.id("pass"));
		password.sendKeys("loveisshit");
		Thread.sleep(2000);
		WebElement login= driver.findElement(By.name("login"));
		login.click();
		if(driver.getCurrentUrl().equals("https://www.facebook.com/checkpoint")) {
			System.out.println("Test Case Pass");
			
		}
		else {
			System.out.println("Test Case Fail");
			
		}

	}

}
