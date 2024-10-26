package Auto2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_dropdown_sample {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		if(driver.getCurrentUrl().equals("https://demoapps.qspiders.com/ui?scenario=1")) {
			System.out.println("URL pass");
		}
		else {
			System.out.println("URL fail");
		}
		driver.findElement(By.xpath("//section[contains(text(),'Dropdown')]")).click();
}
}
