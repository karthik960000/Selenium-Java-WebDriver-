package DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_login {	

			public static void main(String[] args) throws InterruptedException, IOException {
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
			FileInputStream fn=new FileInputStream("./Test/FB_log.properties");
			Properties p1=new Properties();
			p1.load(fn);
			WebElement email=driver.findElement(By.id("email"));
			email.sendKeys(p1.getProperty("Email"));
			Thread.sleep(2000);
			WebElement pass=driver.findElement(By.id("pass"));
			pass.sendKeys(p1.getProperty("password"));
			Thread.sleep(2000);
			WebElement login=driver.findElement(By.name("login"));
			login.click();
			Thread.sleep(2000);
			FileOutputStream fo=new FileOutputStream("./Test/Data_output.properties");
			p1.store(fo,"Data is Stored");
			System.out.println("Data Stored");
			driver.close();
			
	}

}
