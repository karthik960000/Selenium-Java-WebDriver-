package Auto2;

import java.time.Duration;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.lang.InterruptedException;

public class Browser_Multiselect_dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		if(driver.getCurrentUrl().equals("https://demoapps.qspiders.com/ui?scenario=1")) {
			System.out.println("Test case passed");
		}else {
			System.out.println("Test case failed");
		}
		Thread.sleep(2000);
		driver.findElement(By.linkText("Dropdown")).click();
		if(driver.getCurrentUrl().equals("https://demoapps.qspiders.com/ui/dropdown")) {
			System.out.println("URL pass");
		}else {
			System.out.println("URL fail");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
		driver.findElement(By.id("phone")).sendKeys("9748269420");
		WebElement gender=driver.findElement(By.id("select2"));
		Select s1=new Select(gender);
		s1.selectByValue("male");
		Thread.sleep(2000);
		
		WebElement country=driver.findElement(By.id("select3"));
		s1=new Select(country);
		s1.selectByVisibleText("India");
		Thread.sleep(2000);
		
		WebElement state=driver.findElement(By.id("select5"));
		s1=new Select(state);
		s1.selectByVisibleText("Telangana");
		Thread.sleep(2000);
		
		WebElement city=driver.findElement(By.xpath("(//select[contains(@class,'shadow')])[4]"));
		s1=new Select(city);
		s1.selectByVisibleText("Hyderabad");
		
		WebElement quantity=driver.findElement(By.id("select7"));
		s1=new Select(quantity);
		s1.selectByIndex(2);
		
		driver.findElement(By.id("continuebtn")).click();
		Thread.sleep(2000);
		
		if(driver.getCurrentUrl().equals("https://demoapps.qspiders.com/ui/radio?sublist=0")) {
			System.out.println("Test case passed");
		}else {
			System.out.println("Test case failed");
		}
		driver.findElement(By.xpath("//input[@value='cod']")).click();
		driver.findElement(By.xpath("//input[@value='home']")).click();
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(2000);
		
		if(driver.getCurrentUrl().equals("https://demoapps.qspiders.com/ui/checkbox?sublist=0")) {
			System.out.println("Test Case Pass");
		}else {
			System.out.println("Test Case Fail");
		}
		driver.findElement(By.id("domain1")).click();
		driver.findElement(By.id("mode2")).click();
		driver.findElement(By.id("mode6")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		Thread.sleep(2000);
		
		if(driver.getCurrentUrl().equals("https://demoapps.qspiders.com/ui/toggle?sublist=0")) {
			System.out.println("Test Case Pass");
		}else {
			System.out.println("Test Case Fail");
		}
		driver.findElement(By.xpath("(//span[contains(@class,'relative')])[2]")).click();
		driver.findElement(By.xpath("(//span[contains(@class,'absolute')])[2]")).click();
		driver.findElement(By.xpath("(//span[contains(@class,'relative')])[4]")).click();
		driver.findElement(By.xpath("(//span[contains(@class,'absolute')])[4]")).click();
		driver.findElement(By.id("togglers")).click();
		Thread.sleep(2000);
		
		if(driver.getCurrentUrl().equals("https://demoapps.qspiders.com/ui/image?sublist=0")) {
			System.out.println("Test Case Pass");
		}else {
			System.out.println("Test Case Fail");
		}
		WebElement order = driver.findElement(By.xpath("//p[contains(text(),'successfully')]"));
		String text=order.getText();
		System.out.println(text);
		
		driver.close();
		
	}

}