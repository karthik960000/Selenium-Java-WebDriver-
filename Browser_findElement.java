package Auto2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_findElement {
	public static void main(String[] args)  {
		WebDriver driver =new ChromeDriver() ;
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/downloads/");
		
		if(driver.getTitle().equals("Downloads | Selenium")) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Testcase fail");
		}
		
		WebElement Ver=driver.findElement(By.xpath("//p[text()='Java']/../p[2]"));
		System.out.println(Ver.getText());
		driver.close();
	}
}
