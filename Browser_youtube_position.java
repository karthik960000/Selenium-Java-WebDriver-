package Auto2;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.lang.InterruptedException;
public class Browser_youtube_position{
	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().minimize();
		//driver.manage().window().maximize();
		//driver.manage().window().fullscreen(); 
		driver.get("https://www.youtube.com/");
		Point con = driver.manage().window().getPosition();
		System.out.println(con.x);
		System.out.println(con.y);
		Thread.sleep(2000);
		driver.quit();	
	}
}