package DDT;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_login {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fn= new FileInputStream("./Test/Datalogin.properties");
		
		Properties p1= new Properties();
		p1.load(fn);
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(p1.getProperty("url"));
		 if (driver.getCurrentUrl().equals("https://www.facebook.com/")) {
	            System.out.println("URL Verification Passed: ");
	        } else {
	            System.out.println("URL Verification Failed! Expected: " );
	        }
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys(p1.getProperty("username"));
		Thread.sleep(2000);
		WebElement pass=driver.findElement(By.id("pass")); 
		pass.sendKeys(p1.getProperty("password"));
		Thread.sleep(2000);
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		Thread.sleep(2000);
		driver.close();
	}

}
