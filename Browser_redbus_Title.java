package Auto2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_redbus_Title {

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
		driver.close();
	}

}
