package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Reg_win {
	WebDriver driver;
	@BeforeMethod
	public void OpenBrowser() throws InterruptedException {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(2000);
		
	}
	@Test
	public void Signup() throws InterruptedException {
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.id("FirstName")).sendKeys("Martil");
	driver.findElement(By.id("LastName")).sendKeys("Coop");
	Thread.sleep(2000);
	driver.findElement(By.id("Email")).sendKeys("Cooper4martin@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("MartilCoop1");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("MartilCoop1");
	Thread.sleep(3000);
	driver.findElement(By.id("register-button")).click();
	}
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

}
