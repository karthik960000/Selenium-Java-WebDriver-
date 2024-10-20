package POM_class;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM_facebook_main {

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
		POM_facebook p=new POM_facebook(driver);
		p.getemail().sendKeys("9089786534");
		Thread.sleep(2000);
		p.getemail().clear();
		driver.navigate().refresh();
		Thread.sleep(2000);
		p.getemail().sendKeys("9999999999");
		Thread.sleep(2000);	
		p.getpass().sendKeys("shinchanHIMA");
		Thread.sleep(2000);
		p.getlogin().click();
		Thread.sleep(2000);
		driver.close();

	}

}
