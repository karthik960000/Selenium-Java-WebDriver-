package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_Assert{

	WebDriver driver;
	@BeforeMethod
	public void Open() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		if(driver.getCurrentUrl().equals("https://www.facebook.com/")) {
			Reporter.log("Facebook opened");
		}
		else {
			Reporter.log("Fabebook Not opened");
		}
	}
	@Test
	public void Login() throws InterruptedException {
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("Cooper4Martin@gmail.com");
		Thread.sleep(2000);
		WebElement pass= driver.findElement(By.id("pass"));
		pass.sendKeys("Martinlutherking3");
		Thread.sleep(2000);
		WebElement submit=driver.findElement(By.name("login"));
		submit.click();
		String title=driver.getTitle();
//		Assert.assertEquals("Facebook",title);
		SoftAssert s1= new SoftAssert();
		s1.assertEquals("Facebook", title);
		Reporter.log(title,true);
		s1.assertAll();
		
		
	}
	@AfterMethod
	public void Close() {
		driver.close();
	}
}
