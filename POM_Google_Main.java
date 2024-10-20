package POM_class;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM_Google_Main {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		if(driver.getTitle().contains("Google")) {
			System.out.println("Test case Pass");
		}
		else {
			System.out.println("TestCase Fail");
		}
		POM_google g1=new POM_google(driver);
		g1.getSearch().sendKeys("Java");
		Thread.sleep(2000);
		g1.getSearch().clear();
		driver.navigate().refresh();
		g1.getSearch().sendKeys("Java & Selenium");
		Thread.sleep(2000);
		driver.close();
		
	}

}
