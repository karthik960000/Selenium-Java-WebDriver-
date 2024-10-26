package Auto2;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Browser_drop_downs {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.hyrtutorials.com/");
		if(driver.getCurrentUrl().equals("https://www.hyrtutorials.com/")) {
			System.out.println("URL pass");
		}
		else {
			System.out.println("URL fail");
		}
		driver.findElement(By.xpath("//a[contains(text(),'Selenium Practice')]")).click();
		driver.findElement(By.xpath("//a[text()='Dropdowns']")).click();
		WebElement course=driver.findElement(By.id("course"));
		Select s=new Select(course);
		 List<WebElement> options = s.getOptions();
		 TreeSet t1= new TreeSet();
		 for(WebElement e1:options) {
			 t1.add(e1.getText());
			 
		 }
		 Iterator i =t1.iterator();
		while(i.hasNext()) {
			 System.out.println(i.next());
		 }
		System.out.println("___________________");
		Iterator i1= t1.descendingIterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		
		 driver.close();
	}

}
