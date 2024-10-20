package DDT;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import POM_class.POM_Webshop;

public class Task_POM_log_prop_main {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		FileInputStream fn= new FileInputStream("./Test/Demo_log.properties");
		Properties p1= new Properties();
		p1.load(fn);
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(p1.getProperty("url"));
		if(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/")) {
			System.out.println("Testcase pass");
		}
		else {
			System.out.println("Testcase Fail");
		}
		Task_POM_Demo ws=new Task_POM_Demo(driver);
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
		ws.getFirst().sendKeys(p1.getProperty("firstname"));
		Thread.sleep(2000);
		ws.getLast().sendKeys(p1.getProperty("lastname"));
		Thread.sleep(2000);
		ws.getEmail().sendKeys(p1.getProperty("email"));
		Thread.sleep(2000);
		ws.getPassword().sendKeys(p1.getProperty("password"));
		Thread.sleep(2000);
		ws.getConfirm().sendKeys(p1.getProperty("confirm"));
		Thread.sleep(2000);
		ws.getSubmit().click();

	}

}
