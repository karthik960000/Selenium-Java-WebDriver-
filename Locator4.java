package Auto2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.InterruptedException;
public class Locator4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
//		WebElement forgot = driver.findElement(By.partialLinkText("Forgotten"));
//		forgot.click();
//		Thread.sleep(2000);
//		WebElement phone= driver.findElement(By.id("identify_email"));
//		phone.sendKeys("9985347888"); 
//		if(driver.getCurrentUrl().equals("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0")) {
//			System.out.println("Test case pass");
//		}
//		else {
//			System.out.println("test case fail");}
//		Thread.sleep(2000);
//		driver.findElement(By.id("did_submit")).click();
//		Thread.sleep(2000);
//		driver.close();

		driver.findElement(By.xpath("(//span[@class='_aa4a'])[1]")).sendKeys("Karthik");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/(//input[@aria-required='true'])[2]")).sendKeys("Karthik");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[contains(@class,'_acan')])[1]")).click();
	}
	
}
