package Auto2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_findElement_2 {

	public static void main(String[] args) throws java.lang.InterruptedException   {
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
	List<WebElement> auto=driver.findElements(By.xpath("//div[contains(@class,'left-pane-results-container')]"));
	for (WebElement a1 : auto) {
	System.out.println(a1.getText());
		driver.close();
	}
	}

	}


