package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_click {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		if(driver.getTitle().contains("Window")) {
			System.out.println("Test URL pass");
		}
		else {
			System.out.println("Test URL fail");
		}
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement newwindow=driver.findElement(By.id("newWindowBtn"));
		js.executeScript("arguments[0].click()",newwindow);
		Thread.sleep(2000);
		
	}
}
