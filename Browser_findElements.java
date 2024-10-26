package Auto2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.InterruptedException;

public class Browser_findElements {

	public static void main(String[] args) throws InterruptedException  {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	if(driver.getCurrentUrl().equals("https://www.amazon.in/")) {
		System.out.println("Test case pass");
	}
	else {
		System.out.println("Test case fail");

	}
	Thread.sleep(2000);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
	Thread.sleep(2000);
	driver.findElement(By.id("nav-search-submit-button")).click();
	List<WebElement> apple = driver.findElements(By.xpath("//span[contains(text(),'Apple')]"));
	for (WebElement a1 : apple) {
		System.out.println(a1.getText());
		
	}
driver.close();
	}

	}


