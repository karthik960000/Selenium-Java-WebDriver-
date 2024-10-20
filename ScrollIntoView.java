package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		if(driver.getTitle().contains("Demo")) {
			System.out.println("Test URL pass");
		}
		else {
			System.out.println("Test URL fail");
		}
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement Customer=driver.findElement(By.xpath("//h3[text()='Customer service']"));
//		js.executeScript("arguments[0].scrollIntoView(true)",Customer);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(false)",Customer);
		Thread.sleep(2000);
		driver.close();
		
	}

}
