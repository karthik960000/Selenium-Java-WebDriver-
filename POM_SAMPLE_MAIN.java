package POM_class;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM_SAMPLE_MAIN {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		if(driver.getCurrentUrl().equals("https://www.facebook.com/")) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fails");
		}
		POM_SAMPLE p1=new POM_SAMPLE(driver);
		p1.getemail().sendKeys("999999999");
		Thread.sleep(2000);
		p1.getpass().sendKeys("Karthik");
		Thread.sleep(2000);
		p1.getlogin().click();
		
		driver.close();

	}

}
