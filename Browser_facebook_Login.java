package Auto2;

import java.time.Duration;
import java.lang.InterruptedException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser_facebook_Login {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		if(driver.getCurrentUrl().equals("https://www.facebook.com/")) {
			System.out.println("URL Pass");
		}
		else {
			System.out.println("URL Fail");
		}
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		
		WebElement email=driver.findElement(By.id("email"));
		wait.until(ExpectedConditions.visibilityOf(email)).sendKeys("cooper4martin@gmail.com");
		WebElement pass=driver.findElement(By.id("pass"));
		wait.until(ExpectedConditions.visibilityOf(pass)).sendKeys("Martinlutherking3");
		WebElement name=driver.findElement(By.name("login"));
		wait.until(ExpectedConditions.elementToBeClickable(name)).click();
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
