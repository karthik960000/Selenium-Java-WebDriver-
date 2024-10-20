package Auto2;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_RedBus {
	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(new URL("https://www.redbus.in/"));
		//URL url =new URL("https://www.redbus.in/");
		System.out.println(driver.getTitle());
		if( driver.getTitle().contains("Booking Online")) {
			System.out.println("Test Case Pass");
		}
		else {
			System.out.println("test case fail");
		}
		driver.close();
		}
		
	}

