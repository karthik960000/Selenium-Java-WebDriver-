package POM_class;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM_Webshop_main {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		if(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/")) {
			System.out.println("Testcase pass");
		}
		else {
			System.out.println("Testcase Fail");
		}
		POM_Webshop ws=new POM_Webshop(driver);
		ws.getReg().click();
		Thread.sleep(2000);
		if(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/register")) {
			System.out.println("registration");
		}
		else {
			System.out.println("not Registration");
		}
		ws.getGender().click();
		Thread.sleep(2000);
		ws.getFirst().sendKeys("karthik");
		Thread.sleep(2000);
		ws.getLast().sendKeys("Sai");
		Thread.sleep(2000);
		ws.getEmail().sendKeys("Admin@gmail.com");
		Thread.sleep(2000);
		ws.getPassword().sendKeys("Password123");
		Thread.sleep(2000);
		ws.getConfirm().sendKeys("Password123");
		Thread.sleep(2000);
		ws.getSubmit().click();
		driver.close();

	}

}
