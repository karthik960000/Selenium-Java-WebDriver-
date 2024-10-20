package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		if(driver.getCurrentUrl().equals("https://www.facebook.com/")) {
			System.out.println("URL pass");
		}
		else {
			System.out.println("URL Fail");
		}
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement username=driver.findElement(By.id("email"));
		js.executeScript("arguments[0].value='cooper4martin@gmail.com';", username);
		Thread.sleep(2000);
		WebElement pass=driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].value='Martinlutherking3';", pass);
		WebElement submit=driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", submit);
		driver.close();
	}

}
