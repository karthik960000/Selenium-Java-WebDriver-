package POM_class;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class POM_FB_reg_Main {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		if(driver.getTitle().contains("Facebook")) {
			System.out.println("Testcase Pass");
		}
		else {
			System.out.println("Testcase Fail");
		}
		POM_FB_reg fb1=new POM_FB_reg(driver);
		fb1.getCreate().click();
		Thread.sleep(2000);
		fb1.getFirst().sendKeys("Martin");
		Thread.sleep(2000);
		fb1.getLast().sendKeys("Luther");
		Thread.sleep(2000);
		Select s1=new Select(fb1.getDay());
		s1.selectByVisibleText("24");
		Thread.sleep(2000);
		Select s2=new Select(fb1.getMonth());
		s2.selectByVisibleText("May");
		Thread.sleep(2000);
		Select s3=new Select(fb1.getYear());
		s3.selectByVisibleText("2004");
		Thread.sleep(2000);
		fb1.getGender().click();
		Thread.sleep(2000);
		fb1.getEmail().sendKeys("Cooper4martin@gmail.com");
		Thread.sleep(2000);
		fb1.getPassword().sendKeys("Marthik@123");
		Thread.sleep(2000);
		fb1.getSubmit().click();
		Thread.sleep(2000);
		driver.close();
		
		}

}
