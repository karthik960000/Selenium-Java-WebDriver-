package Auto2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InterruptedException {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		if(driver.getCurrentUrl().equals("https://www.instagram.com/")) {
			System.out.println("URL PASS");
		}
		else {
			System.out.println("URL fail");
		}
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement login= driver.findElement(By.name("username"));
		wait.until(ExpectedConditions.visibilityOf(login)).sendKeys("mr_jocker_147");
		
		WebElement pass= driver.findElement(By.className("_aa4b _add6 _ac4d _ap35"));
		wait.until(ExpectedConditions.visibilityOf(pass)).sendKeys("loveisshit");
		
		WebElement pass1= driver.findElement(By.className(""));
		wait.until(ExpectedConditions.elementToBeClickable(pass1)).click();
		driver.close();
	}
}
