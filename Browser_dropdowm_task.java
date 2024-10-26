package Auto2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.lang.InterruptedException;

public class Browser_dropdowm_task {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		if(driver.getCurrentUrl().equals("https://demoapps.qspiders.com/"))
			System.out.println("navigated to demo qspiders application");
		else
			System.out.println("not able to navigate to demo qspiders application");
		
		System.out.println("--------------------------------------");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//p[text()=\"UI Testing Concepts\"]")).click();		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//section[text()=\"Dropdown\"]")).click();
		Thread.sleep(3000);
		
		if(driver.getCurrentUrl().equals("https://demoapps.qspiders.com/ui/dropdown?sublist=0"))
			System.out.println("navigated to dropdown page");
		else
			System.out.println("not able to navigate to dropdown page");
		
		System.out.println("--------------------------------------");
		
		driver.findElement(By.xpath("(//a[contains(@class,'poppins')])[2]")).click();
		
		if(driver.getCurrentUrl().equals("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1"))
			System.out.println("navigated to multi select");
		else
			System.out.println("not able to navigate to multi select");
		
		Thread.sleep(1000);
		
		WebElement phn=driver.findElement(By.id("keypoint"));
		phn.sendKeys("1234567890");
		
		WebElement gender=driver.findElement(By.id("select40"));
		Select sel=new Select(gender);
		sel.selectByVisibleText("Male");
		Thread.sleep(1000);
		
		WebElement country=driver.findElement(By.xpath("(//select[@id=\"select-multiple-native\"])[1]"));
		sel=new Select(country);
		sel.selectByVisibleText("India");
		
		WebElement state=driver.findElement(By.xpath("(//select[@id=\"select-multiple-native\"])[2]"));
		sel=new Select(state);
		sel.selectByVisibleText("Telangana");
		Thread.sleep(2000);
		sel.selectByVisibleText("Andhra Pradesh");
		Thread.sleep(2000);
		
		WebElement city=driver.findElement(By.xpath("(//select[@id=\"select-multiple-native\"])[3]"));
		sel=new Select(city);
		sel.selectByVisibleText("Hyderabad");
		Thread.sleep(2000);
		sel.selectByVisibleText("Guntur");
		Thread.sleep(2000);
		
		WebElement quantity=driver.findElement(By.xpath("(//select[contains(@class,'placeholder-blueGray-300')])[3]"));
		sel=new Select(quantity);
		sel.selectByVisibleText("2");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		
		if(driver.getCurrentUrl().equals("https://demoapps.qspiders.com/ui/radio?sublist=0"))
			System.out.println("navigated to radio button page");
		else
			System.out.println("not able to navigate to radio button page");
		
		System.out.println("--------------------------------------");
		
		driver.findElement(By.id("attended8")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("willing1")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("btn")).click();
		Thread.sleep(3000);
		
		if(driver.getCurrentUrl().equals("https://demoapps.qspiders.com/ui/checkbox?sublist=0"))
			System.out.println("navigated to check box page");
		else
			System.out.println("not able to navigate to check box page");
		
		System.out.println("--------------------------------------");
		
		driver.findElement(By.id("domain1")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("mode1")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("mode2")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("mode5")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value=\"Continue\"]")).click();
		Thread.sleep(3000);
		
		if(driver.getCurrentUrl().equals("https://demoapps.qspiders.com/ui/toggle?sublist=0"))
			System.out.println("navigated to toggle button page");
		else
			System.out.println("not able to navigate to toggle button page");
		
		System.out.println("--------------------------------------");
		
		driver.findElement(By.xpath("(//span[contains(@class , 'relative')])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[contains(@class , 'relative')])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[contains(@class , 'relative')])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[contains(@class , 'relative')])[5]")).click();
		Thread.sleep(1000);

		System.out.println(driver.findElement(By.xpath("(//p)[9]")).getText());
		System.out.println(driver.findElement(By.xpath("(//p)[10]")).getText());
		System.out.println(driver.findElement(By.xpath("(//p)[11]")).getText());
		System.out.println(driver.findElement(By.xpath("(//p)[12]")).getText());
		System.out.println("------------------------------------------------------------------------------");
		
		
		Thread.sleep(2000);
		driver.findElement(By.id("togglers")).click();
		Thread.sleep(2000);
		
		
		System.out.println(driver.findElement(By.xpath("//p[2]")).getText());
		
		driver.quit();

		
		
	}
}