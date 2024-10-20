package Auto2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.InterruptedException;
public class Browser_findElements_2 {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver =new ChromeDriver() ;
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.selenium.dev/downloads/");
		
		if(driver.getTitle().equals("Downloads | Selenium")) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Testcase fail");
		}
		Thread.sleep(2000);
		WebElement Ver=driver.findElement(By.xpath("//p[text()='C#']/../p[2]"));
		System.out.println(Ver.getText()+" C#");
	
		Thread.sleep(2000);
		WebElement Ver1=driver.findElement(By.xpath("//p[text()='Ruby']/../p[2]"));
		System.out.println(Ver1.getText()+" Ruby");
	
		Thread.sleep(2000);
		WebElement Ver2=driver.findElement(By.xpath("//p[text()='Java']/../p[2]"));
		System.out.println(Ver2.getText()+" Java");

		Thread.sleep(2000);
		WebElement Ver3=driver.findElement(By.xpath("//p[text()='Python']/../p[2]"));
		System.out.println(Ver3.getText()+" Python");

		Thread.sleep(2000);
		WebElement Ver4=driver.findElement(By.xpath("//p[text()='JavaScript']/../p[2]"));
		System.out.println(Ver4.getText()+" JavaScript");
		driver.close();
	}
}
