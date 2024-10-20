package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Javascript {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		JavascriptExecutor ja=(JavascriptExecutor)driver;
		//Navigate to Application
		ja.executeScript("window.location=arguments[0]","https://www.facebook.com/");
		//title of the Application
		System.out.println(ja.executeScript("return document.title"));
		//read current url
		System.out.println(ja.executeScript("return document.URL"));
		//refresh the page
		ja.executeScript("history.go(0)");
		Thread.sleep(2000);
		driver.close();
	}

}
