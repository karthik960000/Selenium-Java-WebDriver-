package Auto2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.InterruptedException;
public class Browser_newtab_button {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	Thread.sleep(2000);
	String wid = driver.getWindowHandle();
	System.out.println(wid);
	driver.findElement(By.id("newTabBtn")).click();
	driver.close();
	driver.quit();
	
}
}
