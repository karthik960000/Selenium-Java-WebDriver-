package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		if(driver.getTitle().contains("Online")) {
			System.out.println("Test URL pass");
		}
		else {
			System.out.println("Test URL fail");
		}
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,400)");
		js.executeScript("window.scrollTo(0,400)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,-400)");
		js.executeScript("window.scrollTo(0,-400)");
		Thread.sleep(2000);
		driver.close();
	}


}
