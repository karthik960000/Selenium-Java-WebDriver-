package Auto2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.lang.InterruptedException;

public class Browser_facebook_single_Select_signup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		if(driver.getCurrentUrl().equals("https://www.facebook.com/")) {
			System.out.println("URL pass");
		}
		else {
			System.out.println("URL fail");
		}
		//driver.findElement(By.id("js_10n")).click();
		//driver.findElement(By.xpath("//a[contains(@class,'uiOverlayButton')]")).click();
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Martio");
		driver.findElement(By.name("lastname")).sendKeys("Martio");
		driver.findElement(By.name("reg_email__")).sendKeys("cooper4martin@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("cooper4martin");
		//step1
		WebElement day=driver.findElement(By.id("day"));
		//step2
		Select s1 =new Select(day);
		//step3
		s1.selectByIndex(28);
		Thread.sleep(2000);
		//step1
		WebElement month=driver.findElement(By.id("month"));
		//step2
		Select s2 =new Select(month);
		//step3
		s2.selectByValue("8");
			Thread.sleep(2000);	
		WebElement year=driver.findElement(By.id("year"));
		//step2
		Select s3 =new Select(year);
		//step3
		s3.selectByValue("2000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.name("websubmit")).click();
		if(driver.getTitle().contains("Facebook")) {
			System.out.println("Sign up success");
		}
		else
		driver.close();
	}

}
