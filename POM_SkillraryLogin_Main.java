package POM_class;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM_SkillraryLogin_Main {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/");
		if(driver.getCurrentUrl().equals("https://demoapp.skillrary.com/")) {
			System.out.println("testCase Pass");
		}
		else {
			System.out.println("Testcase Fail");
		}
		
		POM_skillraryLogin sk1=new POM_skillraryLogin(driver);
		
		sk1.getLogin().click();
		Thread.sleep(2000);
		sk1.getEmail().sendKeys("admin@gmail.com");
		Thread.sleep(2000);
		sk1.getPass().sendKeys("Admin@123");
		Thread.sleep(2000);
		sk1.getCheck().click();
		Thread.sleep(2000);
		sk1.getSubmit().click();
		driver.close();
	}

}
