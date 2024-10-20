package Auto2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.lang.InterruptedException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_google_list_of_elements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.co.in/");
		if(driver.getCurrentUrl().equals("https://www.google.co.in/")) {
			System.out.println("URL test pass");
		}
		else {
			System.out.println("URL test fail");
	}

		WebElement search=driver.findElement(By.id("APjFqb"));
		search.sendKeys("Java");
		Thread.sleep(2000);
//		List <WebElement> list=driver.findElements(By.xpath("//span[text()='java']"));
//		Thread.sleep(2000);
//		for(WebElement l1:list) {
//			System.out.println(l1.getText());
//		}
		search.clear();
		Thread.sleep(2000);
//		driver.navigate().refresh();
//		Thread.sleep(2000);
//		System.out.println("______________________________________");
//		Thread.sleep(2000);
//		search.sendKeys("Selenium");
//		List <WebElement> list1=driver.findElements(By.xpath("//span[text()='selenium']"));
//		Thread.sleep(2000);
//		for(WebElement l2:list1) {
//			System.out.println(l2.getText());
//		}
//		if(driver.getCurrentUrl().equals(list)) {
//			System.out.println("Last Test Pass");
//		}
//		else {
//			System.out.println("Last test Fail");
//		}
		driver.close();

		
}

	}
