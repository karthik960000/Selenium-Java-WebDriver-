package Auto2;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

//import graphql.schema.idl.errors.NotAnOutputTypeError;

import java.io.File;
import java.io.IOException;
import java.lang.InterruptedException;
import java.time.Duration;

public class Browser_Amazon_take_Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement pic= driver.findElement(By.xpath("//img[@data-image-index='2']"));
		TakesScreenshot ts=(TakesScreenshot)driver;
		 File temp=ts.getScreenshotAs(OutputType.FILE);
		 File perm=new File("./ScreenShot1/amg2.png");
		 FileHandler.copy(temp,perm);
		Thread.sleep(3000);
		driver.close();
	}

}

