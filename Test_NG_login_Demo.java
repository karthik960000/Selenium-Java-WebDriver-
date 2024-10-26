package TestNG;

//import java.sql.Time;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_NG_login_Demo {
	WebDriver driver;
	@BeforeMethod
	public void OpenBrowser() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/login");
		Reporter.log("Browse Opened",true);
		
	}
	@Test
	public void Login() {
		driver.findElement(By.id("Email")).sendKeys("Martin4cooper@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Password123");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		Reporter.log("Input given",true);
		
	}
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
		Reporter.log("Browse closed",true);
	}

}
