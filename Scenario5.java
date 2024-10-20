package Auto2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.InterruptedException;
public class Scenario5 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().minimize();
	driver.get("https://youtube.com/");
	
	Dimension size =driver.manage().window().getSize();
	System.out.println(size.height);
	System.out.println(size.width);
	Point con = driver.manage().window().getPosition();
	System.out.println(con.x);
	System.out.println(con.y);
	Thread.sleep(2000);
	driver.quit();
}
}
