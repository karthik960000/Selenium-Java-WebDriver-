package Auto2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_redbus_title2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.redbus.in/");
		System.out.println(driver.getTitle());
		if(driver.getTitle().contains("Booking Online"))
	{
			System.out.println("Test case pass");
		}

		else {
			System.out.println("Testcase fail");

		}
	/*	driver.navigate().to("https://www.confirmtkt.com/rbooking-d/");
		driver.manage().window().minimize();
		System.out.println(driver.getTitle());
		if(driver.getTitle().contains("booking Online"))
	{
			System.out.println("Test case pass");
		}

		else {
			System.out.println("Testcase fail");
		}*/
		/*driver.navigate().to("https://in.bookmyshow.com/");
		driver.manage().window().minimize();
		System.out.println(driver.getTitle());
		if(driver.getTitle().contains("booking Online"))
	{
			System.out.println("Test case pass");
		}

		else {
			System.out.println("Testcase fail");
		}*/
		
		driver.close();
	}

}
